package finalExercises;

import java.util.Calendar;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Hi, how old are you?");
        int age = input.nextInt();
        System.out.println("That means you were born in " + (year - age));
        System.out.println("This means that in 20 years you will be " + (age + 20) + " years old!");
    }
}
