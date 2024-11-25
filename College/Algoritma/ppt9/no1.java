package College.Algoritma.ppt9;

import java.util.Scanner;

public class no1 {
  public static double nilaiAkhir(int k1, int k2, int k3, int k4, int uts, int uas) {
    double na = ((k1+k2+k3+k4)/4)/5 + (uts)*3/10 + uas/2;
    return na;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= jumlah; i++) {
      System.out.print("Masukkan nilai kuis 1 mahasiswa " + i +": ");
      int a = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai kuis 2 mahasiswa " + i +": ");
      int b = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai kuis 3 mahasiswa " + i +": ");
      int c = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai kuis 4 mahasiswa " + i +": ");
      int d = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai uts mahasiswa " + i +": ");
      int x = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai uas mahasiswa " + i +": ");
      int y = Integer.parseInt(sc.nextLine());
      System.out.println(nilaiAkhir(a, b, c, d, x, y));
    }
  }
}
