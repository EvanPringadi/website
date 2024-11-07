package College.Algoritma.array;
import java.util.Scanner;

public class nilaiMahasiswa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int jMhs = 10;
    String NIM[] = new String[jMhs];
    String nama[] = new String[jMhs];
    int quis[] = new int[jMhs];
    int uts[] = new int[jMhs];
    int uas[] = new int[jMhs];
    float na[] = new float[jMhs];

    //baca data
    for (int i = 0; i <= jMhs-1; i++) {
      System.out.print("Masukkan NIM Mahasiswa "+(i+1)+": ");
      NIM[i] = sc.nextLine();
      System.out.print("Masukkan Nama Mahasiswa "+(i+1)+": ");
      nama[i] = sc.nextLine();
      System.out.print("Masukkan Nilai Quiz Mahasiswa "+(i+1)+": ");
      quis[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan Nilai UTS Mahasiswa "+(i+1)+": ");
      uts[i] = Integer.parseInt(sc.nextLine());
      System.out.print("Masukkan Nilai UAS Mahasiswa "+(i+1)+": ");
      uas[i] = Integer.parseInt(sc.nextLine());
    }

    //hitung na
    for (int i = 0; i <= jMhs-1; i++) {
      na[i] = quis[i]/4 + uts[i]*7/20 + uas[i]*2/5;
    }

    //cari juara 1 dan 2
    int temp1 = 0;
    int temp2 = 0;
    for (int i = 0; i <= jMhs-1; i++) {
      if(na[i] > na[temp2]) {
        temp1 = i;
      }
    }
    for (int i = 0; i <= jMhs-1; i++) {
      if(i!=temp1) {
        if (na[i] > na[temp2]) {
          temp2 = i;
        }
      }
    }

    System.out.println
    ("                Daftar Nilai                 ");
    System.out.println("---------------------------------------------");
    System.out.println
    ("no.   NIM    Nama     Quis  UTS  UAS   NA");
    System.out.println("---------------------------------------------");
    
    for (int i = 0; i < na.length; i++) {
      System.out.println
      ((i+1)+". "+ NIM[i] + "   " + nama[i] + "     "+quis[i]+"   " + uts[i] +"  " + uas[i] + "  " + na[i]);
      System.out.println("---------------------------------------------");
    }
    
    System.out.println("juara 1: " + NIM[temp1] + "   " + nama[temp1] + "   " + na[temp1]);
    System.out.println("juara 1: " + NIM[temp1] + "   " + nama[temp1] + "   " + na[temp1]);
  }
}
