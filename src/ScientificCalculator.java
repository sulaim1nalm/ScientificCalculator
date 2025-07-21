import java.nio.channels.ScatteringByteChannel;
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
                    performMultiplication(scanner);
                    break;
                case 4:
                    System.out.println("Division");
                    performDivision(scanner);
                    break;
                case 5:
                    System.out.println("SquareRoot");
                    performSquareRoot(scanner);
                    break;
                case 6:
                    System.out.println("Power Function");
                    performPower(scanner);
                    break;
                case 7:
                    System.out.println("Sine (Degrees)");
                    performSine(scanner);
                    break;
                case 8:
                    System.out.println("Cosine (Degrees)");
                    performCosine(scanner);
                    break;
                case 9:
                    System.out.println("tangent (Degrees)");
                    performTangent(scanner);
                    break;
                case 10:
                    System.out.println("Natural Logarithm");
                    performNaturalLogarithm(scanner);
                    break;
                case 11:
                    System.out.println("Base 10 Logarithm");
                    performLogarithmBase10(scanner);
                    break;
                case 12:
                    System.out.println("Absolute Value");
                    performAbsoluteValue(scanner);
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
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }

    //------- Scientific Math Methods ----
    public static double calculateSquareRoot(double num){
        return Math.sqrt(num);
    }
    public static double calculatePower(double base, double exponent){
        return Math.pow(base, exponent);
    }
    public static double calculateSine(double degrees){
        degrees = Math.toRadians(degrees);
        return Math.sin(degrees);
    }
    public static double calculateCosine(double degrees){
        degrees = Math.toRadians(degrees);
        return Math.cos(degrees);
    }
    public static double calculateTangent(double degrees){
        degrees = Math.toRadians(degrees);
        return Math.tan(degrees);
    }
    public static double calculateNaturalLogarithm(double num){
        return Math.log(num);
    }
    public static double calculateLogarithmBase10(double num){
        return Math.log10(num);
    }
    public static double calculateAbsoluteValue(double num){
        return Math.abs(num);
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

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("The result is: " + multiply(num1, num2));
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("The result is: " + divide(num1, num2));
        try {
            num2=0;
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input!");
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.println("The result is: " + calculateSquareRoot(num1));
    }
    private static void performPower(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        System.out.println("The result is: " + calculatePower(base, exponent));
    }

    private static void performSine(Scanner scanner) {
        System.out.print("Enter a degree: ");
        double degrees = scanner.nextDouble();
        System.out.println("The result is: " + calculateSine(degrees));
    }

    private static void performCosine(Scanner scanner) {
        System.out.print("Enter a degree: ");
        double degrees = scanner.nextDouble();
        System.out.println("The result is: " + calculateCosine(degrees));
    }

    private static void performTangent(Scanner scanner) {
        System.out.print("Enter a degree: ");
        double degrees = scanner.nextDouble();
        System.out.println("The result is: " + calculateTangent(degrees));
    }

    private static void performNaturalLogarithm(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("The result is: " + calculateNaturalLogarithm(num));
    }

    private static void performLogarithmBase10(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("The result is: " + calculateLogarithmBase10(num));
    }

    private static void performAbsoluteValue(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("The result is: " + calculateAbsoluteValue(num));
    }
}