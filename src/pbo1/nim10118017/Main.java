package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main untuk class Printer.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Aplikasi Pencetak Nama======");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJumlahCetak(scanner.nextInt());
        
        printer.cetak(printer.getNama());
        
        System.out.println("Hasil Cetak :");
        printer.cetak(printer.getJumlahCetak(), printer.getNama());
        
    }
    
}
