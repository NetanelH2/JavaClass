package homeTasks;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int creditCardNumber = 12345678;
        String passcode = "ABCD";

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your credit card number: ");
            int creditCardNumberInput = input.nextInt();
            input.nextLine();  // Consume the newline character
            System.out.println("Enter your passcode: ");
            String passcodeInput = input.nextLine();

            if (creditCardNumberInput == creditCardNumber && passcodeInput.equals(passcode)) {
                System.out.println("Welcome to your account!");
                return;  // Exit the program after successful login
            } else {
                System.out.println("Your credit card number or passcode is incorrect! Try again.");
                System.out.println("You have " + (4 - i) + " attempts left.");
            }
        }

        System.out.println("You have no attempts left. Your account is blocked.");
    }
}