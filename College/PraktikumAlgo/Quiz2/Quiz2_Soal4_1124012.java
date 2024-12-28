package College.PraktikumAlgo.Quiz2;
import java.util.*;

public class Quiz2_Soal4_1124012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    System.out.print("Masukkan panjang array: ");
    int panjang = Integer.parseInt(sc.nextLine());
    int[] array = new int[panjang];

    for (int i = 0; i < panjang; i++) {
      array[i] = random.nextInt(200) + 1;
    }
    System.out.print("Sebelum disort: [");
    for (int i = 0; i < panjang-1; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[panjang-1] + "]");

    String[] string = new String[panjang];
    for (int i = 0; i < string.length; i++) {
      string[i] = "" + array[i];
    }

    for (int i = panjang-1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if(string[j].compareTo(string[j+1]) > 0 ) {
          String swap = string[j];
          string[j] = string[j+1];
          string[j+1] = swap;
        }
      }
    }
    System.out.print("Setelah disort: [");
    for (int i = 0; i < panjang-1; i++) {
      System.out.print(string[i] + ", ");
    }
    System.out.println(string[panjang-1] + "]");
    sc.close();
  }
}
