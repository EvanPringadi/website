package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //input jumlah
    System.out.print("Input jumlah elemen = ");
    int jumlah = Integer.parseInt(sc.nextLine());

    //deklarasi dan scan
    int[] num = new int[jumlah];
    for (int i = 0; i < num.length; i++) {
      System.out.print("Masukkan angka: ");
      num[i] = Integer.parseInt(sc.nextLine());
    } 
    System.out.print("Masukkan angka yang dicari: ");
    int angka = Integer.parseInt(sc.nextLine());

    System.out.println("Hasil: " + numCounter(angka, num));
  }
  public static int numCounter(int find, int[] _num) {
    int count = 0;
    for (int i = 0; i < _num.length; i++) {
      if (_num[i] == find) {
        count++;
      }
    }
    return count;
  }
}
