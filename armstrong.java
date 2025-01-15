import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is an Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = 0;
        
        // Calculate the number of digits in the given number
        while (num > 0) {
            num /= 10;
            digits++;
        }
        
        num = originalNum; // Restore the original number
        
        // Calculate the sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        // Return true if the sum is equal to the original number
        return sum == originalNum;
    }
}
