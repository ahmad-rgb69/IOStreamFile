
package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiriBagian2MenulisKeBerkas {
    public static void main(String[] args) {
        try(PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))){
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jum'at");
            System.out.println("=============================================");
            System.out.println("Data berhasil ditulis ke hari.txt");
            System.out.println("\n=============================================");
        } catch (IOException e){
            System.out.println("Gagal menulis: "+e.getMessage());
        }
        
        try(BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))){
            String baris;
            int nomor = 1;
            while ((baris = pembaca.readLine()) != null){
                System.out.println(nomor + ". " + baris);
                nomor++;
            } 
        }catch (IOException e){
                    System.out.println("Gagal membaca : " + e.getMessage());
        }
    }   
}
