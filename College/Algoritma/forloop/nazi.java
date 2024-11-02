package College.Algoritma.forloop;
import java.util.Scanner;
public class nazi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi: ");
    int n = Integer.parseInt(sc.nextLine());
    
    System.out.print("*");
    for(int j = (n-3)/2; j > 0; j--) {
      System.out.print(" ");
    }
    for(int j = n/2 + 1; j <= n; j++) {
      System.out.print("*");
    }
    System.out.println();
    
    
    for (int i = 1; i <= (n-3)/2; i++) {
      System.out.print("*");
      for (int j = 1; j <= (n-3)/2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    for(int i = 1; i <= n; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 1; i <= (n-3)/2; i++) {
      for(int j = (n/2); j > 0; j--) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int j = 1; j <= (n-3)/2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    for (int i = 1; i <= (n/2)+1; i++) {
      System.out.print("*");
    }
    for(int i = 1; i <= (n-3)/2; i++) {
      System.out.print(" ");
    }
    System.out.println("*");
  }
}
