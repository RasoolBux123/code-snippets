import java.util.Scanner;

public class HCFCalculator {

    // Method to calculate HCF using Euclidean algorithm
    static int calculateHCF(int a, int b) {
        if (b == 0)
            return a;
        return calculateHCF(b, a % b);
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate HCF
        int hcf = calculateHCF(num1, num2);

        // Output the HCF
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
