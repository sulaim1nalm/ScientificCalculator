import java.util.Scanner;
import java.util.InputMismatchException;


public class ScientificCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            getUserInput(scanner);
            int op=scanner.nextInt();
            switch(op) {
                case 1:
                    System.out.println("addition");
                    break;
                case 2:
                    System.out.println("substraction");
                    break;
                case 3:
                    System.out.println("Multiplication");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }


        }
    }

    public static void  displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. square root");
        System.out.println("6. Power Function");
        System.out.println("7. Sine (Degrees)");
        System.out.println("8. cosine (Degrees)");
        System.out.println("9. Tangent (Degrees)");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Base 10 Logarithm");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round, Ceiling, Floor");
        System.out.println("14. Min and Max");
        System.out.println("15. Exit");
    }

    public static int getUserInput(Scanner scanner) {
        System.out.println("choose the operation:");
        int choice = scanner.nextInt(); // Reads an integer
        return choice;
    }
}