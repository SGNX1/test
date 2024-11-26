import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with switch, case and default.
 */


public class AdvancedCalculator {

    public static void AdvancedCalculator1() {

        Scanner sc = new Scanner(System.in);

        float x;
        float y;
        float c;
        String z;
        boolean end = true;

        while (end) {
            System.out.println("Please enter your first number");
            x = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your second number");
            y = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your third number.“");
            c = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter +, -, *, /, min, max, sqrt, mean.");
            z = sc.nextLine();


            switch (z) {
                case "+":
                    System.out.println("Your result is: " + (x + y + c));
                    break;
                case "-":
                    System.out.println("Your result is: " + (x - y - c));
                    break;
                case "*":
                    System.out.println("Your result is: " + (x * y * c));
                    break;
                case "/":
                    if (x == 0 || y == 0 || c == 0) {
                        System.out.println("It cannot be divided by zero");
                    } else {
                        System.out.println("Your result is: " + (x / y / c));
                    }
                    break;
                case "min":
                    System.out.println("The lowest value is: " + Math.min(x, y));
                    break;
                case "max":
                    System.out.println("The highest value is: " + Math.max(x, y));
                    break;
                case "sqrt":
                    System.out.println("The square roots of number 1 and number 2 are: " + Math.sqrt(x) + " and " + Math.sqrt(y));
                    break;
                case "mean":
                    System.out.println("Your result is: " + (x / 2) + " " + (y / 2) + " " + (c / 2));
                    break;
                default:
                    System.out.println("Invalid case");
            }
            System.out.println("Would you like to perform a new calculation? Yes or No");
            z = sc.nextLine();
            if (z.equals("No")) {
                end = false;
            }


        }
    }
}