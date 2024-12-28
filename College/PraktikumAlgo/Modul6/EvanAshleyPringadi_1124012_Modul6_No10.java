package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hasil = 0;
    System.out.print("Masukkan jumlah angka: ");
    int[] num = new int[Integer.parseInt(sc.nextLine())];
    for (int i = 0; i < num.length; i++) {
      System.out.print("Masukkan angka: ");
      num[i] = Integer.parseInt(sc.nextLine());
    }
    System.out.print("Masukkan batas bawah: ");
    int batasBawah = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan batas atas: ");
    int batasAtas = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < num.length; i++) {
      if (num[i] > batasBawah && num[i] < batasAtas) {
        hasil += num[i];
      }
    }
    System.out.println(hasil);
  }
}
