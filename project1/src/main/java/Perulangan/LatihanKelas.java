/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import com.person.Person;

/**
 *
 * @author A-25
 */
public class LatihanKelas {
    public static void main(String[] args) {
        System.out.println("Latihan Kelas");
        String judulbuku1 = "Java 1";
        String authorbuku1 = "Vivian";
        String judulbuku2 = "Java 2";
        String authorbuku2 = "Forliana";
        System.out.println(judulbuku1);
        System.out.println(authorbuku1);
        System.out.println(judulbuku2);
        System.out.println(authorbuku2);
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java 1";
        buku1.author.nama = "Puspita dari buku 1";
        buku2.judul = "Java 2";
        buku2.author.nama = "Mega dari buku 1";
        
        System.out.println(buku1.judul);
        buku1.author.sebutNama();
        System.out.println(buku2.judul);
        buku2.author.sebutNama();
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
    }   
}
 class Buku{
     String judul;
     Person author = new Person();
     int tahunpenerbitan = 2024;
     Harga harga = new Harga();
     PerusahaanBuku penerbit = new PerusahaanBuku();
}

class Harga{
    double jual = 100000.00;
    double beli = 80000.00;
}