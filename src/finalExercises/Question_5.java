package finalExercises;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start = input.nextInt();
        System.out.println("Enter the end number:");
        int end = input.nextInt();
        System.out.println("Enter the first divide number:");
        int firstDivide = input.nextInt();
        System.out.println("Enter the second divide number:");
        int secondDivide = input.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % firstDivide == 0 && i % secondDivide == 0) {
                System.out.println(i);
            }
        }
    }
}
