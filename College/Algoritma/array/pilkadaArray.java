package College.Algoritma.array;
import java.util.Scanner;
public class pilkadaArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int paslon[] = new int[3];
    int input = 1;
    while(input != 0) {
      System.out.print("Vote: ");
      input = Integer.parseInt(sc.nextLine());
      switch(input) {
        case 1: paslon[0]++; break;
        case 2: paslon[1]++; break;
        case 3: paslon[2]++; break;
      }
    }
    for (int i = 0; i < paslon.length; i++) {
      System.out.println("Vote untuk paslon"+(i+1)+": "+paslon[0]);
    }
    System.out.println("Terima kasih!");
  }
}
