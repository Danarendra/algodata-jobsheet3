import java.util.Scanner;
public class Mahasiswa19Modif2 {
    class Mahasiswa19 {
        public String nim;
        public String nama;
        public String kelas;
        public float ipk;
    
        public void cetakInfo() {
            System.out.println("NIM : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("Kelas : " + kelas);
            System.out.println("IPK : " + ipk);
            System.out.println("------------------------------------------");
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Mahasiswa19[] arrayOfMahasiswa19s = new Mahasiswa19[3];
            String dummy;
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
                System.out.print("NIM : ");
                arrayOfMahasiswa19s[i].nim = sc.nextLine();
                System.out.print("Nama : ");
                arrayOfMahasiswa19s[i].nama = sc.nextLine();
                System.out.print("Kelas : ");
                arrayOfMahasiswa19s[i].kelas = sc.nextLine();
                System.out.print("IPK : ");
                dummy = sc.nextLine();
                arrayOfMahasiswa19s[i].ipk = Float.parseFloat(dummy);
                System.out.println("------------------------------------------");
            }
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Data Mahasiswa ke-" + (i + 1));
                arrayOfMahasiswa19s[i].cetakInfo();
            }
        }
    }
    

