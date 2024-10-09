package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan usia Anda...");
    int umur = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan status menikah Anda...(True/False)");
    boolean statusMenikah = Boolean.parseBoolean(sc.nextLine().toLowerCase());

    if (umur < 18) {
      System.out.println("Untuk mengikuti lomba, minimal usia adalah 18 tahun");
    } else if (umur <= 30 && statusMenikah == false) {
      System.out.println("Anda dapat mengikuti Paduan Suara OMK Campuran");
    } else {
      System.out.println("Anda dapat mengikuti Paduan Suara Dewasa Campuran");
    }

  }
}
