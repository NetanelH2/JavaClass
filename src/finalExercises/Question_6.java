package finalExercises;

public class Question_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);            }
            System.out.println();
        }
    }
}