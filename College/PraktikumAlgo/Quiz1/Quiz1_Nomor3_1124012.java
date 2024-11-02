package College.PraktikumAlgo.Quiz1;

import java.util.Scanner;

public class Quiz1_Nomor3_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah awal bakteri: ");
    int bakteri = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan waktu dalam menit: ");
    int detik = Integer.parseInt(sc.nextLine())*60;
    int counter = 0;
    while(detik >= 7) {
      if(counter == 10) {
        bakteri -= 1;
      } //perhitungan kematian bakteri cukup sekali
        //Karena jika ada yang mati lagi, ada yang menggantikan

      bakteri *= 2;
      detik -= 7;
      counter++;
    }
    System.out.println(bakteri);
  }
}
