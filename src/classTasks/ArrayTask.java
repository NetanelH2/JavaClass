package classTasks;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int[] numbers = {number1, number2, number3};
        if (numbers[0] > numbers[1] && numbers[0] > numbers[2]) {
            System.out.println("The biggest number is: " + numbers[0]);
        } else {
            if (numbers[1] > numbers[0] && numbers[1] > numbers[2]) {
                System.out.println("The biggest number is: " + numbers[1]);
            } else {
                System.out.println("The biggest number is: " + numbers[2]);
            }
        }
    }
}
