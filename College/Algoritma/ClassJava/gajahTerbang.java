package College.Algoritma.ClassJava;

import java.util.Scanner;

public class gajahTerbang {
  int tujuan, umur, harga, diskon, bayar;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    gajahTerbang tiket = new gajahTerbang();

    System.out.print("Masukan Tujuan: ");
    tiket.tujuan = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan Umur: ");
    tiket.umur = Integer.parseInt(sc.nextLine());
    tiket.harga = hargaTiket(tiket.tujuan); 
    tiket.diskon = diskon(tiket.harga, tiket.umur);
    System.out.println(bayar(tiket.harga, tiket.diskon));
  }
  public static int bayar(int nominal, int potongan) {
    return nominal - potongan;
  }
  public static int diskon(int nominal, int usia) {
    int potongan = 0;
    if (usia >= 60 || usia <= 6) {
      potongan = nominal / 2;
    }
    if (usia <= 59 && usia >= 7) {
      if (usia <= 12) {
        potongan = nominal / 4;
      }
    }
    return potongan;
  }
  public static int hargaTiket(int destinasi) {
    int hargaTiket = 0;
    switch (destinasi) {
      case 1:
        hargaTiket = 280000;
        break;
      case 2:
        hargaTiket = 600000;
        break;
      case 3:
        hargaTiket = 215000;
        break;
      case 4:
        hargaTiket = 475000;
        break;
    }
    return hargaTiket;
  }
}
