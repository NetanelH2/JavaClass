package homeTasks;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstName = input.nextLine();
        System.out.println("Enter Your Last Name:");
        String lastName = input.nextLine();
        System.out.println("Enter Your City:");
        String city = input.nextLine();
        System.out.println("Enter Your Score Average:");
        int scoreAvg = input.nextInt();
        System.out.println("Enter Your Age:");
        int age = input.nextInt();

        System.out.println(firstName + ' ' + lastName + ' ' + city + ' ' + scoreAvg + ' ' + age);
    }
}
