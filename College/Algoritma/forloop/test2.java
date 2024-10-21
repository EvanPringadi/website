package College.Algoritma.forloop;

import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Lebar...");
    int lebar = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= lebar; i++) {
      for(int j = lebar-i; j >= 1; j--) {
        System.out.print(" ");
      }
      for ( int k = i; k >= 1; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = lebar-1; i >= 1; i--) {
      for(int j = lebar-i; j >= 1; j--) {
        System.out.print(" ");
      }
      for ( int k = i; k >= 1; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
