package College.PraktikumAlgo.Modul6;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul6_No1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num[] = new int[10];

    for (int i = 0; i < num.length; i++) {
      System.out.print("Masukkan angka: ");
      num[i] = Integer.parseInt(sc.nextLine());
    }

    double sum = 0;

    //cari min max
    int min = num[0];
    int max = num[0];
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
      if (num[i] < min) {
        min = num[i];
      }
      if (num[i] > max) {
        max = num[i];
      }
    }

    //cari average
    double avr = sum / num.length;

    //cari modus
    String modus = "";
    int modusFrekuensi = 1;
    for (int i = 0; i < num.length; i++) {
      int currentModusFrekuensi = 1;
      int currentModus = num[i];
      for (int j = i+1; j < num.length; j++) {
        if(num[i] == num[j]) {
          currentModusFrekuensi++;
        }
      }
      if (currentModusFrekuensi > modusFrekuensi) {
        modus = Integer.toString(currentModus);
        modusFrekuensi = currentModusFrekuensi;
      } else if (currentModusFrekuensi == modusFrekuensi) {
        modus += ", " + Integer.toString(currentModus);
      }
    }
    //sort
    for (int i = 0; i < num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        if (num[i]< num[j]) {
          int temp = num[i];
          num[i] = num[j];
          num[j] = temp;
        }
      }
    }

    //cari median
    double median;
    if(num.length % 2 == 0) {
      median = (num[num.length/2] + num[(num.length/2)-1])/2.0;
    } else{
      median = num[num.length/2];
    } 
    System.out.println("Rata-rata: " + avr);
    System.out.println("Median: " + median);
    System.out.println("Nilai Terbesar: " + max);
    System.out.println("Nilai Terkecil: " + min);
    System.out.println("Modus: " + modus);
  }
}
