package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No2 {
  public static double tambah(double _a, double _b) {
    return _a + _b;
  }
  public static double kurang(double _a, double _b) {
    return _a - _b;
  }
  public static double kali(double _a, double _b) {
    return _a * _b;
  }
  public static double bagi(double _a, double _b) {
    return _a / _b;
  }
  public static double modulus(double _a, double _b) {
    return _a % _b;
  }
  public static double pangkat(double _a, double _b) {
    double hasil = 1;
    for (int i = 0; i < _b; i++) {
      hasil *= _a;
    }
    return hasil;
  }
  public static void main(String[] args) {
    char Operasi = '+';
    Scanner sc = new Scanner(System.in);

    while(Operasi == '+' || Operasi == '-' || Operasi == '*' || Operasi == '/' || Operasi == '^') {
      System.out.println();
      System.out.print("Masukkan angka 1: ");
      double a = Double.parseDouble(sc.nextLine());
      System.out.print("Masukkan angka 2: ");
      double b = Double.parseDouble(sc.nextLine());
      System.out.print("Masukkan Operasi(+, -, *, /, %, ^): ");
      Operasi = sc.next().charAt(0);
      sc.nextLine();
      switch (Operasi) {
        case '+':
          System.out.println("Hasil: " + tambah(a, b));
          break;
          case '-':
          System.out.println("Hasil: " + kurang(a, b));
          
          break;
          case '*':
          System.out.println("Hasil: " + kali(a, b));
          
          break;
          case '/':
          System.out.println("Hasil: " + bagi(a, b));

          break;
          case '%':
          System.out.println("Hasil: " + modulus(a, b));
          
          break;
          case '^':
          System.out.println("Hasil: " + pangkat(a, b));
          
          break;
      }
      sc.close();
    }
  }
}
