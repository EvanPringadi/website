package College.PraktikumAlgo.Modul6;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No9 {
  public static void main(String[] args) {
    int[] num1 = {1, 2};
    int[] num2 = {2, 3};
    int[] num3;
    int[] num4;
    if(num1.length >= num2.length) {
      num3 = num1;
      num4 = num2;
    } else {
      num3 = num2;
      num4 = num1;
    }
    for (int i = 0; i < num3.length; i++) {
      int num = num3[i];
      num3[i] = 0;
      for (int j = 0; j < num4.length; j++) {
        num3[i] += num * num4[j];
      }
    }

    System.out.print(num3[0]);
    for (int i = 1; i < num3.length; i++) {
      System.out.print(", " + num3[i]);
    }
  }
}
