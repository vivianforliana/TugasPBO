/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alur;

import java.util.Scanner;

/**
 *
 * @author A-25
 */
public class Latihan {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String name = keyboard.nextLine();
            
            System.out.print("Masukkan umur: ");
            int age = keyboard.nextInt();
            
            String message = "";
            
            if (age < 10) {
                message = "Terlalu muda untuk membuat akun Facebook";
            } else if (age == 17) {
                message = "Sudah boleh mendapatkan SIM";
            } else if (age >= 18 && age <= 33) {
                message = "Anda dalam masa keemasan, manfaatkan waktu sebaik-baiknya";
            } else if (age > 50) {
                message = "Sebaiknya anda sudah berhati-hati untuk kulineran";
            } else {
                message = "Umur Anda tidak sesuai dengan kondisi yang ditentukan";
            }
            
            System.out.println(name + ", " + message);
        }
    }
}