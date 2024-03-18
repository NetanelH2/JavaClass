package onlineClass;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        // Array loop
        char[] letters = {'A', 'B', 'C', 'D', 'F'};
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        // For-Each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println(i);
        }
        //forEach loop
        List<String> names = new ArrayList<String>();
        names.add("Tal");
        names.add("Or");
        names.add("Ofir");
        names.add("Julie");
        names.add("Rotem");
        names.add("Anna");
        names.add("Ortal");
        names.forEach(
                (name) -> System.out.println(name)
        );
    }
}
