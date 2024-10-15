package College.Algoritma;

import java.util.Scanner;

public class hargaitem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Isi karakter Anda... (K/W)");
    String karakter = sc.nextLine().toLowerCase();
    System.out.println("Excallibur/Bow of light... (E/B)");
    String belanja = sc.nextLine().toLowerCase();
    System.out.println("Berapa...");
    int quantity = Integer.parseInt(sc.nextLine());

    double totalZeny = 0;
    int bonusExcallibur =0;
    double potonganWindwalker;

    if (karakter.equalsIgnoreCase("k")) {
      if (belanja.equalsIgnoreCase("e")) {
        totalZeny = quantity*75000;
        bonusExcallibur = quantity/3;
      } else {
        totalZeny = quantity*90000;
      }
    } else {
      int kelipatan2Quantity = quantity /2;
      if (kelipatan2Quantity > 5) {
        kelipatan2Quantity = 5;
      }
      potonganWindwalker = kelipatan2Quantity*0.05;

      if (belanja.equalsIgnoreCase("e")) {
        totalZeny = quantity * 70000 * (1-potonganWindwalker);
      } else {
        totalZeny = quantity * 100000 * (1-potonganWindwalker); 
      }
    }
    if (bonusExcallibur > 0 ) {
      System.out.println("Total harga adalah " + totalZeny + " untuk pembelian " + quantity + " Excallibur dengan bonus " + bonusExcallibur + " Excallibur");
    } else {
      System.out.println("Total harga adalah " +totalZeny);
    }
  }
}
