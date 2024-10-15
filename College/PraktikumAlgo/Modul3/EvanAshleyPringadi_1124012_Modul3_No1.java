package College.PraktikumAlgo.Modul3;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul3_No1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan jumlah mahasiswa...");
    int jumlahMahasiswa = Integer.parseInt(sc.nextLine());
    int totalNilai = 0;
    for (int i = 1; i <= jumlahMahasiswa; i++) {
      System.out.println("Masukkan nilai mahasiswa " + i);
      totalNilai += Integer.parseInt(sc.nextLine());
    }
    double rataNilai = totalNilai/jumlahMahasiswa;
    System.out.println(rataNilai);
  }
}
