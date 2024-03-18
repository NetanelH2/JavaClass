package homeTasks;

public class WhileLoopTask {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i < 500) {
            if (i % 4 == 0) {
                if (i == 100) {
                    System.out.println("Reached 100. The loop is over");
                    break;
                }
                i++;
                continue;
            }

            if (i % 7 == 0) {
                System.out.println("Number is divisible by 7: " + i);
                sum += i;
            }
            i++;
        }

        System.out.println("The sum is: " + sum);
    }
}