import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Mahasiswa19[] arrayOfMahasiswa19s = new Mahasiswa19[3];
        arrayOfMahasiswa19s[0] = new Mahasiswa19();
        arrayOfMahasiswa19s[0].nim = "244107060033";
        arrayOfMahasiswa19s[0].nama = "Agnes Titania Kinanti";
        arrayOfMahasiswa19s[0].kelas = "SIB-1E";
        arrayOfMahasiswa19s[0].ipk = (float) 3.75;

        arrayOfMahasiswa19s[1] = new Mahasiswa19();
        arrayOfMahasiswa19s[1].nim = "2341720172";
        arrayOfMahasiswa19s[1].nama = "Achmad Maulana Hamzah";
        arrayOfMahasiswa19s[1].kelas = "TI-2A";
        arrayOfMahasiswa19s[1].ipk = (float) 3.36;

        arrayOfMahasiswa19s[2] = new Mahasiswa19();
        arrayOfMahasiswa19s[2].nim = "244107023006";
        arrayOfMahasiswa19s[2].nama = "Dirahmawan Putranto";
        arrayOfMahasiswa19s[2].kelas = "TI-2E";
        arrayOfMahasiswa19s[2].ipk = (float) 3.80;

        System.out.println("NIM : " + arrayOfMahasiswa19s[0].nim);
        System.out.println("Nama : " + arrayOfMahasiswa19s[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa19s[0].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa19s[0].ipk);
        System.out.println("------------------------------------------");
        System.out.println("NIM : " + arrayOfMahasiswa19s[1].nim);
        System.out.println("Nama : " + arrayOfMahasiswa19s[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa19s[1].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa19s[1].ipk);
        System.out.println("------------------------------------------");
        System.out.println("NIM : " + arrayOfMahasiswa19s[2].nim);
        System.out.println("Nama : " + arrayOfMahasiswa19s[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa19s[2].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa19s[2].ipk);
        System.out.println("------------------------------------------");
    } 
}
