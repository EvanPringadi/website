package College.PraktikumAlgo.Modul3;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul3_No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan jumlah pemilih...");
    int jumlahPemilih = Integer.parseInt(sc.nextLine());
    String jenisPeserta;
    int inputPeserta;
    int paslon1 = 0;
    int paslon2 = 0;
    int paslon3 = 0;

    for(int i = 1; i <= jumlahPemilih; i++) {
      System.out.println("Masukkan Jenis Pemilih " + i + "(mahasiswa/dosen)");
      jenisPeserta = sc.nextLine().toLowerCase();
      System.out.println("Masukkan Paslon pilihan pemilih " + i);
      inputPeserta = Integer.parseInt(sc.nextLine());

      switch(inputPeserta) {
        case 1: 
          if(jenisPeserta.equalsIgnoreCase("mahasiswa")) {paslon1 += 1;} else {paslon1 +=5;} break;
        
        case 2: 
          if(jenisPeserta.equalsIgnoreCase("mahasiswa"))   {paslon2 += 1;} else {paslon2 +=5;} break;

        case 3: 
          if(jenisPeserta.equalsIgnoreCase("mahasiswa")) {paslon3 += 1;} else {paslon3 +=5;} break;

      }
    }
    int paslonPemenang = 0;
    String paslonPemenangString = "";

    if (paslon1 > paslon2 && paslon1 > paslon3) {
      paslonPemenangString = "Paslon 1";
      paslonPemenang = paslon1;
    } else if (paslon2 > paslon1 && paslon2 > paslon3) {
      paslonPemenangString = "Paslon 2";
      paslonPemenang = paslon2;
    } else {
      paslonPemenang = paslon3;
      paslonPemenangString = "Paslon 3";
    }

    System.out.println("Paslon pemenang adalah "+paslonPemenangString+" = " + paslonPemenang);
  }
}
