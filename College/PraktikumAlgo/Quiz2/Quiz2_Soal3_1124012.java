package College.PraktikumAlgo.Quiz2;

import java.util.Scanner;

public class Quiz2_Soal3_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan string: ");
    String string = sc.nextLine();
    System.out.print("Masukkan separator: ");
    char[] separator = sc.nextLine().toCharArray();

    char[] huruf = string.toCharArray();
    String[] Kata = new String[100];
    for (int i = 0; i < 100; i++) {
      Kata[i] = "";
    }
    int kata = 0;
    for (int i = 0; i < huruf.length; i++) {
      if(huruf[i] != separator[0]) {
        Kata[kata] += huruf[i];
      } else{
        kata++;
      }

    }
    System.out.print("[");
    for (int i = 0; i < 100; i++) {
      if(i != 99) {
        if (Kata[i+1].equalsIgnoreCase("")) {
          System.out.print(Kata[i]);
        } else {
          System.out.print(Kata[i] + ", ");
        }
      } else {
        System.out.print(Kata[i]);
      }
    }
    System.out.println("]");
    sc.close();
  }
}
