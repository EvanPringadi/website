package College.PraktikumAlgo.Modul7;

import java.util.Scanner;

class Mahasiswa {
  String NIM, Nama;
  int[] Quiz, Nilai = new int[4];
  char NilaiHuruf;
}

public class EvanAshleyPringadi_1124012_Modul7_No6 {
  public static void cetakNilai(Mahasiswa[] _mahasiswa, int _jumlah) {
    System.out.println("No.  NIM      NAMA           QUIS  UTS  UAS  NA  N HURUF");
    for (int i = 0; i < _jumlah; i++) {
      System.out.printf("%2d. %8s %13s %5s %5s %4s %3s %5s %n", (i+1), _mahasiswa[i].NIM, _mahasiswa[i].Nama, _mahasiswa[i].Nilai[0], _mahasiswa[i].Nilai[1], _mahasiswa[i].Nilai[2], _mahasiswa[i].Nilai[3], _mahasiswa[i].NilaiHuruf);
    }
  }
  public static void cetakNilaiHuruf(Mahasiswa[] _mahasiswa, int _jumlah) {
    int[] TotalNilaiHuruf = {0,0,0,0,0};
    for (int i = 0; i < _jumlah; i++) {
      switch (_mahasiswa[i].NilaiHuruf) {
        case 'A': TotalNilaiHuruf[0]++; break;
        case 'B': TotalNilaiHuruf[1]++; break;
        case 'C': TotalNilaiHuruf[2]++; break;
        case 'D': TotalNilaiHuruf[3]++; break;
        case 'E': TotalNilaiHuruf[4]++; break;
      }
    }
    System.out.println("Nilai A : " + TotalNilaiHuruf[0] + " orang");
    System.out.println("Nilai B : " + TotalNilaiHuruf[1] + " orang");
    System.out.println("Nilai C : " + TotalNilaiHuruf[2] + " orang");
    System.out.println("Nilai D : " + TotalNilaiHuruf[3] + " orang");
    System.out.println("Nilai E : " + TotalNilaiHuruf[4] + " orang");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Jumlah Mahasiswa: ");
    int jumlah = Integer.parseInt(sc.nextLine());
    Mahasiswa[] mahasiswa = new Mahasiswa[jumlah];
    System.out.print("Masukkan Jumlah Quiz: ");
    int jumlahQuiz = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < jumlah; i++) {
      mahasiswa[i] = new Mahasiswa();
      mahasiswa[i].Quiz = new int[jumlahQuiz];
      //input
      //data dummy
      mahasiswa[i].NIM = "1124012";
      mahasiswa[i].Nama = "Evan Ashley";
      for (int j = 0; j < jumlahQuiz; j++) {
        mahasiswa[i].Quiz[j] = 90;
      }
      mahasiswa[i].Nilai[1] = 95;
      mahasiswa[i].Nilai[2] = 100;
    }

    //hitung Rata Quis dan NA
    for (int i = 0; i < jumlah; i++) {
      int total = 0;
      for (int j = 0; j < jumlahQuiz; j++) {
        total += mahasiswa[i].Quiz[j];
      }
      mahasiswa[i].Nilai[0] = total/jumlahQuiz;
      mahasiswa[i].Nilai[3] = (mahasiswa[i].Nilai[0] + mahasiswa[i].Nilai[1] + mahasiswa[i].Nilai[2])/3;

      if(mahasiswa[i].Nilai[3] >= 80) {
        mahasiswa[i].NilaiHuruf = 'A';
      } else if (mahasiswa[i].Nilai[3] >= 70) {
        mahasiswa[i].NilaiHuruf = 'B';
      } else if (mahasiswa[i].Nilai[3] >= 60) {
        mahasiswa[i].NilaiHuruf = 'C';
      } else if (mahasiswa[i].Nilai[3] >= 50) {
        mahasiswa[i].NilaiHuruf = 'D';
      } else {
        mahasiswa[i].NilaiHuruf = 'E';
      }

    }

    cetakNilai(mahasiswa, jumlah);
    cetakNilaiHuruf(mahasiswa, jumlah);

    sc.close();
  }
}