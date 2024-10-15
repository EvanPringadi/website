package College.PraktikumAlgo.Modul3;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul3_No3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //segitiga 1
    System.out.print(" Masukkan jumlah baris untuk segitiga 1:");
    int baris1 = Integer.parseInt(sc.nextLine());
    String angka = "";
    for(int i = 1; i <=baris1; i++) {
      angka += i;
      angka += " ";
      System.out.println(angka);
    }

    angka = "";
    System.out.println("");

    //segitiga 2
    System.out.print("Masukkan jumlah baris untuk segitiga 2:");
    int baris2 = Integer.parseInt(sc.nextLine());
    for(int i = baris2; i >=1; i--) {
      for(int j = 1; j <= i; j++) {
        angka += j;
        angka += " ";
      }
      System.out.println(angka);
      angka = "";
    }

    angka = "";
    System.out.println("");

    //segitiga 3
    System.out.print("Masukkan jumlah baris untuk segitiga 3:");
    int baris3 = Integer.parseInt(sc.nextLine());
    for(int i = 1; i <= baris3; i++) {
      if ( i < baris3) {
        for ( int j = 1; j <= i; j++) {
          if( j == 1 || j == i) {
            System.out.print(j + " ");
          } else {
            System.out.print("  ");
          }
        }
      } else {
        for ( int j = 1; j <= baris3; j++) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }

    angka = "";
    System.out.println("");

    // segitiga 4
    System.out.print("Masukkan jumlah baris untuk segitiga 4:");
    int baris4 = Integer.parseInt(sc.nextLine());
    for(int i = 1; i <=baris4; i++) {
      for (int j = baris4-i; j > 0; j--) {
        System.out.print("  ");
      } 
      
      for (int k = i; k <= 2*i-1; k++) {
        System.out.print(k + " ");
      }
      for (int l = 2*i-2; l >=i; l--) {
        System.out.print(l + " ");
      }
      System.out.println();
    }

    

    System.out.println();
    System.out.println();

    //segitiga 5
    System.out.print("Masukkan jumlah baris untuk segitiga 5:");
    int baris5 = Integer.parseInt(sc.nextLine());
    for(int i = 1; i <=baris5; i++) {
      for (int j = baris5-i; j > 0; j--) {
        System.out.print(" ");
      }

      if ( i < baris5) {
        for ( int j = 1; j <= i; j++) {
          if( j == 1 || j == i) {
            System.out.print(j + " ");
          } else {
            System.out.print("  ");
          }
        }
      } else {
        for ( int j = 1; j <= baris5; j++) {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();


    //segitiga 6
    System.out.print("Masukkan jumlah baris untuk segitiga 4:");
    int baris6 = Integer.parseInt(sc.nextLine());
    for(int i = 1; i <= baris6; i++) {
      if ( i == 1) {
        for ( int j = 1; j <= baris6; j++) {
          System.out.print(j + " ");
        }
        System.out.println();
      } else {
        for (int k = i; k <=baris6; k++) {
          if (k==i) {
            System.out.print(k + " ");
          } else if (k == baris6) {
            System.out.println(k + "  ");
          } else {
            System.out.print("  ");
          }
        }
      }
    }
  }
}
