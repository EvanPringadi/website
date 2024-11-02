package College.PraktikumAlgo.Quiz1;

import java.util.Scanner;

public class Quiz1_Nomor2B_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int n = Integer.parseInt(sc.nextLine());
    int count = 1;
    int ascending = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(count + " ");
        if (ascending == 1) {
          count++;
          count%=10;
        } else {
          if (count == 0) {
            count = 9;
          } else{
            count--;
          }
        }
      }
      if(ascending == 1) {
        count += n-1;
      } else{
        count += n+1;
      }
      count %= 10;
      ascending = ascending*-1;
      System.out.println();
    }
    
  }
}