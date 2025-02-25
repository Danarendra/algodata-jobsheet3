import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19[] dosen = new Dosen19[3];
        
        for (int i = 0; i < dosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode        : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelaminStr = sc.nextLine();
            Boolean jenisKelamin = jenisKelaminStr.equalsIgnoreCase("Pria");
            System.out.print("Usia        : ");
            int usia = Integer.parseInt(sc.nextLine());
            dosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------");
        }

        int counter = 1;
        for (Dosen19 d : dosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + d.getKode());
            System.out.println("Nama          : " + d.getNama());
            System.out.println("Jenis Kelamin : " + d.getJenisKelamin());
            System.out.println("Usia          : " + d.getUsia());
            System.out.println("-----------------------------");
            counter++;
        }
        
        sc.close();
    }
}
