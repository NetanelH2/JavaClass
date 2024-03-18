package finalExercises;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Please provide an integer value or 0 to terminate:");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Min value provided: " + min);
        System.out.println("Max value provided: " + max);
    }
}