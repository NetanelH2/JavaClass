package homeTasks;

public class ComparisonTask {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 10;
        System.out.println("10 > 6 ? " + (number2 > number1));
        int number3 = 5;
        int number4 = 5;
        System.out.println("5 >= 5 ? " + (number3 >= number4));
        int number5 = 20;
        int number6 = 10;
        System.out.println("20 < 10 ? " + (number5 < number6));
        int number7 = 35;
        int number8 = 50;
        System.out.println("35 <= 50 ? " + (number7 <= number8));
        int number9 = 25;
        int number10 = 25;
        System.out.println("25 == 25 ? " + (number9 == number10));
        int number11 = 50;
        int number12 = 50;
        System.out.println("50 != 50 ? " + (number11 != number12));
        String string1 = "City";
        String string2 = "citY";
        System.out.println("City == citY ? " + (string1.equals(string2)));
        String string3 = "City";
        String string4 = "citY";
        System.out.println("City equals to citY ? " + (string3.equalsIgnoreCase(string4)));
    }
}
