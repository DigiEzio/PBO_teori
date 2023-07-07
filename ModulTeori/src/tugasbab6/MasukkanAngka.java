/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbab6;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MasukkanAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka antara 1-10: ");//input angka
        int angka = input.nextInt();

        switch (angka) {//statement switch
            case 1 -> System.out.println("Satu");//statements 1 dst
            case 2 -> System.out.println("Dua");
            case 3 -> System.out.println("Tiga");
            case 4 -> System.out.println("Empat");
            case 5 -> System.out.println("Lima");
            case 6 -> System.out.println("Enam");
            case 7 -> System.out.println("Tujuh");
            case 8 -> System.out.println("Delapan");
            case 9 -> System.out.println("Sembilan");
            case 10 -> System.out.println("Sepuluh");
            default -> System.out.println("Invalid number");//ouput jika angka yang dimasukkan salah
        }
        //statement switch
            }
}

