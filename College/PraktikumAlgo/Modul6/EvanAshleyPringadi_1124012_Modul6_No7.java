package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No7 {
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
    //sort
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        if (num[i]< num[j]) {
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
        }
      }
    }

    int selisihMax = num[num.length-1] - num[0];
    int selisihMin = num[1] - num[0];

    System.out.println("Selisih Max: " + selisihMax);
    System.out.println("Selisih Min: " + selisihMin);
  }
}
