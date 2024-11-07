package College.PraktikumAlgo.UTS;
import java.util.Scanner;
public class UTS_Soal1_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Apakah barang berat? (True/False): ");
    Boolean berat = Boolean.parseBoolean(sc.nextLine());
    System.out.print("Apakah Cuaca Hujan? (True/False): ");
    Boolean hujan = Boolean.parseBoolean(sc.nextLine());
    System.out.print("Apakah Lalu Lintas Macet? (True/False): ");
    Boolean macet = Boolean.parseBoolean(sc.nextLine());
    System.out.print("Apakah Kendaraan Anda? (True/False): ");
    String kendaraan = sc.nextLine();

    String rute = "Rute enampuluhenam";
    if(!berat && !hujan && !macet ) {
      rute = "Jalan Raya";
    } else if (berat && !hujan && macet && kendaraan.equalsIgnoreCase("mobil")) {
      rute = "Jalan Tol";
    } else if (!berat && hujan && !macet ) {
      rute = "Jalan Pedesaan";
    } else if (berat && hujan && macet && kendaraan.equalsIgnoreCase("mobil")){
      rute = "Jalan Lingkar";
    } else if (!berat && !hujan && macet) {
      rute = "Jalan Ring Road";
    } else if (berat && !hujan && !macet && kendaraan.equalsIgnoreCase("mobil")) {
      rute = "Jalan Alternatif";
    }

    System.out.println(rute);
  }
}