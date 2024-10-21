package College.PraktikumAlgo.Modul4;
import java.util.Scanner;
public class EvanAshleyPringadi_Modul4_No3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan batas Fibonacci: ");
    int batas = Integer.parseInt(sc.nextLine());
    int fib1 = 0;
    int fib2 = 1;
    System.out.print(fib1 + " ");
    System.out.print(fib2 + " ");
    while (fib1+fib2 <= batas) {
      int angka = fib1 + fib2;
      fib1= fib2;
      fib2=angka;
      System.out.print(fib2 + " ");
    }
  }
}
