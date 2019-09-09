/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputscannerdatadiri;

import java.util.Scanner;

/**
 *
 * @author nicolahara
 */
public class InputScannerDataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Inputan 2");
        Scanner sc = new Scanner(System.in);
        String nik, nama, prodi, kelas;
        System.out.println("Masukkan NIK :");
        nik = sc.next();
        System.out.println("Masukkan Nama :");
        nama = sc.next();
        System.out.println("Masukkan Prodi :");
        prodi = sc.next();
        System.out.println("Masukkan Kelas :");
        kelas = sc.next();
        System.out.println("===============================");
        System.out.println("Data Yang Anda Masukkan");
        System.out.println("NIK :" + nik);
        System.out.println("Nama :" + nama);
        System.out.println("Prodi :" + prodi);
        System.out.println("Kelas :" + kelas);
    }
    
}
