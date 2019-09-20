/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class tugaspraktikum4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cari;
        System.out.print("masukkan sebuah kata/kalimat:");
        cari = input.nextLine();

        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        int b = 0;
        for (int j = 0; j < cari.length(); j++) {
            if (cari.charAt(j) == 'i') {
                b++;
            }
        }
        int c = 0;
        for (int k = 0; k < cari.length(); k++) {
            if (cari.charAt(k) == 'u') {
                c++;
            }
        }
        int d = 0;
        for (int l = 0; l < cari.length(); l++) {
            if (cari.charAt(l) == 'e') {
                d++;
            }
        }
        int e = 0;
        for (int m = 0; m < cari.length(); m++) {
            if (cari.charAt(m) == 'o') {
                e++;
            }
        }
        System.out.println("Jumlah huruf 'a'" + a);
        System.out.println("Jumlah huruf 'i'" + b);
        System.out.println("Jumlah huruf 'u'" + c);
        System.out.println("Jumlah huruf 'e'" + d);
        System.out.println("Jumlah huruf 'o'" + e);
    }
    
}
