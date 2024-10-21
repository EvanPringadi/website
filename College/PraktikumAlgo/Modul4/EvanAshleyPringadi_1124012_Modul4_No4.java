package College.PraktikumAlgo.Modul4;
import java.util.Scanner;
public class EvanAshleyPringadi_1124012_Modul4_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka = -1;
    while(angka < 0) {
      System.out.print("Masukkan angka positif: ");
      angka = Integer.parseInt(sc.nextLine());
      if (angka < 0) {
        System.out.println("Angka harus positif. Silakan coba lagi.");
      } else {
        System.out.println("Terima kasih! Anda telah memasukkan angka positif.");
        break;
      }
    }

  }
}
