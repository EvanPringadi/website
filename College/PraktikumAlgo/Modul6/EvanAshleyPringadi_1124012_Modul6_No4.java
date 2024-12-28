package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //input jumlah
    System.out.print("Input jumlah peserta = ");
    int jumlah = Integer.parseInt(sc.nextLine());

    //deklarasi dan scan
    String[] nama = new String[jumlah];
    for (int i = 0; i < nama.length; i++) {
      System.out.print("Masukkan nama: ");
      nama[i] = sc.nextLine();
    } 
    //print
    System.out.print(nama[0]);
    for (int i = 1; i < nama.length; i++) {
      System.out.print(", " + nama[i]);
    }
    System.out.println();

    //input lompatan
    System.out.print("Input lompatan: ");
    int lompatan = Integer.parseInt(sc.nextLine());

    int pesertaTersisa = jumlah;
    int index = 0;
    while(pesertaTersisa > 1) {
        index = (index+lompatan-1) % pesertaTersisa;

        //print nama
        System.out.println("Eliminasi: " + nama[index]);

        //geser nama
        for (int i = index; i < pesertaTersisa - 1; i++) {
          nama[i] = nama[i+1];
        }

        //decrement
        pesertaTersisa--;
    }
    System.out.println("Pemenang: " + nama[0]);
    sc.close();
  }
}
