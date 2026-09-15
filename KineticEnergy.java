import java.util.Scanner;

public class KineticEnergy 
{   // START OF CLASS

    // Create Scanner object
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {   // START OF MAIN

        // Declare variables
        double mass;
        double velocity;
        double kineticEnergy;

        // Ask for user input
        System.out.print("Enter the mass of the object (kg): ");
        mass = keyboard.nextDouble();

        System.out.print("Enter the velocity of the object (m/s): ");
        velocity = keyboard.nextDouble();

        // Calculate kenetic energy
        kineticEnergy = kineticEnergy(mass, velocity);

        // Display results
        System.out.printf("\n" +
                          "Mass: %,.2f kg\n" +
                          "Velocity: %,.2f m/s\n" +
                          "--------------------\n" +
                          "Kenetic Energy: %,.2f J", mass, velocity, kineticEnergy);


    }   // END OF MAIN


    public static double kineticEnergy(double mass, double velocity)
    {   // START OF kineticEnergy METHOD

        // Declare variables
        double KE;
        double m = mass;
        double v = velocity;

        KE =  0.5 * (m * Math.pow(v, 2));

//        System.out.println(KE); // Display results for testing

        return KE;

    }   // END OF kineticEnergy METHOD
}   // END OF CLASS
