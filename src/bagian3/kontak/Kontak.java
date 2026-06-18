
package bagian3.kontak;


public class Kontak {
    private String nama;
    private String nomor;
    private String email; //Soal Latihan Mandiri no.2

    public Kontak(String nama, String nomor, String email /*Soal Latihan Mandiri no 2*/) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email; //Soal Latihan Mandiri no.2
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() { //Soal Latihan Mandiri no.2
        return email;
    }
    
    public String keBaris() {
        return nama + ";" + nomor + ";" + email /*(Soal Latihan Mandiri no.2*/;
    }
    
    public String info(){
        return nama + " - " + nomor + " - " + email /*Soal Latihan Mandiri no.2*/ ;
    }
}
