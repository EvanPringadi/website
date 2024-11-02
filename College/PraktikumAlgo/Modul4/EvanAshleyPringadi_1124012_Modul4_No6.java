package College.PraktikumAlgo.Modul4;
import java.util.Scanner;
public class EvanAshleyPringadi_1124012_Modul4_No6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bilangan bulat positif: ");
    int angka = Integer.parseInt(sc.nextLine());
    String hasil = "";
    int counter = 0;
    while (angka > 0) {
      int digitTerakhir = angka % 10;
      if (digitTerakhir % 2 == 1) {
        hasil = digitTerakhir + " " + hasil;
        counter++;
      }
      angka /= 10;
    }
    if (counter == 0) {
      hasil = "Tidak ada digit ganjil dalam bilangan.";
    } else{
      hasil = "Digit ganjil dalam bilangan: " + hasil;
    }
    System.out.println(hasil);
    System.out.println("Jumlah digit ganjil dalam bilang adalah "+counter);
  }
}
