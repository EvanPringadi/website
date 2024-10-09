package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan angka pertama...");
    double angka1 = Double.parseDouble(sc.nextLine());

    System.out.println("Masukkan simbol operasi... ( + - * / )");
    String operasi = sc.nextLine().trim();

    System.out.println("Masukkan angka pertama...");
    double angka2 = Double.parseDouble(sc.nextLine());
    
    double hasil = 0;
    
    switch (operasi) {
      case "+":
          hasil = angka1 + angka2;
          System.out.println(hasil);

          break;
          
      case "-":
          hasil = angka1 - angka2;
          System.out.println(hasil);

          break;

      case "*":
          hasil = angka1 * angka2;
          System.out.println(hasil);

          break;

      case "/":
          if (angka2 == 0) {
              System.out.println("Cannot divide by zero");
          } else {
              hasil = angka1 / angka2;
              System.out.println(hasil);
          }
          break;

      default:
          System.out.println("Operasi tidak valid. Silakan masukkan +, -, *, atau /");
    }
  }
}
