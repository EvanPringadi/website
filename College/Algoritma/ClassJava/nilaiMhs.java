package College.Algoritma.ClassJava;

import java.util.Scanner;

public class nilaiMhs {
  int nil1, nil2, nil3 , nil4, nil5, nilUTS, nilUAS;
  double rQuis, nilAkhir;
  char nilMutu;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            
    // deklarasi
    nilaiMhs mhs = new nilaiMhs();
    
    // baca data
    System.out.print("Masukkan nilai kuis 1: ");
    mhs.nil1 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai kuis 2: ");
    mhs.nil2 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai kuis 3: ");
    mhs.nil3 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai kuis 4: ");
    mhs.nil4 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai kuis 5: ");
    mhs.nil5 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai UTS: ");
    mhs.nilUTS = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan nilai UAS: ");
    mhs.nilUAS = Integer.parseInt(sc.nextLine());

    // hitung
    mhs.rQuis = rataQuis(mhs.nil1, mhs.nil2, mhs.nil3, mhs.nil4, mhs.nil5);
    mhs.nilAkhir = angkaAkhir(mhs.rQuis, mhs.nilUTS, mhs.nilUAS);
    mhs.nilMutu = hurufMutu(mhs.nilAkhir);
            
    //cetak hasil
    System.out.println(mhs.nilMutu);
      
  }           
 
  public static double rataQuis(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5) {
      int lowest = nilai1;
      if (nilai2 < lowest) {
        nilai2 = 0;
      }
      if (nilai3 < lowest) {
        nilai3 = 0;
      }
      if (nilai4 < lowest) {
        nilai4 = 0;
      }
      if (nilai5 < lowest) {
        nilai5 = 0;
      }
      
      double rataKuis = ((nilai1+nilai2+nilai3+nilai4+nilai5)/4.0);
      return rataKuis;
  }

  public static double angkaAkhir(double kuis, int uts, int uas) {
    double na = kuis/5 + uts*3/10 + uas/2;
    return na;
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
