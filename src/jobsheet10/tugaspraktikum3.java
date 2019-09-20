/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author USER
 */
public class tugaspraktikum3 {

    public static void main(String[] args) {
        int kelipatan;
        int[] data = new int[]{92, 98, 78, 76, 72, 84, 101, 39};
        System.out.println("Data Pada Array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
            

        }
        System.out.println("\n");
        System.out.println("Nilai yang merupakan kelipatan 3 : ");
        for (int j = 0; j < data.length; j++) {
            if (data[j] % 3 == 0) {
                System.out.println(data[j]);
            }
            

        }
    }
}
