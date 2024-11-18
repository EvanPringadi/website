import java.util.Scanner;
public class CompoundInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Tabungan: ");
    double tabungan = Double.parseDouble(sc.nextLine());
    System.out.print("Persen: ");
    double Persen = Double.parseDouble(sc.nextLine());
    System.out.print("Harapan: ");
    int harapan = Integer.parseInt(sc.nextLine());
    int counter = 1;
    while(tabungan<harapan) {
      tabungan += tabungan / 100 * Persen;
      System.out.println("Minggu ke-"+counter+": " + tabungan);
      counter++;
    }
  }
}
