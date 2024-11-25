package College.PraktikumAlgo.Modul5;

import java.util.Scanner;
import java.lang.Math;

public class EvanAshleyPringadi_1124012_Modul5_No1 {
  public static void hitungPersegi(int _panjang) {
    System.out.println("Luas: " + (_panjang*_panjang));
    System.out.println("Keliling: " + (_panjang*4));
  }
  public static void hitungPersegiPanjang(int _panjang, int _lebar) {
    System.out.println("Luas: " + (_panjang*_lebar));
    System.out.println("Keliling: " + ((_panjang+_lebar)*2));
  }
  public static void hitungLingkaran(int _jariJari) {
    double luasLingkaran = 3.14 * _jariJari * _jariJari;
    double kelilingLingkaran = 3.14 * _jariJari * 2;
    System.out.println("Luas: " + luasLingkaran);
    System.out.println("Keliling: " + kelilingLingkaran);
  }
  public static void hitungSegitiga(int _sisi1, int _sisi2, int _sisi3) {
    double setengahKelilingSegitiga = (_sisi1 + _sisi2 + _sisi3)/2;
    double luasSegitiga = Math.sqrt(setengahKelilingSegitiga*(setengahKelilingSegitiga-_sisi1)*(setengahKelilingSegitiga-_sisi2)*(setengahKelilingSegitiga-_sisi3));
    System.out.println("Luas: " + luasSegitiga);
    System.out.println("Keliling: " + (setengahKelilingSegitiga*2));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hitung Luas dan Keliling");
    System.out.println("------------------------");
    System.out.println("Persegi (1)");
    System.out.println("Persegi Panjang (2)");
    System.out.println("Lingkaran (3)");
    System.out.println("Segitiga (4)");
    System.out.println("------------------------");
    System.out.print("Pilih Bangun Datar: ");
    int bangunDatar = Integer.parseInt(sc.nextLine());
    switch (bangunDatar) {
      case 1: 
      System.out.print("Masukkan panjang: ");
      int sisi = Integer.parseInt(sc.nextLine());
      hitungPersegi(sisi); break;
      case 2: 
      System.out.print("Masukkan panjang: ");
      int panjang = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan lebar: ");
      int lebar = Integer.parseInt(sc.nextLine());
      hitungPersegiPanjang(panjang, lebar); break;
      case 3: 
      System.out.print("Masukkan jari-jari: ");
      int jariJari = Integer.parseInt(sc.nextLine());
      hitungLingkaran(jariJari); break;
      case 4: 
      System.out.print("Masukkan panjang sisi 1: ");
      int sisi1 = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan panjang sisi 2: ");
      int sisi2 = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan panjang sisi 3: ");
      int sisi3 = Integer.parseInt(sc.nextLine());
      hitungSegitiga(sisi1, sisi2, sisi3); break;
    }
    sc.close();
  }
}
