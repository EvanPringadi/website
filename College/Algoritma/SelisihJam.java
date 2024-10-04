package College.Algoritma;
import java.util.Scanner;

public class SelisihJam { 
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Jam Masuk...");
    int jamMasuk = sc.nextInt();
    System.out.println("Masukkan Menit Masuk...");
    int menitMasuk = sc.nextInt();
    System.out.println("Masukkan Detik Masuk...");
    int detikMasuk = sc.nextInt();

    System.out.println("Masukkan Jam Keluar...");
    int jamKeluar = sc.nextInt();
    System.out.println("Masukkan Menit Keluar...");
    int menitKeluar = sc.nextInt();
    System.out.println("Masukkan Detik Keluar...");
    int detikKeluar = sc.nextInt();

    int totalDetikMasuk = (jamMasuk*3600) + (menitMasuk*60) + detikMasuk;
    int totalDetikKeluar = (jamKeluar*3600) + (menitKeluar*60) + detikKeluar;

    int totalDetikDurasi = totalDetikKeluar - totalDetikMasuk;
    int jamDurasi = totalDetikDurasi/3600;
    int sisaDetikDurasi = jamDurasi%3600;
    int menitDurasi = sisaDetikDurasi/60;
    int detikDurasi = sisaDetikDurasi%60;

    System.out.println(jamDurasi + ":" + menitDurasi + ":" + detikDurasi);

  } 
}