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
public class Contoh2 {

    public static void main(String[] args) {
        int variable1 = inputNilaiInteger("variable1");
        int lowerBound = inputNilaiInteger("lowerBound");
        int upperBound = inputNilaiInteger("upperBound");
        int variable2 = inputNilaiInteger("variable2");
        int variable3 = inputNilaiInteger("variable3");

        if (variable1 < lowerBound) {
            System.out.println("Variable1 = " + variable1 + " is less than lowerBound = " + lowerBound);
        } else if (variable1 > upperBound) {
            System.out.println("Variable1 = " + variable1 + " is greater than upperBound = " + upperBound);
        } else {
            System.out.println("Variable1 = " + variable1 + " is within the range of lowerBound = " + lowerBound + " and upperBound = " + upperBound);
        }

        if (variable1 > variable2 && variable1 < variable3) {
            System.out.println("Variable1 = " + variable1 + " is between variable2 = " + variable2 + " and variable3 = " + variable3);
        }
    }

    static int inputNilaiInteger(String variableName) {
        Scanner inputScanner = new Scanner(System.in);
        int inputValue;
        System.out.println("Please input a value for " + variableName);
        inputValue = inputScanner.nextInt();
        return inputValue;
    }
}
