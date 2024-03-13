package homeTasks;

public class CheckNumbers {
    public static void main(String[] args) {
        int[] numbers = {0, 22, 55, 25, 10};
        for (int i = 0; i < numbers.length; i++) {
            checkNumbers(numbers[i]);
        }
    }
    static void checkNumbers(int a) {
        if (a % 2 == 0) {
            System.out.println("The Number is even, Number = " + a);
        } else {
            System.out.println("The Number is odd, Number = " + a);
        }
    }
}