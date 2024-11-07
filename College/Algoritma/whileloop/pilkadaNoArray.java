package College.Algoritma.whileloop;
import java.util.Scanner;
public class pilkadaNoArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int paslon1 = 0;
    int paslon2 = 0;
    int paslon3 = 0;
    int input = 1;
    while(input != 0) {
      System.out.print("Vote: ");
      input = Integer.parseInt(sc.nextLine());
      switch(input) {
        case 1: paslon1++; break;
        case 2: paslon2++; break;
        case 3: paslon3++; break;
      }
    }
    System.out.println("Vote untuk paslon1: "+paslon1);
    System.out.println("Vote untuk paslon2: "+paslon2);
    System.out.println("Vote untuk paslon3: "+paslon3);
    System.out.println("Terima kasih!");
  }
}
