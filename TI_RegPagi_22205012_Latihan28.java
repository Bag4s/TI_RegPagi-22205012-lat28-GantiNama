/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.bagas;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TI_RegPagi_22205012_Latihan28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("======== PROGRAM MENGGANTI KATA ========");
        System.out.print("Masukan Kalimat : ");
        String kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        String ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata = input.nextLine();
        
        String newSentence = kalimat.replace(ganti, kata);

        System.out.println("===Hasil Formatting===");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + newSentence);
    }
    
}
