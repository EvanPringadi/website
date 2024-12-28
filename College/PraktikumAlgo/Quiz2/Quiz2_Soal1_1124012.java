package College.PraktikumAlgo.Quiz2;

import java.util.Scanner;

public class Quiz2_Soal1_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Panjang Lahan: ");
    int panjang = Integer.parseInt(sc.nextLine());
    int[] lahan = new int[panjang];

    for (int i = 0; i < panjang; i++) {
      System.out.print("Masukkan Lahan "+(i+1)+"(1 Tembok/0 Kosong): ");
      lahan[i] = Integer.parseInt(sc.nextLine());
    }

    int counter = 0;
    for (int i = 0; i < lahan.length; i++) {
      if(lahan[i] == 1) {
        for (int j = i+1; j < lahan.length; j++) {
          if(lahan[j] == 0) {
            counter++;
          } else {
            break;
          }
        }
      }
    }

    System.out.println(counter);
    sc.close();
  }
}