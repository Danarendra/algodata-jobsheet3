import java.util.Scanner;
public class Dosen19 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;
    
    public Dosen19(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin ? "Pria" : "Wanita";
    }
    
    public int getUsia() {
        return usia;
    }
}
