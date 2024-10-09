package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Suhu Air dalam Celsius...");
    int suhu = Integer.parseInt(sc.nextLine());

    if (suhu >= 100) {
      System.out.println("air mendidih");
    } else if (suhu <= 99 && suhu >= 50) {
      System.out.println("air hangat");
    } else if (suhu <= 49 && suhu >= 10) {
      System.out.println("air normal");
    } else if (suhu < 10) {
      System.out.println("air beku");
    }
  }
}
