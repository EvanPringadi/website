package College.Algoritma.basics;
import java.util.Scanner;

public class BBIdeal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Tinggi Badan(dapat dalam koma)...");
    double tinggiBadan = sc.nextDouble();
    double beratBadanIdeal = (tinggiBadan-100) *9/10;
    System.out.println("Berat badan ideal Anda adalah..." + beratBadanIdeal + " Kg");


  }
}
