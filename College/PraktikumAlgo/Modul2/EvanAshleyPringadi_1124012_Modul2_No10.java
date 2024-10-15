package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Saldo ATM...");
    int saldo = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan Tipe Makanan yang diinginkan...(berat/ringan/jajan)");
    String tipe = sc.nextLine().toLowerCase();
    System.out.println("Masukkan Kondisi Kesehatan...('sehat'/'tidak sehat')");
    String kesehatan = sc.nextLine().toLowerCase();

    String budget = "";
    if (saldo > 1000000) {
      budget = "high";
    } else if ( saldo >= 500000) {
      budget = "med";
    } else {
      budget = "low";
    }

    String sugesti = "tidak ada yang sesuai";
    
    if (budget.equalsIgnoreCase("low")) {
      if (tipe.equalsIgnoreCase("berat")) {
        if(kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Indomie";
        }
      }
    } else if (budget.equalsIgnoreCase("med")) {
      if (tipe.equalsIgnoreCase("berat")) {
        if (kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Betuah, Sukarasa, Yez, Indomie";
        } else {
          sugesti = "Sukarasa";
        }
      } else if (tipe.equalsIgnoreCase("ringan")) {
        if (kesehatan == "sehat") {
          sugesti = "Batagor";
        }
      } else {
        if (kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Mixue, Roti Kukus";
        } else {
          sugesti = "Roti Kukus";
        }
      }
    } else {
      if (tipe.equalsIgnoreCase("berat")) {
        if (kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Richeese, Betuah, Sukarasa, Yez, Indomie";
        } else {
          sugesti = "Sukarasa";
        }
      } else if (tipe.equalsIgnoreCase("ringan")) {
        
        if (kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Kebab, Batagor";
        }
      } else {
        if (kesehatan.equalsIgnoreCase("sehat")) {
          sugesti = "Gelato, Mixue, Roti Kukus";
        } else {
          sugesti = "Gelato, Roti Kukus";
        }
      }
    }

    System.out.println(sugesti);


  }
}
