import java.util.Scanner;

class Marks {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("      🌟 Student Grade Calculator 🌟     ");
        System.out.println("=========================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of subjects: ");
        int sub = sc.nextInt();

        int[] sub_marks = new int[sub];

        System.out.println("\nPlease enter the marks obtained in each subject (0-100):");
        for (int i = 0; i < sub; i++) {
            while (true) {
                System.out.print("   Subject " + (i + 1) + ": ");
                sub_marks[i] = sc.nextInt();

                if (sub_marks[i] >= 0 && sub_marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("   ❌ Invalid marks! Please enter marks between 0 and 100.");
                }
            }
        }

        int totalmarks = 0;
        for (int i = 0; i < sub; i++) {
            totalmarks += sub_marks[i];
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("🎯 Total Marks Obtained: " + totalmarks);

        int avg = totalmarks / sub;
        System.out.println("📊 Average Marks: " + avg);
        System.out.println("-----------------------------------------");

        System.out.print("📝 Final Grade: ");
        if (avg > 90) {
            System.out.println("A+ 🌟 Excellent!");
        } else if (avg > 80) {
            System.out.println("A 🎉 Great Job!");
        } else if (avg > 70) {
            System.out.println("B 👍 Good Effort!");
        } else if (avg > 60) {
            System.out.println("C 🙌 Keep Improving!");
        } else if (avg > 50) {
            System.out.println("D 🤔 Needs More Work");
        } else if (avg > 40) {
            System.out.println("E 😔 Just Passed");
        } else {
            System.out.println("F 💔 Failed");
        }

        System.out.println("-----------------------------------------");
        System.out.println("  ✨ Thank you for using the calculator! ✨");
        System.out.println("=========================================");

    }
}
