package College.PraktikumAlgo.Modul4;
import java.util.*;
public class EvanAshleyPringadi_1124012_Modul4_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Tebak angka antara 1 hingga 50. Anda memiliki 10 kesempatan.");
    int kesempatan = 10;
    int angkaAcak = random.nextInt(49)+1;
    while(kesempatan>0) {

      System.out.print("Kesempatan ke-" + (11-kesempatan) + ": ");
      int input = Integer.parseInt(sc.nextLine());
      if(input == angkaAcak) {
        System.out.println("Selamat Anda berhasil menebak angka "+ input);
        break;
      } 
      kesempatan -- ;
      String hint;
      if (input > angkaAcak) {
        hint = "Terlalu besar. ";
      } else {
        hint = "Terlalu kecil. ";
      }
      System.out.println(hint+ "Kesempatan tersisa: " + kesempatan);
      if (kesempatan == 0) {
        System.out.println("Maaf, Anda kehabisan kesempatan. Angka yang dicari adalah " + angkaAcak);
      } 
    }
  }
}
