package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No9 {
  static int baris;
  static int index;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan huruf: ");
    String huruf = sc.nextLine();
    String keyboard[][] = {
     {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
     {"a", "s", "d", "f", "g", "h", "j", "k", "l"}, 
     {"z", "x", "c", "v", "b", "n", "m"}
    };
    cekHuruf(huruf, keyboard);
    System.out.println("Input: " + huruf + "; Output: Baris " + baris + ", Huruf ke-" + index);
  }
  public static void cekHuruf(String _huruf, String[][] _keyboard) {
    for (int i = 0; i < _keyboard.length; i++) {
      for (int j = 0; j < _keyboard[i].length; j++) {
        if (_keyboard[i][j].equals(_huruf)) {
          baris = i + 1;
          index = j + 1;
        }
      }
    }
  }
}
