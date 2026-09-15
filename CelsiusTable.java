public class CelsiusTable 
{   // START OF class
    
    public static void main(String[] args)
    {   // START OF main
        
        // Declare variables
        double fahrenheit;
        double celsius;

        // Create fahrenheit to celsius conversion table
        for(int count = 0; count <=20; count++)
        {   // START OF for
            fahrenheit = count; // Increase fahrenheit by 1

            celsius = celsius(fahrenheit);    // Fahrenheit to celsius calculation

            System.out.printf("%,.1f F | %,.1f C\n", fahrenheit, celsius);
        }   // END OF for


    }   // END OF main

    public static double celsius(double fahrenheit)
{
    // Declare variables
    double c;
    double f = fahrenheit;

    // Calculation
    c = 5.0 / 9.0 * (f - 32.0);

    // Return value to main method
    return c;
}
}   // END OF class
