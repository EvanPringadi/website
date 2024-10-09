package College.PraktikumAlgo.Modul2;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan panjang sisi pertama...");
    int x = sc.nextInt();
    System.out.println("Masukkan panjang sisi kedua...");
    int y = sc.nextInt();
    System.out.println("Masukkan panjang sisi ketiga...");
    int z = sc.nextInt();

    boolean segitiga = false;
    int a = 0;
    int b = 0;
    int c = 0;

    if (x > 0 && y>0 && z>0) {
      if (x>= y && x>= z) {   // x terbesar
        if (x < y+z) {
          segitiga = true;
          c = x;
          b = y;
          a = z;
        } else {
          segitiga = false;
        }
      } else if ( y >= x && y >= z) {   // y terbesar
        if (y < x + z) {
          segitiga = true;
          c = y;
          b = x;
          a = z;
        } else {
          segitiga = false;
        }
      } else {                // z terbesar
        if (z < x +y) {
          segitiga = true;
          c = z;
          b = x;
          a = y;
        } else {
          segitiga = false;
        }
      }
      
      String sudutSegitiga = "";

      if(x == y && y == z) {
        System.out.println("Ketiga sisi tersebut dapat dibuat menjadi segitiga sama sisi");
      } else if(segitiga == true) {
        if( c*c > a*a + b*b) {
          sudutSegitiga = "tumpul";
        } else if (c*c == a*a + b*b) {
          sudutSegitiga = "siku-siku";
        } else {
          sudutSegitiga = "lancip";
        } 
        System.out.println("Ketiga sisi tersebut dapat dibuat menjadi segitiga " + sudutSegitiga);
      } else {
        System.out.println("Ketiga sisi tersebut tidak dapat dibuat menjadi segitiga");
      }
  
    } else {
      System.out.println("Input error");
    }
  }
}
