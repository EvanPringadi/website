package College.PraktikumAlgo.UTS;

import java.util.Scanner;

public class UTS_Soal2_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: "); 
    String hasil = sc.nextLine(); // mendeklarasikan string untuk hasil
    int angka = Integer.parseInt(hasil); // mengambil angka yang diinput
    while(angka != 1) { //selama angka belum 1
      if(angka % 2 == 1) { //jika angka ganjil
        angka = angka*3 +1;
      } else { //jika angka genap
        angka /= 2;
      }
      hasil = Integer.toString(angka) + " " + hasil; //menambahkan hasil operasi ke string namun dari depan
    }
    System.out.print(hasil);
  }
}
