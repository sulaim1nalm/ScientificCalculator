import java.util.Scanner;
import java.util.InputMismatchException;


public class ScientificCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int op = getUserInput(scanner);
            switch(op) {
                case 1:
                    System.out.println("Addition");
                    performAddition(scanner);
                    break;
                case 2:
                    System.out.println("substraction");
                    performSubstraction(scanner);
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
        // Reads an integer
        return scanner.nextInt();
    }

    //------Those are the methods for pure math----------

    //------Basic Arithmetic------
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }


    //-----those are the methods that will handle user input----
    // --- Helper Methods for User Interaction (calling from main's switch-case) ---

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("The result is: " + add(num1, num2));
    }

    private static void performSubstraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("The result is: " + subtract(num1, num2));
    }

}