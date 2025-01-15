import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display the options to the user
        System.out.println("Simple Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        
        // Read the user's choice
        int choice = scanner.nextInt();
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the calculation based on the user's choice
        double result;
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                break;
        }
        
        // Close the scanner
        scanner.close();
    }
}
