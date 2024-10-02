package College.PraktikumAlgo.Modul1;
import java.util.Scanner;
public class EvanAshleyPringadi_1124012_Modul1_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Silakan Isi Waktu dalam Detik...");
    int totalDetik = sc.nextInt();
    int sisaDetik = totalDetik;
    int jumlahJam = 0;
    int jumlahMenit = 0;
    int jumlahDetik = 0;

    if (totalDetik >= 3600){
      jumlahJam = totalDetik / 3600;
      sisaDetik = totalDetik % 3600;
    }
    if (sisaDetik >= 60) {
      jumlahMenit = sisaDetik/60;
      sisaDetik = sisaDetik % 60;
    }
    if (sisaDetik >= 0) {
      jumlahDetik = sisaDetik;
    }
    System.out.println("Jam = " + jumlahJam + ", Menit = " + jumlahMenit + ", Detik = " + jumlahDetik);
    System.out.println(totalDetik + " detik adalah " + jumlahJam + " jam, " + jumlahMenit + " menit, dan " + jumlahDetik + " detik.");
  }
}
