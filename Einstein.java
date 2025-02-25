import java.util.Scanner;

/**
 * The program asks the user for the the length of the logs, then displays
 * to the user how many of those logs the truck can carry.
 *
 * @author Johnnatan Yasin Medina
 * @version 1.0
 * @since 2025-02-23
 */

public final class Einstein {

        /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main Method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        //Declare Constants
        final double SPEED_OF_LIGHT = (2.998e8);
        final double SPEED_SQUARED = (SPEED_OF_LIGHT * SPEED_OF_LIGHT);

        //Ask user for mass in kg
        System.out.print("Welcome, please input the mass in kg: ");

        //Using Scanner for input
        final Scanner scanner = new Scanner(System.in);
        final String strMass = scanner.nextLine();

    //try..catch
        try {
            final float flMass = Float.parseFloat(strMass);
            //Write 'if' statements to catch errors in input
            if (flMass < 0) {
                System.out.println("Mass cannot be negative.");
            //Calculate the energy using Einstein's formula'
            } else {
                final double energy = (flMass * SPEED_SQUARED);
                //Display the final answer in scientific notation
                System.out.print("The total amount of energy ");
                System.out.print("given the mass, ");
                System.out.print(strMass + "kg, is ");
                System.out.format("%.3e", energy);
                System.out.println("J .");
            }
            //For string answers, or non numeric inputs
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid log length. "
                + error.getMessage());
        }
    }
}
