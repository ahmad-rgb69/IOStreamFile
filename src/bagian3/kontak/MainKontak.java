
package bagian3.kontak;



public class MainKontak {
    public static void main(String[] args) {
        
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Aldi", "085171", "aldi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "084717", "budi01@gmail.com"));
        buku.tambahKontak(new Kontak("Cika", "085806", "cikaGamink92@gmaail.com"));
        
       /* buku.tampilkanSemua();
        buku.simpanKeBerkas();*/
       
        System.out.println("--- KONDISI AWAL ---");
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println("\n--- UJI SOAL 1: Pencarian Kontak ---");
        buku.cariKontak("Budi"); // Skenario ditemukan
        buku.cariKontak("Deni"); // Skenario tidak ditemukan
        
        System.out.println("\n--- UJI SOAL 3: Penghapusan Kontak ---");
        buku.hapusKontak("Budi"); // Menghapus Budi
        buku.tampilkanSemua();   // Melihat daftar setelah dihapus
        
        
        System.out.println("\n=======================================");
        System.out.println();
        
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak : "+ bukuLain.jumlahKontak());
    }
  
}
