package College.Algoritma.ifelse;
import java.util.Scanner;

public class coc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Apakah Town Hall masih Berdiri? (True/False)");
    boolean th = Boolean.parseBoolean(sc.nextLine());
    System.out.println("Berapa Persenan Kehancuran?");
    int persen = Integer.parseInt(sc.nextLine());
    System.out.println("Berapa Trophy yang Dipertaruhkan?");
    int trophy = Integer.parseInt(sc.nextLine());

    String status;
    int Bintang = 0;
    String shield = " ";

    if (persen == 100) {
      Bintang = 3;
    } else if (persen >= 50) {
      Bintang += 1;
    }

    if(!th) {
      Bintang += 1;
    }

    String statusTrophy = "+";

    if (Bintang == 0) {
      status = "Victory";
    } else {
      status = "Defeat";
      trophy = trophy * Bintang / 3;
      statusTrophy = "-";
    }

    if(persen >= 40) {
      shield = "Anda mendapatkan shield 2 jam.";
    }

    System.out.println("Trophy yang diperoleh = "+ statusTrophy + trophy + ". Status = " + status + "! Jumlah Bintang = " + Bintang);
    System.out.println(shield);
  }
}
