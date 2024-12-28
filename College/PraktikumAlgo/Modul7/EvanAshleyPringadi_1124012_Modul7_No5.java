package College.PraktikumAlgo.Modul7;

import java.util.Objects;
import java.util.Scanner;

class DataKendaraan{
  String platNomor;
  int biaya;
  DataTol tol = new DataTol();
}
class DataTol{
  String masuk, keluar;
}

public class EvanAshleyPringadi_1124012_Modul7_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input Jumlah Kendaraan: ");
    int n = Integer.parseInt(sc.nextLine());
    DataKendaraan[] kendaraan = new DataKendaraan[n];
    int total= 0;
    for (int i = 0; i < n; i++) {
      kendaraan[i] = new DataKendaraan();
      System.out.print("Input plat nomor: ");
      kendaraan[i].platNomor = sc.nextLine();
      
      System.out.print("Input Gate masuk: ");
      kendaraan[i].tol.masuk = sc.nextLine().toLowerCase();
      System.out.print("Input Gate keluar: ");
      kendaraan[i].tol.keluar = sc.nextLine().toLowerCase();

      while(kendaraan[i].tol.masuk.equals(kendaraan[i].tol.keluar)) {
        System.out.println("input salah");
        System.out.print("Input Gate masuk: ");
        kendaraan[i].tol.masuk = sc.nextLine().toLowerCase();
        System.out.print("Input Gate keluar: ");
        kendaraan[i].tol.keluar = sc.nextLine().toLowerCase();
      }

      int in = gateIndex(kendaraan[i].tol.masuk);
      int out = gateIndex(kendaraan[i].tol.keluar);

      int[][] harga = {
        {0, 1000, 2000, 6500, 3210}, 
        {1400, 0, 8700, 5000, 6000},
        {5800, 10500, 0, 8000, 7000},
        {3500, 9800, 2300, 0, 10000},
        {7000, 2000, 3400, 9000, 0}
      };

      kendaraan[i].biaya = harga[in][out];
    }
    cetakDaftar(kendaraan, n);
  }
  public static void cetakDaftar(DataKendaraan[] data, int length) {
    int total = 0;
    System.out.printf("%s9       %5s  %5s %8s %n", "Plat", "masuk", "keluar", "biaya");
    for (int i = 0; i < length; i++) {
      System.out.printf("%10s %5s  %5s %10d %n", data[i].platNomor, data[i].tol.masuk, data[i].tol.keluar, data[i].biaya);

      total += data[i].biaya;
    }
    System.out.printf("%10s %5s  %5s %10d %n", "", "", "", total);
  }
  public static int gateIndex(String gate) {
    int gateIndex;
    switch (gate) {
      case "a": gateIndex = 0; break;
      case "b": gateIndex = 1; break;
      case "c": gateIndex = 2; break;
      case "d": gateIndex = 3; break;
      case "e": gateIndex = 4; break;
      default: gateIndex = 0; break;
    }
    return gateIndex;
  }
}
