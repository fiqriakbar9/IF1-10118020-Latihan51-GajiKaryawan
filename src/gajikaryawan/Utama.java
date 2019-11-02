/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan data gaji seorang
 * karyawan denga ketentuan yang sudah ada
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.printf("Masukkan NIK : ");
        manager.setNik(scanner.nextLine());
        System.out.printf("Masukkan Nama : ");
        manager.setNama(scanner.nextLine());
        System.out.printf("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.printf("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.printf("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t : "+manager.getNik());
        System.out.println("NAMA\t : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN\t : "+manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN\t : "+manager.tunjanganGolongan(manager.golongan));
        System.out.println("TUNJANGAN JABATAN\t : "+manager.tunjanganJabatan(manager.jabatan));
        System.out.println("TUNJANGAN KEHADIRAN\t : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL\t : "+manager.gajiTotal());
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
        
    }
    
}