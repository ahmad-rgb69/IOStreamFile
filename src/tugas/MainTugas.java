// Nama : Ahmad Aldy Noor Fadhillah
// NPM  : 2410010305
package tugas;
public class MainTugas {

    public static void main(String[] args) {
        String[] kategori = {"Elektronik", "Peripheral", "Aksesoris"};

        System.out.println("*=== KATEGORI TOKO ===*");
        for (String kat : kategori) {
            System.out.println("- " + kat);
        }
        System.out.println();

        System.out.println("*=== PROSES AWAL (GUDANG 1) ===*");
        Gudang gudangUtama = new Gudang("barang.txt");

        gudangUtama.tambahBarang(new Barang("Laptop Advan", 8700000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Fantech", 330000, 10));
        gudangUtama.tambahBarang(new Barang("Keyboard PressPlay", 630000, 15));
        gudangUtama.tambahBarang(new Barang("Speaker Soundcore", 299000, 12));
        gudangUtama.tambahBarang(new Barang("CoolingPad Rexus", 550000, 10));

        gudangUtama.tampilkanSemua();
        gudangUtama.simpanKeBerkas();
        System.out.println();

        System.out.println("*=== PROSES PEMBUKTIAN (GUDANG BARU) ===*");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        double totalAset = gudangBaru.totalNilai();
        System.out.printf("\nTotal Nilai Persediaan Barang, Rp%.0f\n ", totalAset);
    }
}
