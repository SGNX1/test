import java.util.Scanner;

/*
 * Author: Gokl Martin
 * Date: 25.11.2024
 * Version: 0.9
 * Description: Exercise for Break and Continue.
 */

public class BreakContinueUebung {

    public static void BreakContinueUebung1() {
        String eingabe;
        float zZahl;
        float ergebniss = 0f;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number or type \"End\" or \"Stop\" to conclude the summation.");
            eingabe = sc.nextLine();
            eingabe = eingabe.toLowerCase();
            if (eingabe.equals("ende") || eingabe.equals("stop")) {
                System.out.println("Your Result is: " + ergebniss);
                break;
            } else {
                zZahl = Float.parseFloat(eingabe);
                ergebniss += zZahl;
                //continue;
            }
        }
    }
}
