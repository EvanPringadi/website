package College.Algoritma.ArrayStructArray;

import java.util.Scanner;

class Mahasiswa {
  double IP;
  String Nama, NIM;
  Matkul[] matkul;
}
class Matkul{
  int aa;
  String na;
  double ina;
}
public class ArrayStructArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = Integer.parseInt(sc.nextLine());
    Mahasiswa[] mahasiswa = new Mahasiswa[jumlah];

    //input
    for (int i = 0; i < jumlah; i++) {
      mahasiswa[i] = new Mahasiswa();
      mahasiswa[i].matkul = new Matkul[8];
      //dengan urutan index 0 Desain Web SKS 2
      //dengan urutan index 1 Algoritma dan Pemrograman SKS 4
      //dengan urutan index 2 Praktikum Algoritma dan Pemrograman SKS 1
      //dengan urutan index 3 Pengantar Teknologi Informasi SKS 3
      //dengan urutan index 4 Agama SKS 2
      //dengan urutan index 5 English 1 SKS 2
      //dengan urutan index 6 Core Skills and Character SKS 2
      //dengan urutan index 7 Kalkulus 1 SKS 2

      mahasiswa[i].Nama = "Evan Ashley";
      mahasiswa[i].NIM = "1124012";

      //data dummy
      for (int j = 0; j < 8 ; j++) {
        mahasiswa[i].matkul[j] = new Matkul();
        mahasiswa[i].matkul[j].aa = 100;
      }

    }

    //hitung aa na ina ip
    for (int i = 0; i < jumlah; i++) {
      for (int j = 0; j < 8; j++) {
        if (mahasiswa[i].matkul[j].aa  >= 80) {
          mahasiswa[i].matkul[j].na = "A";
          mahasiswa[i].matkul[j].ina = 4.00;
        } else {
          if (mahasiswa[i].matkul[j].aa  >= 76) {
            mahasiswa[i].matkul[j].na = "A-";
            mahasiswa[i].matkul[j].ina = 3.70;
          } else {
            if (mahasiswa[i].matkul[j].aa  >= 72) {
              mahasiswa[i].matkul[j].na = "B+";
              mahasiswa[i].matkul[j].ina = 3.40;
            } else {
              if (mahasiswa[i].matkul[j].aa  >= 68) {
                mahasiswa[i].matkul[j].na = "B";
                mahasiswa[i].matkul[j].ina = 3.00;
              } else {
                if (mahasiswa[i].matkul[j].aa  >= 64) {
                  mahasiswa[i].matkul[j].na = "B-";
                  mahasiswa[i].matkul[j].ina = 2.70;
                } else {
                  if (mahasiswa[i].matkul[j].aa  >= 60) {
                    mahasiswa[i].matkul[j].na = "C+";
                    mahasiswa[i].matkul[j].ina = 2.40;
                  } else {
                    if (mahasiswa[i].matkul[j].aa  >= 56) {
                      mahasiswa[i].matkul[j].na = "C";
                      mahasiswa[i].matkul[j].ina = 2.00;
                    } else {
                      if (mahasiswa[i].matkul[j].aa  >= 41) {
                        mahasiswa[i].matkul[j].na = "D";
                        mahasiswa[i].matkul[j].ina = 1.00;
                      } else {
                        mahasiswa[i].matkul[j].na = "E";
                        mahasiswa[i].matkul[j].ina = 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      mahasiswa[i].IP = (mahasiswa[i].matkul[0].ina*2 +mahasiswa[i].matkul[1].ina*4 + mahasiswa[i].matkul[2].ina + mahasiswa[i].matkul[3].ina*3 + mahasiswa[i].matkul[4].ina*2 + mahasiswa[i].matkul[5].ina*2 + mahasiswa[i].matkul[6].ina*2 + mahasiswa[i].matkul[7].ina*2)/18;
    }

    //cetak hasil
    System.out.println("                 Hasil Belajar Semester 1 IF-2020");
    System.out.println("No  NIM       Nama           MK1  MK2  MK3  MK4  MK5  MK6  MK7  MK8    IP");
    for (int i = 0; i < mahasiswa.length; i++) {
      System.out.printf("%d  %8s  %12s   ",(i+1), mahasiswa[i].NIM, mahasiswa[i].Nama);
      for (int k = 0; k < 8; k++) {
        System.out.printf("%2s/2 ", mahasiswa[i].matkul[k].na);
      }
      System.out.printf("  %.2f%n",mahasiswa[i].IP);
    }
    sc.close();
  }
}