package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input jumlah nama = ");
    int jumlah = Integer.parseInt(sc.nextLine());
    String nama[] = new String[jumlah];
    for (int i = 0; i < nama.length; i++) {
      System.out.print("Masukkan nama: ");
      nama[i] = sc.nextLine();
    } 
    System.out.print("Input nama yang akan diganti =  ");
    String namaLama = sc.nextLine();
    System.out.print("Input nama baru = ");
    String namaBaru = sc.nextLine();
    for (int i = 0; i < nama.length; i++) {
      if(nama[i].equals(namaLama)) {
        nama[i] = namaBaru;
      }
    }
    System.out.print(nama[0]);
    for (int i = 1; i < nama.length; i++) {
      System.out.print(", " + nama[i]);
    }
  }
}
