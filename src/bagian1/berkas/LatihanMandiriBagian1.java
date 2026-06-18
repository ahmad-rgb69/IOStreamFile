package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriBagian1 {
    public static void main(String[] args) {
        
        System.out.println("=== SOAL 1: Cek Keberadaan & Ukuran Berkas ===");
        // 1. Buat objek File yang menunjuk laporan.txt
        File berkas = new File("laporan.txt");
        if (berkas.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
        
        System.out.println("\n=== SOAL 2: Membuat Folder Baru ===");
        // 2. Buat folder baru bernama arsip
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat (atau sudah ada).");
        }
        
        System.out.println("\n=== SOAL 3: Membuat dan Menghapus Berkas ===");
        // 3. Buat berkas sementara.txt, lalu hapus kembali
        File berkasSementara = new File("sementara.txt");
        try {
            // Membuat berkas baru
            if (berkasSementara.createNewFile()) {
                System.out.println("Sebelum dihapus - Apakah berkas ada?: " + berkasSementara.exists());
                
                // Menghapus berkas
                if (berkasSementara.delete()) {
                    System.out.println("Sesudah dihapus - Apakah berkas ada?: " + berkasSementara.exists());
                } else {
                    System.out.println("Gagal menghapus berkas.");
                }
            } else {
                System.out.println("Berkas 'sementara.txt' sudah ada sebelumnya, hapus manual dulu untuk tes.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}