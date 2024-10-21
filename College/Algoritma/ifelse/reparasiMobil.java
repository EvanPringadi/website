package College.Algoritma.ifelse;
import java.util.Scanner;

public class reparasiMobil {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan merek mobil...");
    String merek = sc.nextLine();
    System.out.println("Apakah Anda butuh Perbaikan Bagian Bumper?(True/False)");
    Boolean bumper = Boolean.parseBoolean(sc.nextLine());
    System.out.println("Apakah Anda butuh Perbaikan Bagian Spion?(True/False)");
    Boolean spion = Boolean.parseBoolean(sc.nextLine());
    System.out.println("Apakah Anda butuh Perbaikan Bagian Body?(True/False)");
    Boolean body = Boolean.parseBoolean(sc.nextLine());
    System.out.println("Apakah Anda butuh Perbaikan Bagian Mesin?(True/False)");
    Boolean mesin = Boolean.parseBoolean(sc.nextLine());

    int total = 0;

    if ( merek.equalsIgnoreCase("lamborghini")) {
      if (bumper) {
        total += 100000;
      }
      if(spion) {
        total += 30000;
      }
      if(body) {
        total+= 200000;
      }
      if(mesin) {
        total += 300000;
      }
    } else if (merek.equalsIgnoreCase("toyota")) {
      if (bumper) {
        total += 10000;
      }
      if(spion) {
        total += 5000;
      }
      if(body) {
        total+= 50000;
      }
      if(mesin) {
        total += 30000;
      }
    } else if (merek.equalsIgnoreCase("aston martin")) {
      if (bumper) {
        total += 20000;
      }
      if(spion) {
        total += 40000;
      }
      if(body) {
        total+= 100000;
      }
      if(mesin) {
        total += 200000;
      }
    } else if (merek.equalsIgnoreCase("hummer")) {
      if (bumper) {
        total += 30000;
      }
      if(spion) {
        total += 3000;
      }
      if(body) {
        total+= 90000;
      }
      if(mesin) {
        total += 150000;
      }
    } else {
      if (bumper) {
        total += 40000;
      }
      if(spion) {
        total += 1000;
      }
      if(body) {
        total+= 40000;
      }
      if(mesin) {
        total += 10000;
      }
    }
    System.out.println(total);
  }
}
