package finalExercises;

import java.util.Random;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(99) + 1;
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 7) {
            System.out.println("Enter your guess:");
            int guess = input.nextInt();
            attempts++;
            if (guess == randomNum) {
                System.out.println("Congratulations! You've guessed the number.");
                break;
            } else if (guess < randomNum) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            if (attempts == 7) {
                System.out.println("Sorry, you've run out of attempts. The number was " + randomNum);
            }
        }
    }
}