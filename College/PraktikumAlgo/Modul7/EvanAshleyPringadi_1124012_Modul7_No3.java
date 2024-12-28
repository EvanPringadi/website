package College.PraktikumAlgo.Modul7;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pasien = 0;
    final int jumlah = 10;
    Pasien[] dataPasien = new Pasien[jumlah];
    boolean masihMengisi = true;
    while(pasien < jumlah && masihMengisi) {
      dataPasien[pasien] = new Pasien();
      System.out.print("Masukkan nama: ");
      dataPasien[pasien].nama = sc.nextLine();
      System.out.print("Masukkan nama alamat: ");
      dataPasien[pasien].alamat = sc.nextLine();
      System.out.print("Masukkan nama telepon: ");
      dataPasien[pasien].telepon = sc.nextLine();

      System.out.print("Masukkan usia: ");
      dataPasien[pasien].usia = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan gender pasien(0(Pria)/1(Wanita)): ");
      dataPasien[pasien].gender = Integer.parseInt(sc.nextLine());

      System.out.print("Masukkan Keluhan: ");
      dataPasien[pasien].keluhan = sc.nextLine();
      System.out.println("Apakah Anda menggunakan BPJS? (true/false): ");
      dataPasien[pasien].BPJS = Boolean.parseBoolean(sc.nextLine());
      pasien++;
      System.out.print("Apakah ada pasien berikutnya? (true/false): ");
      masihMengisi = Boolean.parseBoolean(sc.nextLine());
    }
    System.out.println("Jumlah pasien: " + (pasien));
    System.out.print("Masukkan umur untuk jumlah pasien: ");
    int umur = Integer.parseInt(sc.nextLine());
    System.out.println("Jumlah pasien dengan BPJS di bawah umur "+umur+": "+hitungPasienUmur(umur, dataPasien, pasien));
    System.out.print("Masukkan nama pasien: ");
    String nama = sc.nextLine();
    int indexPasien = cariDataPasien(nama, dataPasien, pasien);
    System.out.println("Nama: " + dataPasien[indexPasien].nama);
    System.out.println("Alamat: " + dataPasien[indexPasien].alamat);
    System.out.println("Nomor Telepon: " + dataPasien[indexPasien].telepon);
    System.out.println("Usia: " + dataPasien[indexPasien].usia);
    String gender = "Pria";
    if (dataPasien[indexPasien].gender == 1) {
      gender = "Wanita";
    }
    System.out.println("Gender: " + gender);
    System.out.println("Keluhan: " + dataPasien[indexPasien].keluhan);
    System.out.println("BPJS: " + dataPasien[indexPasien].BPJS);
    sc.close();
  }
  static int hitungPasienUmur(int _umur, Pasien[] _dataPasien, int jumlah) {
    int pasien = 0;
    for (int i = 0; i < jumlah; i++) {
      if(_dataPasien[i].BPJS && _dataPasien[i].usia < _umur) {
        pasien++;
      }
    }
    return pasien;
  } 
  static int cariDataPasien(String _nama,  Pasien[] _dataPasien, int jumlah) {
    int pasien = 0;
    for (int i = 0; i < jumlah; i++) {
      if(_dataPasien[i].nama.equalsIgnoreCase(_nama)) {
        pasien = i;
      }
    }
    return pasien;
  }
}
class Pasien {
  String nama, alamat, telepon, keluhan;
  int usia, gender;
  boolean BPJS;
}