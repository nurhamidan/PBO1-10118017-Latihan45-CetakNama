package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class untuk mencetak nama satu kali atau berulang sesuai ketentuan inputan.
 * 
 */
public class Printer {
    private int jumlahCetak;
    private String nama;

    public int getJumlahCetak() {
        return jumlahCetak;
    }

    public void setJumlahCetak(int jumlahCetak) {
        this.jumlahCetak = jumlahCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jumlahCetak, String nama) {
        for (int i = 0; i < jumlahCetak; i++) {
            System.out.println((i + 1) + ". " + nama);
        }
    }
}
