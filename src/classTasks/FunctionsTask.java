package classTasks;

import java.util.ArrayList;

public class FunctionsTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printNumberList(numbers);
        System.out.println(maxNumber(numbers));
    }
    public static void printNumberList(int[] numberList) {
        ArrayList<Integer> newNumberList = new ArrayList<>();
        for (int number : numberList) {
            newNumberList.add(number);
        }
        System.out.println(newNumberList);
    }
    public static int maxNumber(int[] numberList) {
        int max = 0;
        for (int number : numberList) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
