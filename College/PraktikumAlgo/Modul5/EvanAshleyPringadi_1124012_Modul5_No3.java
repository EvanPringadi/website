package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No3 {
  static int totalSemuaPelanggan = 0;
  static int totalSatuPelanggan = 0;
  public static void hitungTotalTehManis(int _jumlah){
      totalSatuPelanggan += _jumlah*5000;
  }
  public static void hitungTotalSpageti(int _jumlah){
    totalSatuPelanggan += _jumlah*13000;
  }
  public static void hitungTotalNasiAyamGeprek(int _jumlah){
    totalSatuPelanggan += _jumlah*15000;
  }
  public static void hitungTotalSapiLadaHitam(int _jumlah){
    totalSatuPelanggan += _jumlah*17000;
  }
  public static void hitungTotalRamen(int _jumlah){
    totalSatuPelanggan += _jumlah*20000;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------");
    System.out.println("Teh Manis 5k");
    System.out.println("Spageti 13k");
    System.out.println("Nasi Ayam Geprek 15k");
    System.out.println("Nasi Sapi Lada Hitam 17k");
    System.out.println("Ramen 20k");
    System.out.println("--------------------------");
    String nama = "test";
    String konsumsi = "test";
    while (!nama.equals("")) {
      System.out.print("Masukkan nama: ");
      nama = sc.nextLine();
      while(!konsumsi.equals("")){
        System.out.print("Masukkan nama makanan/minuman:");
        konsumsi = sc.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        switch (konsumsi) {
          case "teh manis":
            hitungTotalTehManis(jumlah);
            break;
          case "spageti":
            hitungTotalSpageti(jumlah);
            break;
          case "nasi ayam geprek":
            hitungTotalNasiAyamGeprek(jumlah);
            break;
          case "nasi sapi lada hitam":
            hitungTotalSapiLadaHitam(jumlah);
            break;
          case "ramen":
            hitungTotalRamen(jumlah);
            break;
        }
      }
      double totalBayar = totalSatuPelanggan * 1.16;
      System.out.println("Total Makanan: "+ totalSatuPelanggan);
      System.out.println("Total Bayar: " + totalBayar);

      totalSemuaPelanggan += totalBayar;
      totalSatuPelanggan = 0;
    }
    System.out.println("Total Pendapatan Restoran: "+ totalSemuaPelanggan);
    double ppn = totalSemuaPelanggan * 11/116;
    System.out.println("Total PPN: "+ ppn);
    double service = totalSemuaPelanggan * 5/116;
    System.out.println("Total Service Charge: "+ service);
    double profit = totalSemuaPelanggan * 55 / 116;
    System.out.println("Total Keuntungan: "+profit);
    sc.close();
  }
}
