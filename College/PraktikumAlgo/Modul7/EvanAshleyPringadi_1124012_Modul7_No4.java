package College.PraktikumAlgo.Modul7;

import java.util.Scanner;

class RecTamuRestoran {
  int nomorMeja;
  RecPesanan[] pesanan;
}
class RecPesanan {
  int nomorMenu, banyak;
}
public class EvanAshleyPringadi_1124012_Modul7_No4 {
  public static int hitungTamu(RecTamuRestoran customer) {
    int total = 0;
    for (int i = 0; i < 10; i++) {
      if(customer.pesanan[i] != null) {
        int hargaSatuan = 0;
        switch (customer.pesanan[i].nomorMenu) {
          case 1:
            hargaSatuan = 22000;
            break;
          case 2:
            hargaSatuan = 15000;
            break;
          case 3:
            hargaSatuan = 30000;
            break;
          case 4:
            hargaSatuan = 10000;
            break;
          case 5:
            hargaSatuan = 8000;
            break;
        }
        total += hargaSatuan * customer.pesanan[i].banyak;
      }
    }
    return total;
  }
  public static int hitungSemuaTamu(RecTamuRestoran[] restoran) {
    int totalSemua = 0;
    for (int i = 0; i < 100; i++) {
      if(restoran[i] != null) {
        totalSemua += hitungTamu(restoran[i]);
      }
    }
    return totalSemua;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    RecTamuRestoran[] tamu = new RecTamuRestoran[100];

    //init
    for (int i = 0; i < 100; i++) {
      tamu[i] = new RecTamuRestoran();
      tamu[i].pesanan = new RecPesanan[10];
      //input nomor meja
      for (int j = 0; j < 10; j++) {
        tamu[i].pesanan[j] = new RecPesanan();
        //input pesanan
      }
    }

    tamu[3].nomorMeja = 4;
    tamu[3].pesanan[0].nomorMenu = 3;
    tamu[3].pesanan[0].banyak = 2;
    
    tamu[7].nomorMeja = 7;
    tamu[7].pesanan[0].nomorMenu = 4;
    tamu[7].pesanan[0].banyak = 8;

    System.out.println("Total meja 3: " + hitungTamu(tamu[3]));
    System.out.println("Total semua meja: " + hitungSemuaTamu(tamu));
  }
}
