import java.util.Scanner;

public class FutureValue 
{   // START OF FutureValue class

    // Create Scanner object keyboard
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args)
    {   // START OF main method
        
        // Declare variables
        double futureValue;
        double presentValue;
        double monthlyInterestRate;
        int numMonths;

        // Get user input
        System.out.print("Enter the present value of your account: ");
        presentValue = keyboard.nextDouble();

        System.out.print("Enter the monthly interest rate (Percentage Value): ");
        monthlyInterestRate = keyboard.nextDouble();

        System.out.print("Enter the number of months: ");
        numMonths = keyboard.nextInt();

        // Calculate the future value of the ccount
        futureValue = futureValue(presentValue, monthlyInterestRate, numMonths);

        // Display calculation results
        System.out.printf("\n" +
                          "Present Value: $%,.2f\n" +
                          "Monthly Interest Rate: %,.2f%%\n" +
                          "Number of Months %d\n" +
                          "--------------------------------------\n" +
                          "Future Value: $%,.2f", presentValue, monthlyInterestRate, numMonths, futureValue);

    }   // START OF main method

    public static double futureValue(double presentValue, double monthlyInterestRate, int numMonths)
    {   // START OF futureValue method
        
        // Declare variables
        double p = presentValue;
        double i = monthlyInterestRate / 100;
        int m = numMonths;
        double f;

        // Future value calculation
        f = p * Math.pow(1 + i, m);

        return f;
    }   // END OF futureValue method

}   // END OF FutureValue class
