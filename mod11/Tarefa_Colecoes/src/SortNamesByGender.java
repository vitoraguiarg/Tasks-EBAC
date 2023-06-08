import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortNamesByGender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the names and genders separated by commas
        System.out.print("Enter names and genders separated by commas (e.g. John-M, Mary-W): ");
        String input = scanner.nextLine();

        // Split the input by comma and store each name and gender in separate ArrayLists
        String[] parts = input.split(",");
        ArrayList<String> maleNames = new ArrayList<>();
        ArrayList<String> femaleNames = new ArrayList<>();
        for (String part : parts) {
            String[] nameAndGender = part.split("-");
            String name = nameAndGender[0].trim();
            String gender = nameAndGender[1].trim().toUpperCase();
            if (gender.equals("M")) {
                maleNames.add(name);
            } else if (gender.equals("W")) {
                femaleNames.add(name);
            }
        }

        // Sort the arrays in alphabetical order
        String[] sortedMaleNames = maleNames.toArray(new String[0]);
        Arrays.sort(sortedMaleNames);
        String[] sortedFemaleNames = femaleNames.toArray(new String[0]);
        Arrays.sort(sortedFemaleNames);

        // Print the sorted names by gender
        System.out.println("Sorted names by gender:");
        System.out.println("Males:");
        for (String name : sortedMaleNames) {
            System.out.println(name);
        }
        System.out.println("Females:");
        for (String name : sortedFemaleNames) {
            System.out.println(name);
        }
    }

}
