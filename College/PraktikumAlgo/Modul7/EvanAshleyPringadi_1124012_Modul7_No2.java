package College.PraktikumAlgo.Modul7;

import java.util.Scanner;

class Karyawan{
  String nama,jabatan;
  Alamat alamat = new Alamat();
  Penghasilan penghasilan = new Penghasilan();
}
class Alamat{
  String jalan, kota, provinsi;
}
class Penghasilan{
  Double gaji, tunjanganTransport, tunjanganMakan;
}

public class EvanAshleyPringadi_1124012_Modul7_No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlah = 3;
    Karyawan[] karyawan = new Karyawan[jumlah];
    for (int i = 0; i < jumlah; i++) {
      karyawan[i] = new Karyawan();

      System.out.print("Masukkan nama: ");
      karyawan[i].nama = sc.nextLine();
      System.out.print("Masukkan jabatan: ");
      karyawan[i].jabatan = sc.nextLine();

      karyawan[i].alamat = new Alamat();
      System.err.print("Masukkan Jalan: ");
      karyawan[i].alamat.jalan = sc.nextLine();
      System.err.print("Masukkan Kota: ");
      karyawan[i].alamat.kota = sc.nextLine();
      System.err.print("Masukkan Provinsi: ");
      karyawan[i].alamat.provinsi = sc.nextLine();

      karyawan[i].penghasilan = new Penghasilan();
      System.out.print("Masukkan Gaji: ");
      karyawan[i].penghasilan.gaji = Double.parseDouble(sc.nextLine());
      System.out.print("Masukkan Tunjangan Transport: ");
      karyawan[i].penghasilan.tunjanganTransport = Double.parseDouble(sc.nextLine());
      System.out.print("Masukkan Tunjangan Makan: ");
      karyawan[i].penghasilan.tunjanganMakan = Double.parseDouble(sc.nextLine());
    }
    sc.close();
  }
}

