package College.Algoritma.whileloop;

import java.util.Scanner;

public class reverseInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = Integer.parseInt(sc.nextLine());
    int reverseInteger = 0;
    while(angka > 0) {
      reverseInteger *= 10;
      reverseInteger += angka%10;
      angka /= 10;
    }
    System.out.println(reverseInteger);
  }
}
