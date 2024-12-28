package College.Algoritma.ClassArray;

import java.util.Scanner;

public class NilaiMhsNestedArray {
  String NIM, nama;
  int[] nil = new int[5];
  int nilUTS, nilUAS;
  double rQuis, nilAkhir;
  char nilMutu;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jmhs = Integer.parseInt(sc.nextLine());
    NilaiMhsNestedArray[] mhs = new NilaiMhsNestedArray[jmhs];

    //baca data
    for (int i = 0; i < jmhs; i++) {
      mhs[i] = new NilaiMhsNestedArray();
      System.out.print("Masukkan NIM mahasiswa "+(i+1)+" : ");
      mhs[i].NIM = sc.nextLine();
      System.out.print("Masukkan nama mahasiswa "+(i+1)+" : ");
      mhs[i].nama = sc.nextLine();

      for (int j = 0; j < 5; j++) {
        System.out.print("Masukkan nilai kuis "+(i+1)+" mahasiswa " + (i+1) + " : ");
        mhs[i].nil[j] = Integer.parseInt(sc.nextLine());
      }

      System.out.print("Masukkan nilai uts mahasiswa " + (i+1) + " : ");
      mhs[i].nilUTS = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan nilai uas mahasiswa " + (i+1) + " : ");
      mhs[i].nilUAS = Integer.parseInt(sc.nextLine());
    }

    //hitung
    for (int i = 0; i < jmhs; i++) {
      mhs[i].rQuis = rataQuis(mhs[i].nil[0], mhs[i].nil[1], mhs[i].nil[2], mhs[i].nil[3], mhs[i].nil[4]);
      mhs[i].nilAkhir = angkaAkhir(mhs[i].rQuis, mhs[i].nilUTS, mhs[i].nilUAS);
      mhs[i].nilMutu = hurufMutu(mhs[i].nilAkhir);
    }

    //print
    System.out.println("Daftar Nilai");
    System.out.println("--------------------------------------------------------------------------------------");
    System.out.println("no.   NIM    Nama  Quis  UTS  UAS  NA");
    for (int i = 1; i <= jmhs; i++) {
      System.out.println(i+".  "+mhs[i-1].NIM+"  "+mhs[i-1].nama+"  "+mhs[i-1].rQuis+"   "+mhs[i-1].nilUTS+"  "+mhs[i-1].nilUAS+"  "+mhs[i-1].nilAkhir);
    }

    //sort
    for (int i = jmhs-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (mhs[j].nilAkhir > mhs[j+1].nilAkhir) {
          NilaiMhsNestedArray temp;
          temp = mhs[j+1];
          mhs[j+1] = mhs[j];
          mhs[j] = temp;
        }
      }
    }

    //print juara
    System.out.println("Juara");
    System.out.println("1.  "+mhs[jmhs-1].NIM+"  "+mhs[jmhs-1].nama+"  "+mhs[jmhs-1].rQuis+"   "+mhs[jmhs-1].nilUTS+"  "+mhs[jmhs-1].nilUAS+"  "+mhs[jmhs-1].nilAkhir);
    System.out.println("2.  "+mhs[jmhs-2].NIM+"  "+mhs[jmhs-2].nama+"  "+mhs[jmhs-2].rQuis+"   "+mhs[jmhs-2].nilUTS+"  "+mhs[jmhs-2].nilUAS+"  "+mhs[jmhs-2].nilAkhir);

    sc.close();
  }

  public static double rataQuis(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5) {
    int[] nilai = {nilai1, nilai2, nilai3, nilai4, nilai5};
    int total = 0, lowest = nilai[0];
    for (int n : nilai) {
        total += n;
        if (n < lowest) {
            lowest = n;
        }
    }
    total -= lowest; // Subtract the lowest score
    return total / 4.0;
  }

  public static double angkaAkhir(double kuis, int uts, int uas) {
    return kuis/5 + uts*3/10 + uas/2;
  }

  public static char hurufMutu(double na) {
    char aa = 'e';
    if (na >= 90) {
      aa = 'a';
    } else {
      if (na >= 80) {
        aa = 'b';
      } else {
        if (na >= 70) {
          aa = 'c';
        } else {
          if (na >= 60) {
            aa = 'd';
          }
        }
      }
    }
    return aa;
  }
}
