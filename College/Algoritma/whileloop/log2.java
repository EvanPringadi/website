package College.Algoritma.whileloop;
import java.util.Scanner;
public class log2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan n: ");
    int n = Integer.parseInt(sc.nextLine());
    int i = 1;
    double total = 0;
    while(i<=n) {
      double penyebut;
      if(i % 2 == 0) {
        penyebut = -1.00 * i;
      } else {
        penyebut = i;
      }
      total += 1 / penyebut;
      i++;
    }
    System.out.println(total);
  }
}
