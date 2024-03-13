package homeTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class CountriesTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> countries = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter a country:");
            String country = input.nextLine();
            countries.add(country);
        }
        System.out.println("List of countries:");
//        for (String name : countries) {
//            System.out.println(name);
//        }
        countries.forEach((name) ->
            System.out.println(name));
    }
}
