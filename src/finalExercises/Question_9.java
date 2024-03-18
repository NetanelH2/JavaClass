package finalExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all numbers is: " + sum);
        System.out.println("The array is: " + Arrays.toString(numbers));
    }
}