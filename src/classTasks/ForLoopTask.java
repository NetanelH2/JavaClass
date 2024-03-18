package classTasks;

public class ForLoopTask {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}