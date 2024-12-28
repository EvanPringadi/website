package College.PraktikumAlgo.Quiz2;

import java.util.Scanner;

import College.Algoritma.ifelse.parkirRumahSakit;

class Pasien {
  String nama, alamat, telepon;
  int usia;
  boolean BPJS;
  Penyakit penyakit;
}
class Penyakit {
  String namaPenyakit, deskripsi;
  Double harga;
}

public class Quiz2_Soal2_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pasien[] pasien = new Pasien[10];
    boolean mengisi = true;
    int jumlahPasien = 0;
    while(mengisi && jumlahPasien < 10) {
      pasien[jumlahPasien] = new Pasien();
      pasien[jumlahPasien].penyakit = new Penyakit();
      inputData(pasien, jumlahPasien);
      System.out.print("Apakah ingin input lagi?(true/false): ");
      mengisi = Boolean.parseBoolean(sc.nextLine());
      jumlahPasien++;
    } 
    if(jumlahPasien == 10) {
      System.out.println("Rumah sakit sudah penuh");
    }

    System.out.println("Total Pasien: "+jumlahPasien);
    int kosong = 10-jumlahPasien;
    System.out.println("Sisa Tempat: " + kosong);

    System.out.print("Masukkan kriteria usia: ");
    int kriteriaUsia = Integer.parseInt(sc.nextLine());
    System.out.println("Total pasien berusia kurang dari " + kriteriaUsia + " adalah " + kriteriaUsia(pasien, kriteriaUsia, jumlahPasien));

    System.out.print("Masukkan nama pasien: ");
    String namaPasien = sc.nextLine();
    cariDataPasien(pasien, namaPasien, jumlahPasien);

    System.out.print("Masukkan nama penyakit: ");
    String namaPenyakit = sc.nextLine();
    cariNamaPasien(pasien, namaPenyakit, jumlahPasien);
    sc.close();
  }
  public static void cariNamaPasien(Pasien[] _pasien, String penyakit, int _jumlahPasien) {
    String[] nama = new String[10];
    for (int i = 0; i < _jumlahPasien; i++) {
      if(_pasien[i].penyakit.namaPenyakit.equalsIgnoreCase(penyakit)) {
        nama[i] = _pasien[i].penyakit.namaPenyakit;
      }
    }
    System.out.print("Berikut nama nama yang terkena penyakit " + penyakit + ": ");
    for (int i = 0; i < _jumlahPasien; i++) {
      if(!nama[i].equalsIgnoreCase(null)) {
        System.out.print(_pasien[i].nama + " ");
      }
    }
    System.out.println();
  }
  public static void cariDataPasien(Pasien[] _pasien, String _nama, int _jumlahPasien) {
    for (int i = 0; i < _jumlahPasien; i++) {
      if (_pasien[i].nama.equalsIgnoreCase(_nama)) {
        System.out.println("Nama : " + _pasien[i].nama);
        System.out.println("Alamat : " + _pasien[i].alamat);
        System.out.println("Telepon : " + _pasien[i].telepon);
        System.out.println("Usia : " + _pasien[i].usia);
        System.out.println("BPJS : " + _pasien[i].BPJS);
        System.out.println("Nama Penyakit : " + _pasien[i].penyakit.namaPenyakit);
        System.out.println("Deskripsi : " + _pasien[i].penyakit.deskripsi);
        System.out.println("Harga : " + _pasien[i].penyakit.harga);
      }
    }
  }
  public static int kriteriaUsia(Pasien[] _pasien, int kriteria, int _jumlahPasien) {
    int count = 0;
    for (int i = 0; i < _jumlahPasien; i++) {
      if(_pasien[i].usia < kriteria) {
        count++;
      }
    }
    return count;
  }
  public static void inputData(Pasien[] _pasien, int index) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nama pasien: ");
    _pasien[index].nama = sc.nextLine();
    System.out.print("Masukkan alamat pasien: ");
    _pasien[index].alamat = sc.nextLine();
    System.out.print("Masukkan nomor telepon pasien: ");
    _pasien[index].telepon = sc.nextLine();
    System.out.print("Masukkan usia pasien: ");
    _pasien[index].usia = Integer.parseInt(sc.nextLine());
    System.out.print("Apakah pasien menggunakan BPJS? (true/false) : ");
    _pasien[index].BPJS = Boolean.parseBoolean(sc.nextLine());
    
    System.out.print("Masukkan penyakit pasien: ");
    _pasien[index].penyakit.namaPenyakit = sc.nextLine();
    System.out.print("Masukkan deskripsi penyakit pasien: ");
    _pasien[index].penyakit.deskripsi = sc.nextLine();
    System.out.print("Masukkan harga penyakit: ");
    _pasien[index].penyakit.harga = Double.parseDouble(sc.nextLine());
  }
}
