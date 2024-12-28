package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Insert String _:");
    String kata = sc.nextLine();
    char[] huruf = kata.toCharArray();

    System.out.print("Insert String 2_:");
    String kata2 = sc.nextLine();
    char[] huruf2 = kata2.toCharArray();

    System.out.println(huruf);
    System.out.println(huruf2);

    String output = "tidak ada!";
    for (int i = 0; i < huruf.length-huruf2.length; i++) {
      boolean ditemukan = true;
      for (int j = 0; j < huruf2.length; j++) {
        if (huruf2[j] != huruf[i+j]) {
          ditemukan = false;
        }
      }
      if(ditemukan) {
        output = "ada!";
        break;
      }
    }
    System.out.println(output);
  }
}
