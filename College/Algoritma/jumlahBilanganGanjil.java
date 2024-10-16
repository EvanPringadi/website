package College.Algoritma;

import java.util.Scanner;

public class jumlahBilanganGanjil {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
    System.out.println("Masukkan banyak nilai ganjil...");
    int n = Integer.parseInt(sc.nextLine());
    int total = 0;
    for (int i = 1; i <= n; i ++) {
      total += i*2 -1;
    }
    System.out.println(total);
    */

    System.out.println("Masukkan nilai ganjil...");
    int g = Integer.parseInt(sc.nextLine());
    int total = 0;
    for (int i = 1; i <= g; i += 2) {
      total += i;
    }
    System.out.println(total);
  }
}
