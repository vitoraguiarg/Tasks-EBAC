import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GenderGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> groups = new HashMap<>();
        groups.put("male", new ArrayList<>());
        groups.put("female", new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name and gender (separated by comma): ");
            String input = sc.nextLine();
            String[] parts = input.split(",");

            String name = parts[0].trim();
            String gender = parts[1].trim();

            if (gender.equalsIgnoreCase("male")) {
                groups.get("male").add(name);
            } else if (gender.equalsIgnoreCase("female")) {
                groups.get("female").add(name);
            } else {
                System.out.println("Invalid gender. Try again.");
                i--; // decrement i so that the loop repeats for the same input
            }
        }

        System.out.println("Male group: " + groups.get("male"));
        System.out.println("Female group: " + groups.get("female"));
    }
}
