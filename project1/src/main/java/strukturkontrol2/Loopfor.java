/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturkontrol2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-25
 */
public class Loopfor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Pesan: ");
        String message = keyboard.nextLine();

        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(20);

        if (jumlahPengulangan < 10) {
            System.out.println("Pesan akan diulang sebanyak: " + jumlahPengulangan + " kali");
        } else {
            System.out.println("Bilangan random yang didapat terlalu besar");
            System.out.println("Pesan akan diulang 5 kali");
            jumlahPengulangan = 5;
        }

        for (int n = 0; n < jumlahPengulangan; n++) {
            System.out.println(n + 1 + ". " + message);
        }
    }
}
