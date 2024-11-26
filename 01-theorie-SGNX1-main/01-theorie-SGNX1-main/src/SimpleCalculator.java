import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with if and if else.
 */

public class SimpleCalculator {

    public static void SimpleCalculator1() {

        Scanner sc = new Scanner(System.in);

        float x;
        float y;
        String z;

        System.out.println("Please enter your first number");
        x = sc.nextFloat();
        sc.nextLine();
        System.out.println("Please enter your second number");
        y = sc.nextFloat();
        sc.nextLine();
        System.out.println("Please enter +, -, *, /");
        z = sc.nextLine();

        if (z.equals("+")) {
            System.out.println("Your result is: " + (x + y));
        } else if (z.equals("-")) {
            System.out.println("Your result is: " + (x - y));
        } else if (z.equals("*")) {
            System.out.println("Your result is: " + (x * y));
        } else if (z.equals("/")) {
            if (x == 0 || y == 0) {
                System.out.println("It cannot be divided by zero");
            } else {
                System.out.println("Your solution is: " + (x / y));
            }
        } else {
            System.out.println("You did not enter +, -, *, or /.");
        }

    }
}
