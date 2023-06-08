import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name:");
        String studentName = sc.nextLine();

        System.out.println("Enter " + studentName + "'s first grade:");
        double grade1 = sc.nextDouble();

        System.out.println("Enter " + studentName + "'s second grade:");
        double grade2 = sc.nextDouble();

        System.out.println("Enter " + studentName + "'s third grade:");
        double grade3 = sc.nextDouble();

        System.out.println("Enter " + studentName + "'s fourth grade:");
        double grade4 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;

        if (average >= 7) {
            System.out.println(studentName + " has passed with an average of " + average);
        } else if (average >= 5 && average < 7) {
            System.out.println(studentName + " is on recovery with an average of " + average);
        } else {
            System.out.println(studentName + " has failed with an average of " + average);
        }

        sc.close();
    }
}
