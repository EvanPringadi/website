package College.PraktikumAlgo.Modul1;
import java.util.Scanner;
public class EvanAshleyPringadi_1124012_Modul1_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Silakan Isi Waktu dalam Detik...");
    int totalDetik = sc.nextInt();
    int jumlahJam = totalDetik / 3600;
    int sisaDetik = totalDetik % 3600;
    int jumlahMenit = sisaDetik/60;
    int jumlahDetik = sisaDetik % 60;

    System.out.println("Jam = " + jumlahJam + ", Menit = " + jumlahMenit + ", Detik = " + jumlahDetik);
    System.out.println(totalDetik + " detik adalah " + jumlahJam + " jam, " + jumlahMenit + " menit, dan " + jumlahDetik + " detik.");
  }
}
