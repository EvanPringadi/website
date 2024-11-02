package College.Algoritma.forloop;

import java.util.Scanner;

public class jajargenjangkosong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan n: ");
    int n = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 1; i < n-1; i++) {
      for (int j = i; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = n-2; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int j = n-1; j > 0; j--) {
      System.out.print(" ");
    }
    for (int i = 0; i < n; i++) {
      System.out.print("*");
    }
  }
}
