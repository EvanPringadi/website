package College.Algoritma;
import java.util.Scanner;

public class Swap3Variabel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan nilai pertama...");
    int x = sc.nextInt();
    System.out.println("Masukkan nilai kedua...");
    int y = sc.nextInt();
    System.out.println("Masukkan nilai ketiga...");
    int z = sc.nextInt();

    int a = 0;
    int b = 0;
    int c = 0;

    if (x <= y && x<=z) {
      a = x;
      if (y <= z) {
        b = y;
        c = z;
      } else {
        b = z;
        c = y;
      }
    } else if (y <= x && y <= z) {
      a = y;
      if (x <= z) {
        b = x;
        c = z;
      } else{
        b = z;
        c = x;
      }
    } else {
      a = z;
      if (x <= y) {
        b = x;
        c = y;
      } else {
        b = y;
        c = x;
      }
    }
    System.out.println(a + ", " + b + ", " + c);
  }
}

