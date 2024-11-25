package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi 1: ");
    int s1 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan panjang sisi 2: ");
    int s2 = Integer.parseInt(sc.nextLine());
    System.out.print("Masukkan panjang sisi 3: ");
    int s3 = Integer.parseInt(sc.nextLine());

    System.out.println(cekPhytagoras(s1, s2, s3));
    sc.close();
  }
  public static String cekPhytagoras(int _s1, int _s2, int _s3) {
    int temp;
    if (_s1 > _s2) {
      temp = _s2;
      _s2 = _s1;
      _s1 = temp;
    }
    if (_s2 > _s3) {
      temp = _s3;
      _s3 = _s2;
      _s2 = temp;
    }
    if ((_s1*_s1)+(_s2*_s2) == (_s3*_s3)) {
      return "Triplet Phytagoras";
    } else {
      return "Bukan Triplet Phytagoras";
    }
  }
}
