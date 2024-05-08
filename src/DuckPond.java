/*
 * @author Kyle Chapman
 * Created: May 8, 2024
 * Description:
 * Determine the approximate number of rubber ducks
 * that can fit on an approximately rectangular pond.
 */

import java.util.*;

public class DuckPond {
    // Declare Scanner instance for input.
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declarations.
        final double DUCK_LENGTH = 0.073;
        final double DUCK_WIDTH = 0.057;
        double pond_length;
        double pond_width;
        double duck_area;
        double pond_area;
        int duck_amount;

        // Input.
        System.out.print("Enter the length of the pond in metres: ");
        pond_length = input.nextDouble();
        System.out.print("Enter the width of the pond in metres: ");
        pond_width = input.nextDouble();

        // Processing.
        duck_area = DUCK_LENGTH * DUCK_WIDTH;
        pond_area = pond_length * pond_width;
        duck_amount = (int)Math.ceil(pond_area / duck_area);

        // Output.
        System.out.printf("A pond with a length of %.2fm and a width of %.2fm should fit approximately %d ducks.%n", pond_length, pond_width, duck_amount);
    }
}