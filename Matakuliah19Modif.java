import java.util.Scanner;
public class Matakuliah19Modif {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah19Modif(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public static Matakuliah19 tambahData(Scanner sc) {
        System.out.println("Masukkan Data Mata Kuliah:");
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("SKS: ");
        int sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam: ");
        int jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("------------------------------------------");
        return new Matakuliah19(kode, nama, sks, jumlahJam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i] = tambahData(sc);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama: " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS: " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam: " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------------------------");
        }
        sc.close();
    }
}

