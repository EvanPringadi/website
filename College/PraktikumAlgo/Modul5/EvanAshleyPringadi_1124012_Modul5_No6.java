package College.PraktikumAlgo.Modul5;

import java.util.Scanner;
import java.lang.Math;

public class EvanAshleyPringadi_1124012_Modul5_No6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Silahkan Masukkan Koordinat Pertama");
    System.out.print("Masukkan X: ");
    int _x1 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan Y: ");
    int _y1 = Integer.parseInt(sc.nextLine());
    System.out.println("Silahkan Masukkan Koordinat Kedua");
    System.out.print("Masukkan X: ");
    int _x2 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan Y: ");
    int _y2 = Integer.parseInt(sc.nextLine());

    double jarak = cariJarak(_x1, _y1, _x2, _y2);
    System.out.println("Jarak: " + jarak);
  }
  public static double cariJarak(int x1, int y1, int x2, int y2) {
    double jarak = Math.sqrt(
    Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)
    );
    return jarak;
  }
}
