package classTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 3 Numbers:");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(number1);
            numbers.add(number2);
            numbers.add(number3);
            if (numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)) {
                System.out.println("The biggest number is: " + numbers.get(0));
            } else {
                if (numbers.get(1) > numbers.get(0) && numbers.get(1) > numbers.get(2)) {
                    System.out.println("The biggest number is: " + numbers.get(1));
                } else {
                    System.out.println("The biggest number is: " + numbers.get(2));
                }
            }
        }
    }