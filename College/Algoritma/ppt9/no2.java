package College.Algoritma.ppt9;

import java.util.Scanner;

public class no2 {
  public static char hurufMutu(double na) {
    char aa = 'e';
    if (na >= 90) {
      aa = 'a';
    } else {
      if (na >= 80) {
        aa = 'b';
      } else {
        if (na >= 70) {
          aa = 'c';
        } else {
          if (na >= 60) {
            aa = 'd';
          }
        }
      }
    }
    return aa;
  }
  public static double angkaAkhir(double kuis, int uts, int uas) {
    double na = kuis/5 + uts*3/10 + uas/2;
    return na;
  }
  public static double rataKuis(int k1, int k2, int k3, int k4, int k5) {
    int lowest = k1;
    if (k2 < lowest) {
      k2 = 0;
    }
    if (k3 < lowest) {
      k3 = 0;
    }
    if (k4 < lowest) {
      k4 = 0;
    }
    if (k5 < lowest) {
      k5 = 0;
    }
    if (lowest == k1) {
      k1 = 0;
    }
    double rataKuis = ((k1+k2+k3+k4+k5)/4);
    return rataKuis;
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
      System.out.print("Masukkan nilai kuis 5 mahasiswa " + i +": ");
      int e = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai uts mahasiswa " + i +": ");
      int x = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai uas mahasiswa " + i +": ");
      int y = Integer.parseInt(sc.nextLine());
      double rataKuis = rataKuis(a, b, c, d, e);
      System.out.println("Rata-rata kuis: " + rataKuis);
      double na = angkaAkhir(rataKuis, x, y);
      System.out.println("Nilai Akhir: "+na);
      char aa = hurufMutu(na);
      System.out.println("Huruf Mutu: " + aa);
    }
    sc.close();
  }
}
