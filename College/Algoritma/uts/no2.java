package College.Algoritma.uts;
import java.util.Scanner;
public class no2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double pph = 0;
    System.out.print("penghasilan: ");
    long penghasilan = Long.parseLong(sc.nextLine());
    System.out.print("npwp: ");
    boolean npwp = Boolean.parseBoolean(sc.nextLine());

    if(penghasilan < 60000000) {
      pph += penghasilan *5/100;
      penghasilan = 0;
    } else {
      pph += 60000000 * 5/100;
      penghasilan -= 60000000;
    }

    if(penghasilan < 190000000) {
      pph += penghasilan *15/100;
      penghasilan = 0;
    } else {
      pph += 190000000L * 15/100;
      penghasilan -= 190000000;
    }
    
    if(penghasilan < 250000000) {
      pph += penghasilan *25/100;
      penghasilan = 0;
    } else {
      pph += 250000000L * 25/100;
      penghasilan -= 250000000;
    }
    
    if(penghasilan < 4500000000L ) {
      pph += penghasilan *30/100;
      penghasilan = 0;
    } else {
      pph += 4500000000L * 30/100;
      penghasilan -= 4500000000L;
    }

    pph+=penghasilan*35/100;
    if(!npwp) {
      pph += pph *2/10;
    }
    System.out.println(pph);
  }
}
