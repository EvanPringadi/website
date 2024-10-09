package College.Algoritma;
import java.util.Scanner;

public class selisihHari {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int selisih = 0;
System.out.println("Masukkan hari pertama dalam angka...  (senin = 1)");
int h1 = Integer.parseInt(sc.nextLine());

System.out.println("Masukkan hari kedua dalam angka...  (senin = 1)");
int h2 = Integer.parseInt(sc.nextLine());

if (h1<h2) {
  selisih = h2-h1;
} else {
  selisih = 7 + h2 - h1;
}

System.out.println("Selisih hari adalah " + selisih );
  }
}
