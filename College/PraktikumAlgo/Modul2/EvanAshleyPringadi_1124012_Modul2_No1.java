package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan angka 1 : ");
    int angka1 = Integer.parseInt(sc.nextLine());

    System.out.println("Masukkan angka 2 : ");
    int angka2 = Integer.parseInt(sc.nextLine());

    System.out.println("Masukkan angka 3 : ");
    int angka3 = Integer.parseInt(sc.nextLine());

    int bilanganGenap = 0;

    if (angka1%2 == 0) {
      bilanganGenap += 1;
    } else {
      bilanganGenap -= 1;
    }

    if (angka2%2 == 0) {
      bilanganGenap += 1;
    } else {
      bilanganGenap -= 1;
    }

    if (angka3%2 == 0) {
      bilanganGenap += 1;
    } else {
      bilanganGenap -= 1;
    }

    if (bilanganGenap > 0) {
      System.out.println("Hasil = Dominan Genap");
    } else {
      System.out.println("Hasil = Dominan Ganjil");
    }
  }
}