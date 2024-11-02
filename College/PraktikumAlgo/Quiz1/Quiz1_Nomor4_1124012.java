package College.PraktikumAlgo.Quiz1;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Quiz1_Nomor4_1124012 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nama pemain 1: ");
    String nama1 = sc.nextLine();
    System.out.print("Masukkan nama pemain 2: ");
    String nama2 = sc.nextLine();

    int step1 = 0;
    int step2 = 0;
    double gaji1 = 0;
    double gaji2 = 0;
    double balance1 = 0;
    double balance2 = 0;
    double tax1 = 0;
    double tax2 = 0;
    String pekerjaan1= "";
    String pekerjaan2 = "";
    int knowledge1 = 0;
    int knowledge2=0;
    int kredit1 = 0;
    int kredit2 = 0;

    while (step1<11 || step2<11) {
      if(step1 < 11) {
        int dadu = random.nextInt(4)+ 1;
        System.out.println(nama1+" maju "+ dadu + "step");
        step1 += dadu;
        if (step1%2 == 0) {
          knowledge1++;
          System.out.println("Sekarang "+nama1+" memiliki "+knowledge1+" knowledge");
        }
        System.out.println(nama1+ " sekarang ada di step " + step1);
      }
      if(step2 < 11) {
        int dadu = random.nextInt(4)+ 1;
        System.out.println(nama2 + " maju "+ dadu + "step");
        step2 += dadu;
        if (step2%2 == 0) {
          knowledge2++;
          System.out.println("Sekarang "+nama2+" memiliki "+knowledge2+" knowledge");
        }
        System.out.println(nama2+ " sekarang ada di step " + step2);
      }
    }
    switch (knowledge1) {
      case 1: 
      pekerjaan1 = "Sales";
      gaji1 = 700000;
      tax1 = 90000;
      break;

      case 2: 
      pekerjaan1 = "Guru";
      gaji1 = 1200000;
      tax1 = 300000;
      break;

      case 3: 
      pekerjaan1 = "Dokter";
      gaji1 = 2000000;
      tax1 = 500000;
      break;

      case 4: 
      pekerjaan1 = "Dosen";
      gaji1 = 3000000;
      tax1 = 800000;
      break;

      case 5: 
      pekerjaan1 = "Arsitek";
      gaji1 = 5000000;
      tax1 = 1000000;
      break;
    
      default:
        break;
    }
    System.out.println("Selamat! " + nama1 + " mendapatkan pekerjaan " + pekerjaan1 + ", dengan gaji "+ gaji1 + " dan dengan pajak sebesar "+tax1);

    switch (knowledge2) {
      case 1: 
      pekerjaan2 = "Sales";
      gaji2 = 700000;
      tax2 = 90000;
      break;

      case 2: 
      pekerjaan2 = "Guru";
      gaji2 = 1200000;
      tax2 = 300000;
      break;

      case 3: 
      pekerjaan2 = "Dokter";
      gaji2 = 2000000;
      tax2 = 500000;
      break;

      case 4: 
      pekerjaan2 = "Dosen";
      gaji2 = 3000000;
      tax2 = 800000;
      break;

      case 5: 
      pekerjaan2 = "Arsitek";
      gaji2 = 5000000;
      tax2 = 1000000;
      break;
    
      default:
        break;
    }
    System.out.println("Selamat! " + nama2 + " mendapatkan pekerjaan " + pekerjaan2 + ", dengan gaji "+ gaji2 + " dan dengan pajak sebesar "+tax2);
  }
}
