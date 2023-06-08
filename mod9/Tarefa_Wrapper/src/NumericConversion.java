import java.util.Scanner;

public class NumericConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read numerical value from user
        System.out.print("Enter a numerical value: ");
        int num = scanner.nextInt();

        // Store in primitive variable
        int primitiveNum = num;

        // Convert to wrapper type
        Integer wrappedNum = primitiveNum;

        // Print converted value
        System.out.println("Converted value: " + wrappedNum);
    }
}
