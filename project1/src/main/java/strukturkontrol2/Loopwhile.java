/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturkontrol2;

import java.util.Scanner;

/**
 *
 * @author A-25
 */
public class Loopwhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userInput = "";
            while (!userInput.equalsIgnoreCase("n")) {
                System.out.print("Enter a number between 1 and 7 to get the corresponding day of the week (n to exit): ");
                int day = scanner.nextInt();
                
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Error: The input should be between 1 and 7.");
                        break;
                }
                
                System.out.print("Do you want to enter another input? (y/n) ");
                userInput = scanner.next();
            }
        }
    }
}
