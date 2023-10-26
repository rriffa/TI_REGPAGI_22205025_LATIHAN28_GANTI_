/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan28;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kalimat,kataAsal,kataGanti,kalimatBaru;
        // Deklarasi kalimat dari user
        System.out.println("===== Program Mengganti Kata =====");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        kalimat = input.nextLine();
        
        // Input kata yang akan diganti
        System.out.print("Ganti kata: ");
        kataAsal = input.nextLine();
        
        // Input kata pengganti
        System.out.print("Menjadi kata: ");
        kataGanti = input.nextLine();
        
        // Ganti kata dalam kalimat 
        kalimatBaru = kalimat.replaceAll(kataAsal, kataGanti);
        
        // Tampilkan hasil
        System.out.println("\n===== Hasil Fromatting =====");
        System.out.println("Kalimat awal\t: "+kalimat);
        System.out.println("Kalimat baru\t: " + kalimatBaru);
    }
    
}
