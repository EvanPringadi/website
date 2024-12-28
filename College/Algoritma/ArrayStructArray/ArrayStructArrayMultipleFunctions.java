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
public class ArrayStructArrayMultipleFunctions {
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
        mahasiswa[i].matkul[j].aa = 70;
      }
    }

    //hitung aa na ina ip
    hitungNA(mahasiswa, jumlah);  
    hitungINA(mahasiswa, jumlah);
    hitungIP(mahasiswa, jumlah);
      
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
  public static void hitungIP(Mahasiswa[] student, int quantity) {
    for (int i = 0; i < quantity; i++) {
          student[i].IP = (student[i].matkul[0].ina*2 + student[i].matkul[1].ina*4 + student[i].matkul[2].ina + student[i].matkul[3].ina*3 + student[i].matkul[4].ina*2 + student[i].matkul[5].ina*2 + student[i].matkul[6].ina*2 + student[i].matkul[7].ina*2)/18;
    }
  }
  public static void hitungINA(Mahasiswa[] student, int quantity) {
    for (int index = 0; index < student.length; index++) {
      for (int j = 0; j < 8; j++) {
        switch (student[index].matkul[j].na) {
          case "A": student[index].matkul[j].ina = 4.00;break;
          case "A-": student[index].matkul[j].ina = 3.70;break;
          case "B+": student[index].matkul[j].ina = 3.40;break;
          case "B": student[index].matkul[j].ina = 3.00;break;
          case "B-": student[index].matkul[j].ina = 2.70;break;
          case "C+": student[index].matkul[j].ina = 2.40;break;
          case "C": student[index].matkul[j].ina = 2.00;break;
          case "D": student[index].matkul[j].ina = 1.00;break;
          case "E": student[index].matkul[j].ina = 0.00;break;
          default: break;
        }
      }
    }
  }
  public static void hitungNA(Mahasiswa[] student, int quantity) {
    for (int index = 0; index < quantity; index++) {
      for (int j = 0; j < 8; j++) {
        if (student[index].matkul[j].aa  >= 80) {
          student[index].matkul[j].na = "A";
        } else {
          if (student[index].matkul[j].aa  >= 76) {
            student[index].matkul[j].na = "A-";
          } else {
            if (student[index].matkul[j].aa  >= 72) {
              student[index].matkul[j].na = "B+";
            } else {
              if (student[index].matkul[j].aa  >= 68) {
                student[index].matkul[j].na = "B";
              } else {
                if (student[index].matkul[j].aa  >= 64) {
                  student[index].matkul[j].na = "B-";
                } else {
                  if (student[index].matkul[j].aa  >= 60) {
                    student[index].matkul[j].na = "C+";
                  } else {
                    if (student[index].matkul[j].aa  >= 56) {
                      student[index].matkul[j].na = "C";
                    } else {
                      if (student[index].matkul[j].aa  >= 41) {
                        student[index].matkul[j].na = "D";
                      } else {
                        student[index].matkul[j].na = "E";
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}