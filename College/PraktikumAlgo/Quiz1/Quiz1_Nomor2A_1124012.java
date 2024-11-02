package College.PraktikumAlgo.Quiz1;

import java.util.Scanner;

public class Quiz1_Nomor2A_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < 11; i++) {
      System.out.print("# ");
    }
    System.out.println();
    while(n>0) {
      System.out.print("# ");

      for (int i = 1; i <= n%10; i++) {
        System.out.print("@ ");
      }
      for (int i = 0; i < 9-(n%10); i++) {
        System.out.print("  ");
      }
      n /= 10;

      System.out.println("#");
    }
    for (int i = 0; i < 11; i++) {
      System.out.print("# ");
    }
  }
}
