package College.PraktikumAlgo.Quiz1;
import java.util.Scanner;
public class Quiz1_Nomor1_1124012{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = Integer.parseInt(sc.nextLine());
    int tusukSate = 0;
    while (angka > 0) {
      int digit = angka%10;
      switch(digit) {
        case 0: tusukSate+=6; break;
        case 1: tusukSate+=2; break;
        case 2: tusukSate+=5; break;
        case 3: tusukSate+=5; break;
        case 4: tusukSate+=4; break;
        case 5: tusukSate+=5; break;
        case 6: tusukSate+=6; break;
        case 7: tusukSate+=3; break;
        case 8: tusukSate+=7; break;
        case 9: tusukSate+=6; break;
      }
      angka /= 10;
    }
    System.out.println("Tusuk sate yang dibutuhkan oleh Budi adalah "+ tusukSate);
  }
}