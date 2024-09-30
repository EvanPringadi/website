package College.PraktikumAlgo;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul1_No2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Silakan Isi Nama Anda...");
    String nama = sc.nextLine();

    System.out.println("Silakan Isi Alamat Anda...");
    String alamat = sc.nextLine();

    System.out.println("Silakan Isi Telepon Anda...");
    String telepon = sc.nextLine();

    System.out.println("Silakan Isi Gender Anda(L/P)...");
    String gender = sc.nextLine();

    System.out.println("Silakan Isi Usia Anda...");
    Integer usia = sc.nextInt();

    sc.nextLine();

    System.out.println("Silakan Isi Status Menikah Anda(true/false)...");
    Boolean statusMenikahBoolean = sc.nextBoolean();
    String statusMenikahString = "";
    if (statusMenikahBoolean == true) {
      statusMenikahString = "sudah menikah";
    } else if (statusMenikahBoolean == false) {
      statusMenikahString = "belum menikah";
    }

    sc.nextLine();

    System.out.println("Silakan Isi Penghasilan Anda...");
    Double penghasilan = sc.nextDouble();

    System.out.println("Nama saya " + nama + ", seorang " + gender + " tinggal di " + alamat + " dan Telepon " + telepon + ". Tahun ini usia saya " + usia + ", " + statusMenikahString + ", dan Penghasilan saya " + penghasilan);
    
  }
}
