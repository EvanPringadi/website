package College.Algoritma.whileloop;
import java.util.Scanner;

public class konversiBilangan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String biner = "";
    System.out.print("Masukkan angka: ");
    int angka = Integer.parseInt(sc.nextLine());

    while(angka > 0) {
      biner = angka % 2 + biner;
      angka /= 2;
    }

    System.out.println(biner);
  }
}