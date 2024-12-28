package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num[] = {3, 4, 5, 2, 3, 7, 4, 3, 5, 5, 5, 6, 1, 2, 3};
    String modus = "";
    int modusFrekuensi = 1;
    for (int i = 0; i < num.length; i++) {
      int currentModusFrekuensi = 1;
      int currentModus = num[i];
      for (int j = i+1; j < num.length; j++) {
        if(num[i] == num[j]) {
          currentModusFrekuensi++;
        }
      }
      if (currentModusFrekuensi > modusFrekuensi) {
        modus = Integer.toString(currentModus);
        modusFrekuensi = currentModusFrekuensi;
      } else if (currentModusFrekuensi == modusFrekuensi) {
        modus += ", " + Integer.toString(currentModus);
      }
    }
    System.out.println("Modus: " + modus);
  }
}
