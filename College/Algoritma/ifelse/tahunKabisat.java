package College.Algoritma.ifelse;

import java.util.Scanner;

public class tahunKabisat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Isi tahun...");
    int tahun = sc.nextInt();

    if (tahun % 400 == 0) {
      System.out.println("tahun kabisat");
    } else if (tahun % 4 == 0 && tahun % 100 != 0) {
      System.out.println("tahun kabisat");
    } else {
      System.out.println("bukan tahun kabisat");
    }
  }
}
