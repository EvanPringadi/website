package College.PraktikumAlgo.Modul4;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul4_No1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = "Y";
    int max = 0;
    int totalAngka = 0;
    int counter = 0;
    while (input.equalsIgnoreCase("Y")) {
      System.out.print("Input Angka = ");
      int angka = Integer.parseInt(sc.nextLine());
      if (angka > max) {
        max = angka;
      }
      totalAngka += angka;
      counter++;

      System.out.print("Masih mau input?");
      input = sc.nextLine();
    }
    System.out.println("Nilai max : " + max);
    System.out.println("Nilai rata2 : " + (totalAngka/counter));
  }
}
