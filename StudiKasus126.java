import java.util.Scanner;
public class Studikasus126 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.print("Masukkan harga per cup : ");
int hargaPerCup = input.nextInt();
System.out.print("Masukkan jumlah cup  : ");
int jumlahCup = input.nextInt();
// Hitung total harga
        double totalHarga = hargaPerCup * jumlahCup;
        double diskon = 0;

        // Diskon 10% jika total >= 100000
        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.10;
        }
 
        double totalBayar = totalHarga - diskon;
 
        System.out.println("Total harga  : " + totalHarga);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Total bayar  : " + totalBayar);
 
        System.out.print("Masukkan uang bayar    : ");
        double uangBayar = input.nextDouble();
 
        // Cek uang cukup atau kurang
        if (uangBayar >= totalBayar) {
            System.out.println("Uang cukup. Kembalian : " + (uangBayar - totalBayar));
        } else {
            System.out.println("Uang kurang. Kekurangan : " + (totalBayar - uangBayar));
        }
 
        input.close();
    }
}
 

    







