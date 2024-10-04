package College.Algoritma;
import java.util.Scanner;

public class ValidasiSegitiga {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan panjang sisi pertama...");
    int x = sc.nextInt();
    System.out.println("Masukkan panjang sisi kedua...");
    int y = sc.nextInt();
    System.out.println("Masukkan panjang sisi ketiga...");
    int z = sc.nextInt();

    boolean segitiga = false;

    if (x>= y && x>= z) {
      if (x < y+z) {
        segitiga = true;
      } else {
        segitiga = false;
      }
    } else if ( y >= x && y >= z) {
      if (y < x + z) {
        segitiga = true;
      } else {
        segitiga = false;
      }
    } else {
      if (z < x +y) {
        segitiga = true;
      } else {
        segitiga = false;
      }
    }
    System.out.println(" Apakah ketiga panjang sisi tersebut dapat membangun segitga, adalah " +segitiga);
  }
}
