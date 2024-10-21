package College.Algoritma.forloop;

public class test {
  public static void main(String[] args) {
      int n = 4;
      
    for(int i = 1; i <=n; i++) {
      System.out.print(i);
      for(int j = 2; j <=i; j++) {
        System.out.print(i+n-j+1);
      }
      System.out.println();
    }

  }
}
