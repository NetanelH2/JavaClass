package homeTasks;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        String password = input.nextLine();

        checkCredentials(userName, password);
    }
    static void checkCredentials(String userName, String password) {
        if (userName.equals("admin") && password.equals("1234")) {
            System.out.println("Welcome to the system! " + userName);
        } else {
            System.out.println("Wrong credentials!");
        }
    }
//    static void checkCredentials(String userName, String password) {
//        String message = (userName.equals("admin") && password.equals("1234")) ?
//                ("Welcome to the system! " + userName) :
//                "Wrong credentials!";
//    }
}