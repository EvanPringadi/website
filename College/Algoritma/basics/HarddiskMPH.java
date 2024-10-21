package College.Algoritma.basics;

public class HarddiskMPH {
  public static void main(String[] args) {
    int rpm = 3600;
    int diameterInch = 14;
    int kelilingLingkaran = diameterInch *22/7;
    double mph = kelilingLingkaran * 3600 * 60 / 63360; 
    System.out.println(mph);
  }
}
