package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Jam Masuk...");
    int jamMasuk = sc.nextInt();
    System.out.println("Masukkan Menit Masuk...");
    int menitMasuk = sc.nextInt();

    System.out.println("Masukkan Jam Keluar...");
    int jamKeluar = sc.nextInt();
    System.out.println("Masukkan Menit Keluar...");
    int menitKeluar = sc.nextInt();

    int totalMenitMasuk = (jamMasuk*60) + menitMasuk;
    int totalMenitKeluar = (jamKeluar*60) + menitKeluar;

    int totalMenitDurasi = totalMenitKeluar - totalMenitMasuk;

    if (totalMenitDurasi < 0) {
      System.out.println("Input Error");
    } else {
      int jamDurasi = totalMenitDurasi /60;
      int sisaMenitDurasi = totalMenitDurasi%60;

      if(sisaMenitDurasi > 30) {
        jamDurasi += 1;
      }

      if (jamDurasi == 0) {
        System.out.println("Parkiran Anda Gratis!");
      } else {
        int totalParkirMobil = (jamDurasi - 1)*6000 + 3000;
      int totalParkirMotor = (jamDurasi - 1)*3000 + 1500;
      if (totalParkirMobil > 30000) {
        totalParkirMobil = 30000;
      }
      if (totalParkirMotor > 15000) {
        totalParkirMotor = 15000;
      }

      System.out.println("Harga Parkir untuk Mobil : Rp." + totalParkirMobil);
      System.out.println("Harga Parkir untuk Motor : Rp." + totalParkirMotor);
      }      
    }
  }
}
