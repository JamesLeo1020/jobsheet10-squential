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
public class tugaspraktikum1 {

    public static void main(String[] args) {
        int cari;
        boolean found = true;
        boolean notFound = false;
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data Pada Array");
        System.out.println("\n 74  98  72  74  72  90  81  72");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nlai yang ingin di cari:");
        cari = input.nextInt();

        int a=0;
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                a++;
            }
        }
        System.out.println("Data yang di cari ditemukan sebanyak:"+a+"kali");
        if(a==0){
            System.out.println("Data tydak di temukan!!");
        }

    }

}
