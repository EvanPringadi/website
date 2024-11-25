package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No7 {
  static Scanner sc = new Scanner(System.in);
  static int total = 0;
  static int counter = 0;
  static int currentNum = 0;
  public static void main(String[] args) {
    while(currentNum != 9999) {
      hitungAverage();
    }
    double average = (double)total / (double)counter;
    System.out.println("Average: " + average);
  }
  public static void hitungAverage() {
    System.out.print("Masukkan angka: ");
    currentNum =  Integer.parseInt(sc.nextLine());
    if (currentNum != 9999) {
      total += currentNum; 
      counter++;
    }
  }
}
