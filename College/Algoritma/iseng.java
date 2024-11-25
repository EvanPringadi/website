package College.Algoritma;
public class iseng {
  static int a = 2;
  static int b = 3;
  static int x;
  public static void cetakLooping() {
    for (x=a; x<=b; x++) {
      System.out.println("proc "+ x + " " + a + " " + b);
    }
  }
  public static void main(String[] args) {
    for(x = 1; x<= 2; x++) {
      int a = 1;
      int b = x+1;
      System.out.println("main: "+ x + " " + a + " " + b);
      cetakLooping();
    }
  }
}
