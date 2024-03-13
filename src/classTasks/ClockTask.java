package classTasks;

import java.util.Scanner;

public class ClockTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 4 numbers only which present a time:");
        int userNumber = input.nextInt();
        int minutes = userNumber % 100;
        int hours = userNumber / 100;
        System.out.println(hours + ":" + minutes);
    }
}
