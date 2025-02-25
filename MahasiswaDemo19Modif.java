import java.util.Scanner;
public class MahasiswaDemo19Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa19[] arrayOfMahasiswa19s = new Mahasiswa19[3];
        String dummy;

        for(int i=0; i < 3; i++){
            arrayOfMahasiswa19s[i] = new Mahasiswa19();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM : ");
            arrayOfMahasiswa19s[i].nim = sc.nextLine();
            System.out.println("Nama : ");
            arrayOfMahasiswa19s[i].nama = sc.nextLine();
            System.out.println("Kelas : ");
            arrayOfMahasiswa19s[i].kelas = sc.nextLine();
            System.out.println("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa19s[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------------");
        }
    
        for(int i=0; i < 3; i++){
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("NIM : " + arrayOfMahasiswa19s[i].nim);
        System.out.println("Nama : " + arrayOfMahasiswa19s[i].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa19s[i].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa19s[i].ipk);
        System.out.println("------------------------------------------");
        }
    }
}
