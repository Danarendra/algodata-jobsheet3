import java.util.Scanner;
public class DataDosen19 {
    public void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("\nDATA SEMUA DOSEN:");
        System.out.println("=================");
        for (Dosen19 dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.getKode());
            System.out.println("Nama          : " + dosen.getNama());
            System.out.println("Jenis Kelamin : " + dosen.getJenisKelamin());
            System.out.println("Usia          : " + dosen.getUsia());
            System.out.println("-----------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin().equals("Pria")) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        
        System.out.println("\nJUMLAH DOSEN PER JENIS KELAMIN:");
        System.out.println("==============================");
        System.out.println("Jumlah dosen pria   : " + jumlahPria);
        System.out.println("Jumlah dosen wanita : " + jumlahWanita);
    }
    
    public void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin().equals("Pria")) {
                totalUsiaPria += dosen.getUsia();
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.getUsia();
                jumlahWanita++;
            }
        }
        
        double rerataUsiaPria = jumlahPria > 0 ? (double)totalUsiaPria/jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double)totalUsiaWanita/jumlahWanita : 0;
        System.out.println("\nRATA-RATA USIA DOSEN PER JENIS KELAMIN:");
        System.out.println("=====================================");
        System.out.printf("Rata-rata usia dosen pria   : %.1f\n", rerataUsiaPria);
        System.out.printf("Rata-rata usia dosen wanita : %.1f\n", rerataUsiaWanita);
    }
    
    public void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 dosenTertua = arrayOfDosen[0];
        
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.getUsia() > dosenTertua.getUsia()) {
                dosenTertua = dosen;
            }
        }
        
        System.out.println("\nINFORMASI DOSEN PALING TUA:");
        System.out.println("=========================");
        System.out.println("Kode          : " + dosenTertua.getKode());
        System.out.println("Nama          : " + dosenTertua.getNama());
        System.out.println("Jenis Kelamin : " + dosenTertua.getJenisKelamin());
        System.out.println("Usia          : " + dosenTertua.getUsia());
    }
    
    public void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 dosenTermuda = arrayOfDosen[0];
        
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.getUsia() < dosenTermuda.getUsia()) {
                dosenTermuda = dosen;
            }
        }
        
        System.out.println("\nINFORMASI DOSEN PALING MUDA:");
        System.out.println("===========================");
        System.out.println("Kode          : " + dosenTermuda.getKode());
        System.out.println("Nama          : " + dosenTermuda.getNama());
        System.out.println("Jenis Kelamin : " + dosenTermuda.getJenisKelamin());
        System.out.println("Usia          : " + dosenTermuda.getUsia());
    }
}
