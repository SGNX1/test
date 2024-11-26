/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Calculator with an Array.
 */

import java.util.Scanner;

public class CalculatorWithArrays {
    public static void calculatorWithArrays1() {

        Scanner sc = new Scanner(System.in);

        float x;
        float y;
        float c;
        String z;
        String l;
        float i = 0;
        boolean end1 = true;
        float[] results = {0f, 0f, 0f, 0f, 0f};
        boolean end2;

        while (end1) {
            end2 = true;
            System.out.println("Please enter your first number:");
            x = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your second number:");
            y = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter your third number:");
            c = sc.nextFloat();
            sc.nextLine();
            System.out.println("Please enter +, -, *, /, min, max, sqrt, or mean:");
            z = sc.nextLine();
            z = z.toLowerCase();

            switch (z) {
                case "+":
                    i = x + y + c;
                    System.out.println("Your result is: " + i);
                    break;
                case "-":
                    i = x - y - c;
                    System.out.println("Your result is: " + i);
                    break;
                case "*":
                    i = x * y * c;
                    System.out.println("Your result is: " + i);
                    break;
                case "/":
                    if (x == 0 || y == 0 || c == 0) {
                        System.out.println("Division by 0 is not allowed.");
                    } else {
                        i = x / y / c;
                        System.out.println("Your result is: " + i);
                    }
                    break;
                case "min":
                    i = Math.min(x, y);
                    System.out.println("The smallest value is: " + i);
                    break;
                case "max":
                    i = Math.max(x, y);
                    System.out.println("The largest value is: " + i);
                    break;
                case "sqrt":
                    i = (float) Math.sqrt(x) + (float) Math.sqrt(y);
                    System.out.println("The sum of the square roots of the first and second numbers is: " + i);
                    break;
                case "mean":
                    i = (x / 2) + (y / 2) + (c / 2);
                    System.out.println("Your result is: " + i);
                    break;
                default:
                    System.err.println("Invalid input");
                    break;
            }

            System.arraycopy(results, 0, results, 1, results.length - 1);
            results[0] = i;

            while (end2) {
                System.out.println("Would you like to perform another calculation? Yes, No, or Results");
                l = sc.nextLine();
                l = l.toLowerCase();
                switch (l) {
                    case "no": {
                        end2 = false;
                        end1 = false;
                        break;
                    }
                    case "results": {
                        for (int k = 0; k < 5; k++) {
                            System.out.println("The result of calculation " + (k + 1) + " is: " + results[k]);
                        }
                        break;
                    }
                    case "yes": {
                        end2 = false;
                        break;
                    }
                    default:
                        System.err.println("Invalid input");
                        break;
                }
            }
        }
    }
}
