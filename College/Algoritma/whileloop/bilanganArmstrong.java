package College.Algoritma.whileloop;
import java.util.Scanner;
public class bilanganArmstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bilangan: ");
    int bilangan = Integer.parseInt(sc.nextLine());
    int total = 0;
    int digit = 0;
    int temp = bilangan;
    while (bilangan > 0) {
      bilangan /= 10;
      digit++;
    }
    bilangan = temp;
    while (bilangan > 0) {
      int a = bilangan % 10;
      int b = a;
      for (int i = 1; i < digit; i++) {
        a = a*b;
      }
      total+= a;
      bilangan /= 10;
    }
    System.out.println(total);
    if(total == temp) {
      System.out.println("Bilangan Armstrong");
    } else {
      System.out.println("Bukan bilangan Armstrong");
    }
  }
}
