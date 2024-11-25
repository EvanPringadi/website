package College.PraktikumAlgo.Modul5;
import java.util.Random;
import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int id = random.nextInt(9000) + 1000;
    System.out.println("TS-" + id);
    String konsumsi = "start";
    int harga = 0;
    while(!konsumsi.equalsIgnoreCase("")) {
      System.out.print("Masukkan konsumsi: ");
      konsumsi = sc.nextLine().toLowerCase();
      switch (konsumsi) {
        case "risoles":
          harga += 4000;
          break;
        case "mie ayam":
          harga += 1500;
          break;
          case "sosis":
          harga += 8000;
          break;
          case "indomie":
          harga += 6000;
          break;
          case "es krim":
            harga += 5000;
            break;
      
        default:
          break;
      }
    }
    System.out.println("Harga: "+harga);
  }
}