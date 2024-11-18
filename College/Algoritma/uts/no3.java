package College.Algoritma.uts;

import java.util.Scanner;

public class no3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n: ");
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 1; i < n; i++) {
      for (int j = i-1; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print(i);
      for (int j = (n-i)*2-1; j > 0; j--) {
        System.out.print(" ");
      }
      System.out.println((4*2 - i));
    }
    for (int i = n-1; i > 0; i--) {
      System.out.print(" ");
    }
    System.out.println(n);
  }
}
