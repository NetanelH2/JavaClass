package finalExercises;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}