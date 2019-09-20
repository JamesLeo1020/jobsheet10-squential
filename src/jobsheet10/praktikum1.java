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
public class praktikum1 {
   /* public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{29,4,10,94,96};
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan data yang ingin dicari:");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if(cari == data[i]) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data Founded!");
        }else{
            System.out.println("Data Not Founded!");
        }
    }*/

    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = new String[] {"tikus","ayam","bebek","entok","soang"};
        Scanner cimeng = new Scanner (System.in);
        System.out.println("Masukkan Data Yang Ingin Dicari:");
        cari = cimeng.next();
        for (int i = 0; i < data.length; i++){
            if(!cari.equals(data[i])) {
            } else {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data Founded!");
        }else{
            System.out.println("Data Not Founded!");
        }
    }
}
