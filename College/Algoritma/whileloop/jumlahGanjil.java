package College.Algoritma.whileloop;

import java.util.Scanner;

public class jumlahGanjil {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan batas: ");
    int batas = Integer.parseInt(sc.nextLine());
    int jumlah=0;
    int angka = 1;
    while(jumlah<batas) {
      jumlah += angka;
      angka += 2;
    }
    System.out.println(jumlah);
  }
}
