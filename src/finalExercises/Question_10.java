package finalExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = input.nextInt();
            numbers.add(number);
            sum += number;
        }
        double average = (double) sum / numbers.size();
        System.out.println("The average of all numbers is: " + average);
        System.out.println("The array list is: " + numbers);
    }
}