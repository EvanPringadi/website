package College.Algoritma.forloop;

import java.util.Scanner;

public class belahketupatkosong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan lebar: ");
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= 1; i++) {
      for (int j = n-i; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int i = 2; i <= n; i++) {
      for (int j = n-i; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = (i-1)*2-1; j > 0 ; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int i = n-1; i > 1; i--) {
      for (int j = n-i; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = (i-1)*2-1; j > 0 ; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int i = 1; i <= 1; i++) {
      for (int j = n-i; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
