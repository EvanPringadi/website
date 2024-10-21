package College.Algoritma.ifelse;
import java.util.Scanner;

public class Diskon10Persen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hargaAwal = 0;
    int jumlahDiskon = 0; 
    int hargaAkhir = 0;
    System.out.println("Masukkan Harga...");
    hargaAwal = sc.nextInt();
    if(hargaAwal > 100000) {
      hargaAkhir = hargaAwal *9/10;
      jumlahDiskon = hargaAwal /10;
    }
    System.out.println("Harga Akhir = " + hargaAkhir + ", setelah didiskon " + jumlahDiskon);
  }
}
