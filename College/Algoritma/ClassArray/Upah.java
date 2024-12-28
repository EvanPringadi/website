package College.Algoritma.ClassArray;

import java.util.Scanner;

public class Upah {
  String Nama, NIK;
  int upahBiasa, upahLembur, upahWeekend, upahTotal;
  int[] hari = new int[7];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah karyawan: ");
    int jmlh = Integer.parseInt(sc.nextLine());
    Upah[] karyawan = new Upah[jmlh];
    for (int i = 0; i < jmlh; i++) {
      karyawan[i] = new Upah();
      //baca data
      System.out.print("Masukkan NIK karyawan: ");
      karyawan[i].NIK = sc.nextLine();
      System.out.print("Masukkan nama karyawan: ");
      karyawan[i].Nama = sc.nextLine();
      for (int j = 0; j < 7; j++) {
        System.out.print("Masukkan jam kerja hari ke-"+(j+1)+": ");
        karyawan[i].hari[j] = Integer.parseInt(sc.nextLine());
      }
      
      //hitung upah
      int upahBiasaSemuaKaryawan = 0;
      int upahLemburSemuaKaryawan = 0;
      int upahWeekendSemuaKaryawan = 0;
      int upahTotalSemuaKaryawan = 0;
      for (int j = 0; j < jmlh; j++) {
        int jamBiasa = 0;
        int jamLembur = 0;
        int jamWeekend = 0;
        for (int k = 0; k < 5; k++) {
          jamBiasa += karyawan[i].hari[k];
        }
        if(jamBiasa > 40) {
          jamLembur = jamBiasa - 40;
          jamBiasa = 40;
        }
        for (int k = 5; k < 7; k++) {
          jamWeekend += karyawan[i].hari[k];
        }
        karyawan[i].upahBiasa = upahBiasa(jamBiasa);
        karyawan[i].upahLembur = upahLembur(jamLembur);
        karyawan[i].upahWeekend = upahWeekend(jamWeekend);
        karyawan[i].upahTotal = karyawan[i].upahBiasa + karyawan[i].upahLembur + karyawan[i].upahWeekend;

        upahBiasaSemuaKaryawan += karyawan[i].upahBiasa;
        upahLemburSemuaKaryawan += karyawan[i].upahLembur;
        upahWeekendSemuaKaryawan += karyawan[i].upahWeekend;
        upahTotalSemuaKaryawan += karyawan[i].upahTotal;
      }

      //print
      System.out.println("Daftar Gaji");
      System.out.println("--------------------------------------------------------------");
      System.out.println("No.  NIK       Nama       UBiasa    ULembur   UWeekend   Total");
      System.out.println("--------------------------------------------------------------");
      for (int j = 0; j < jmlh; j++) {
        System.out.println((j+1)+".  "+karyawan[i].NIK+"   "+karyawan[i].Nama+"   "+karyawan[i].upahBiasa+"    "+karyawan[i].upahLembur+"    "+karyawan[i].upahWeekend+"   "+karyawan[i].upahTotal);
      }
      System.out.println("Total                     "+upahBiasaSemuaKaryawan+"   "+ upahLemburSemuaKaryawan+"   "+upahWeekendSemuaKaryawan+"   "+upahTotalSemuaKaryawan);

      sc.close();
    }
  }
  public static int upahBiasa(int jam) {
    return 10000*jam;
  }
  public static int upahLembur(int jam) {
    return 10000*jam*3/2;
  }
  public static int upahWeekend(int jam) {
    return 10000*jam*2;
  }
}
