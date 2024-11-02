package College.PraktikumAlgo.Quiz1;

public class Quiz1_Nomor2C_1124012 {
  public static void main(String[] args) {
    int n = 4;

    for (int i = 0; i < n*2; i++) {
      System.out.print("* ");
    }
    System.out.println();

    for (int i = 1; i < n; i++) {
      for (int j = n-i; j > 0; j--) {
        System.out.print("* ");
      }
      for (int j = i; j <= i*3-1; j++) {
        System.out.print("  ");
      }
      for (int j = n-i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
