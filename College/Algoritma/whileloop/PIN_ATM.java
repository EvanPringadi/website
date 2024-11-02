package College.Algoritma.whileloop;
import java.util.Scanner;
public class PIN_ATM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pin = "123456";
    int count = 1;
    while(count <= 3) {
      System.out.print("Masukkan pin ATM Anda: ");
      String input = sc.nextLine();
      if (input.equalsIgnoreCase(pin)) {
        System.out.println("Anda mengingat pin Anda!");
        count += 3;
      } else {
        if (count == 3) {
          System.out.println("Coba lagi dalam 5 menit...");
          count++;
        } else {
          System.out.println("pin salah");
          count++;
        }
      }
    }
  }
}
