package College.Algoritma.forloop;
import java.util.Scanner;
public class frame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan nilai lebar...");
    int lebar = Integer.parseInt(sc.nextLine());

    System.out.println("Masukkan nilai tinggi...");
    int tinggi = Integer.parseInt(sc.nextLine());

    System.out.println("Masukkan nilai tebal...");
    int tebal = Integer.parseInt(sc.nextLine());

    for(int i = 1; i <= tebal; i++) {
      for(int j = 1; j<= lebar; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = tebal+1; i <= tinggi - tebal; i++) {
      for(int j = 1; j <= tebal; j++) {
        System.out.print("*");
      }
      for (int k = 1; k <= lebar - (2*tebal); k++) {
        System.out.print(" ");
      }
      for(int l = lebar-tebal; l < lebar; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = 1; i <= tebal; i++) {
      for(int j = 1; j<= lebar; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }  
}
