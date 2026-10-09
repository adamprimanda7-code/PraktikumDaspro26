import java.util.Scanner;
public class StudiKasus226 {

    public static void main(String[] args) {
        // TODO code application logic here
    }scanner input = new Scanner(System.in);
        
    // ===== INPUT DATA UMUM =====
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = input.nextInt();
 
        // Cek jenis kegiatan (huruf besar/kecil tidak berpengaruh)
        boolean isLomba = jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI");
        boolean isPKM = jenis.equalsIgnoreCase("PKM");
 
        // ===== INPUT SESUAI JENIS KEGIATAN =====
        int peringkat = 0;
        int statusPKM = 0;
        if (isLomba) {
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();
        } else if (isPKM) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();
        }
 
        // ===== PROSES (nested IF, maksimal 3 tingkat) =====
        if (jumlahDokumen < 4) {                                   // tingkat 1
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                    + " dokumen). Dana tidak diberikan.");
        } else {
            if (isLomba) {                                         // tingkat 2
                if (peringkat >= 1 && peringkat <= 3) {            // tingkat 3
                    System.out.println("Status : Dokumen lengkap. Juara " + peringkat
                            + ". Dana penghargaan DIBERIKAN.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. "
                            + "Dana tidak diberikan.");
                }
            } else if (isPKM) {                                    // tingkat 2
                if (statusPKM == 1) {                              // tingkat 3
                    System.out.println("Status : Dokumen lengkap. PKM lolos pendanaan. "
                            + "Dana penghargaan DIBERIKAN.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi PKM tidak lolos pendanaan. "
                            + "Dana tidak diberikan.");
                }
            } else {
                System.out.println("Status : Kegiatan Lainnya tidak memperoleh dana penghargaan.");
            }
        }
 
        input.close();
    }
}
 









}

