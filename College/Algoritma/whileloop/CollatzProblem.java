package College.Algoritma.whileloop;
import java.util.Scanner;
public class CollatzProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = Integer.parseInt(sc.nextLine());

    while(angka != 1) {
      System.out.println(angka);
      if(angka % 2 == 1) {
        angka = angka*3 +1;
      } else {
        angka /= 2;
      }
    }
    System.out.println(angka);
  }
}
