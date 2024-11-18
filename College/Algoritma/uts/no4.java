package College.Algoritma.uts;

import java.util.Scanner;

public class no4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("tabungan: ");
    double tabungan = Double.parseDouble(sc.nextLine());
    System.out.print("harapan: ");
    int harapan = Integer.parseInt(sc.nextLine());
    int counter = 1;
    while(tabungan<harapan) {
      tabungan += tabungan * 0.004;
      System.out.println("Bulan ke-"+counter+": " + tabungan);
      counter++;
    }
  }
}
