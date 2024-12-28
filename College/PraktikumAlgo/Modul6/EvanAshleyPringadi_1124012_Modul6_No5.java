package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Insert String _:");
    String kata = sc.nextLine();
    char[] huruf = kata.toCharArray();

    System.out.print("Insert String 2_:");
    String kata2 = sc.nextLine();
    char[] hurufDelete = kata2.toCharArray();

    //ganti character
    for (int i = 0; i < huruf.length; i++) {
      for (int j = 0; j < hurufDelete.length; j++) {
        if (huruf[i] == hurufDelete[j]) {
          huruf[i] = '_';
        }
      }
    }

    //pindahin _
    for (int i = 0; i < huruf.length; i++) {
      for (int j = i+1; j < huruf.length; j++) {
        if (huruf[i] == '_' && huruf[j] != '_') {
          huruf[i] = huruf[j];
          huruf[j] = '_';
         }
      }
    }

    //print
    System.out.print("kata akhir: ");
    for (int x = 0; x < huruf.length; x++) {
      System.out.print(huruf[x]);
    }  
  }
}
