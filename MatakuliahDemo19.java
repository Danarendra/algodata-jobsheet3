import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Matakuliah19[] arrayOfMatakuliah = new Matakuliah19[3];
        String kode, nama, dummy;
        int sks, jumlahjam;

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan Data matakuliah ke-" + (i + 1));
            System.out.println("Kode: ");
            kode = sc.nextLine();
            System.out.println("Nama: ");
            nama = sc.nextLine();
            System.out.println("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah19(kode, nama, sks, jumlahjam);
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Data Matakuliah Ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama: " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS: " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam: " + arrayOfMatakuliah[i].jumlahJam);
        }
    }
}

