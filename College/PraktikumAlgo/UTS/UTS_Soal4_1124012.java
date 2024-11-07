package College.PraktikumAlgo.UTS;
import java.util.*;
public class UTS_Soal4_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double g = 9.81;
    System.out.print("Masukkan kecepatan awal(m/s): ");
    double v = Double.parseDouble(sc.nextLine());
    if (v < 0) {
      System.out.println("Kecepatan awal tidak boleh negatif. Program dihentikan. ");
      sc.close();
    } else {
      System.out.print("Masukkan sudut kemiringan: ");
      int angle = Integer.parseInt(sc.nextLine());
      if (angle < 0 || angle > 90) {
        System.out.println("Sudut kemiringan harus berada di antara 0 dan 90 derajat. Program dihentikan. ");
        sc.close();
      } else { 
        System.out.print("Masukkan massa (kg): ");
        double m = Double.parseDouble(sc.nextLine());
        if (m < 0) {
          System.out.println("Massa tidak boleh negatif. Program dihentikan. ");
          sc.close();
        } else {
          double T = 2*v*Math.sin(Math.toRadians(angle))/g;

        double R = v*Math.cos(Math.toRadians(angle))*T;
        double H = Math.pow(Math.sin(Math.toRadians(angle))*v, 2)/2/g;
        double V = Math.sqrt(Math.pow(v*Math.cos(Math.toRadians(angle)), 2) + Math.pow(v*Math.sin(Math.toRadians(angle)) - g*T, 2));
        double K = m*v*v/2;

        System.out.printf("Waktu Total Penerbangan: %.4f s %n", T);
        System.out.printf("Jarak Horizontal Maksimum: %.4f m%n", R);
        System.out.printf("Ketinggian Maksimum: %.4f m%n", H);
        System.out.printf("Kecepatan Saat Mencapai Tanah: %.4f m/s%n", V);
        System.out.printf("Energi Kinetik Saat Mencapai Tanah: %.4f Joule%n", K);
        }
      }
    }
  }
}
