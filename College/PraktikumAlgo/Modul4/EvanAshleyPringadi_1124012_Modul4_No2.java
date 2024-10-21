package College.PraktikumAlgo.Modul4;
import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul4_No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Batas Prima");
    int batas = Integer.parseInt(sc.nextLine());
    int angka = 2;
    while ( angka <= batas) {
      Boolean prime = true;
      int pembagi = angka-1;
      while(pembagi >= 2) {
        if (angka % pembagi == 0) {
          prime = false;
          break;
        }
        pembagi--;
      }

      // for (int pembagi = angka-1; pembagi >= 2; pembagi--) {
      //   if (angka % pembagi == 0) {
      //     prime = false;
      //     break;
      //   }
      // }


      if(prime) {
        System.out.print(angka + " ");
      }
      angka++;
    }
  }
}
