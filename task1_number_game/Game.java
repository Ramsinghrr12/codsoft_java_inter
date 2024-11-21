import java.util.Scanner;
import java.util.Random;

class Game {
    public static void main(String[] args) {
        System.out.println("Hey! Welcome to The Number Gaming!");
        int chances = 5;
        int userNum;

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("You have " + chances + " chances to guess the number!");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= chances; i++) {
            System.out.println("Chance " + i + ": Guess the number (1 to 100):");
            userNum = sc.nextInt();

            if (userNum == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break;
            } else if (userNum > randomNumber) {
                if (userNum - randomNumber > 10) {
                    System.out.println("Your number is too high.");
                } else {
                    System.out.println("Your number is high, but close!");
                }
            } else {
                if (randomNumber - userNum > 10) {
                    System.out.println("Your number is too low.");
                } else {
                    System.out.println("Your number is low, but close!");
                }
            }

            if (i < chances) {
                System.out.println("Try again! Remaining chances: " + (chances - i));
            } else {
                System.out.println("Game Over! The correct number was: " + randomNumber);
            }
        }

        sc.close();
    }
}
