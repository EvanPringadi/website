package College.Algoritma.array;
import java.util.Scanner;

public class tabelCalonKaryawan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int jmlh = 10;
    String nama[] = new String[jmlh];
    int usia[] = new int[jmlh];
    int gelarSarjana[] = new int[jmlh];
    int usiaIjazah[] = new int[jmlh];
    double ipk[] = new double[jmlh];
    boolean hasil[] = new boolean[jmlh];

    //baca data
    for (int i = 0; i < jmlh; i++) {
      System.out.print("Masukkan Nama Calon: ");
      nama[i] = sc.nextLine();
      System.out.print("Masukkan Usia Calon: ");
      usia[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan Gelar Sarjana(angka) Calon: ");
      gelarSarjana[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan Usia Ijazah(tahun): ");
      usiaIjazah[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan Nilai IPK: ");
      ipk[i] = Double.parseDouble(sc.nextLine());
    }

    //seleksi
    int terima = 0;
    for (int i = 1; i < jmlh; i++) {
      boolean diterima=true;
      if(usia[i] < 18 || ipk[i] < 2.75 || usiaIjazah[i]>6) {
        diterima = false;
      }
      if(gelarSarjana[i] == 1 && usia[i] > 30) {
        diterima = false;
      }
      if(gelarSarjana[i] == 2 && usia[i] > 35) {
        diterima = false;
      }
      if(gelarSarjana[i] == 3 && usia[i] > 40) {
        diterima = false;
      }
      hasil[i] = diterima;
      if (diterima) {
        terima += 1;
      }
    }


    //print
    System.out.println
    ("                Daftar Calon Karyawan                 ");
    System.out.println
    ("------------------------------------------------------");
    System.out.println
    ("no.    Nama     Usia   Pendidikan  IPK  Ijazah  Hasil ");
    System.out.println
    ("------------------------------------------------------");
    
    for (int i = 0; i < jmlh; i++) {
      System.out.print
      ((i+1)+". "+ nama[i] + "   " + usia[i] + "     S"+gelarSarjana[i]+"   " + ipk[i] +"  " + usiaIjazah[i] + "  ");
      if(hasil[i]){
        System.out.println("Diterima");
      } else{
        System.out.println("Tidak Diterima");
      }
    }
    System.out.println
    ("-----------------------------------------------------");
    
    System.out.println("Diterima: "+terima);
    System.out.println("Tidak Diterima: " + (jmlh-terima));
  }
}