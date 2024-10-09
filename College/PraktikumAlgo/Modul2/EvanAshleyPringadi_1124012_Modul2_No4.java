package College.PraktikumAlgo.Modul2;
import java.util.Scanner;
import java.lang.Math;

public class EvanAshleyPringadi_1124012_Modul2_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Jenis Kamar...");
    String jenisKamar = (sc.nextLine()).toLowerCase();

    System.out.println("Masukkan Lama Inap...");
    int lamaInap = Integer.parseInt(sc.nextLine());

    double pajak = 0.00;
    int hargaKamar = 0;
    
    switch (jenisKamar) {
      case "deluxe" : pajak = 0.1; hargaKamar = 800000; break;
      case "executive" : pajak = 0.15; hargaKamar = 1000000; break;
      case "suite" : pajak = 0.2; hargaKamar = 1200000; break;
    }

    double total = Math.round((lamaInap * hargaKamar) * (1.00 + pajak));
    System.out.println("Rp." +total);

  }
}
