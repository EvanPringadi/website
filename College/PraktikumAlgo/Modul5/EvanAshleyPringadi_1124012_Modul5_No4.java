package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang balok: ");
    int p = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan lebar balok: ");
    int l = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan tinggi balok: ");
    int t = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan perbesaran: ");
    int n = Integer.parseInt(sc.nextLine());
    p = kaliPerbesaran(p, n);
    l = kaliPerbesaran(l, n);
    t = kaliPerbesaran(t, n);
    int volume = hitungVolume(p, l, t);
    System.out.print("Panjang Baru: " + p);
    System.out.print("Lebar Baru: " + l);
    System.out.print("Tinggi Baru: " + t);
    System.out.println("Volume: " + volume);
    sc.close();
  }
  public static int kaliPerbesaran(int ukuran, int _n) {
    return ukuran * _n;
  }
  public static int hitungVolume(int _p, int _l, int _t) {
    return _p * _l * _t;
  }
}
