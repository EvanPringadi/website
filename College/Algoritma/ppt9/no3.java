package College.Algoritma.ppt9;

import java.util.Scanner;

public class no3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan Tujuan: ");
    int destinasi = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan Umur: ");
    int umur = Integer.parseInt(sc.nextLine());
    int harga = hargaTiket(destinasi); 
    int potongan = diskon(harga, umur);
    System.out.println(bayar(harga, potongan));
  }
  public static int bayar(int harga, int diskon) {
    return harga - diskon;
  }
  public static int diskon(int harga, int umur) {
    int potongan = 0;
    if (umur >= 60 || umur <= 6) {
      potongan = harga / 2;
    }
    if (umur <= 59 && umur >= 7) {
      if (umur <= 12) {
        potongan = harga / 4;
      }
    }
    return potongan;
  }
  public static int hargaTiket(int tujuan) {
    int hargaTiket = 0;
    switch (tujuan) {
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
