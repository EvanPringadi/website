package College.Algoritma.forloop;

import java.util.Scanner;

public class pohon {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan jumlah baris...");
    int n = Integer.parseInt(sc.nextLine());

    for(int i =1; i <=n; i++){
      for(int j = n-i; j >=1; j--) {
        System.out.print(" ");
      }
      for(int k = i*2-1; k>0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 1; i <= 3; i++) {
      for(int j = 1; j <= n-2; j++) {
        System.out.print(" ");
      }
      for(int k = 1; k<=3; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
