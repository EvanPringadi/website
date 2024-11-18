  package College.Algoritma.uts;

  import java.util.Scanner;

  public class no1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean diterima = true;

      System.out.print("ipk: ");
      float ipk = Float.parseFloat(sc.nextLine());
      System.out.print("usia: ");
      int usia = Integer.parseInt(sc.nextLine());
      System.out.print("gelar sarjana: ");
      int gelarSarjana = Integer.parseInt(sc.nextLine());
      System.out.print("usia ijazah: ");
      int usiaIjazah = Integer.parseInt(sc.nextLine());

      if(usia < 18) {
        diterima = false;
      }
      if(gelarSarjana == 1 && usia>30) {
        diterima = false;
      }
      if(gelarSarjana == 2 && usia>35) {
        diterima = false;
      }
      if(gelarSarjana == 3 && usia>40) {
        diterima = false;
      }
      if(ipk < 2.75) {
        diterima = false;
      }
      if(usiaIjazah>6){
        diterima = false;
      }
      System.out.println(diterima);
    }
  }