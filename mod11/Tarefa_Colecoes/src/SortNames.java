import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the names separated by commas
        System.out.print("Enter names separated by commas: ");
        String namesInput = scanner.nextLine();

        // Split the names and store them in an array
        String[] names = namesInput.split(",");

        // Sort the array in alphabetical order
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name.trim()); // trim() removes whitespace before and after the name
        }
    }

}
