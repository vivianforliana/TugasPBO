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
public class IfElse {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of people: ");
            int people = scanner.nextInt();
            
            System.out.print("Enter the number of cars: ");
            int cars = scanner.nextInt();
            
            System.out.print("Enter the number of buses: ");
            int buses = scanner.nextInt();
            
            if (cars > people) {
                System.out.println("We should take the cars.");
            } else if (cars < people) {
                System.out.println("We should not take the cars.");
            } else {
                System.out.println("We can't decide.");
            }
            
            if (buses > cars) {
                System.out.println("That's too many buses.");
            } else if (buses < cars) {
                System.out.println("Maybe we could take the buses.");
            } else {
                System.out.println("We still can't decide.");
            }
            
            if (people > buses) {
                System.out.println("All right, let's just take the buses.");
            } else {
                System.out.println("Fine, let's stay home then.");
            }
        }
    }
}
