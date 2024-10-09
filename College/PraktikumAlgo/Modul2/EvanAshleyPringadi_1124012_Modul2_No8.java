package College.PraktikumAlgo.Modul2;
import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul2_No8 {
  public static void main(String[] args) {
    String posisiMercury = "0";
    String posisiVenus = "108";
    String posisiEarth = "270";
    String posisiMars = "495";

    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan Input 1... (Mercury/Venus/Earth/Mars)");
    String input1 = sc.nextLine().toLowerCase();
    System.out.println("Masukkan Input 2... (Mercury/Venus/Earth/Mars)");
    String input2 = sc.nextLine().toLowerCase();

    switch (input1) {
      case "mercury":
        input1 = posisiMercury;
        break;
      
      case "venus":
        input1 = posisiVenus;
        break;

      case "earth":
        input1 = posisiEarth;
        break;
      
      case "mars":
        input1 = posisiMars;
        break;
    
      default:
        System.out.println("Input 1 tidak valid");
        break;
    }

    switch (input2) {
      case "mercury":
        input2 = posisiMercury;
        break;
      
      case "venus":
        input2 = posisiVenus;
        break;

      case "earth":
        input2 = posisiEarth;
        break;
      
      case "mars":
        input2 = posisiMars;
        break;
    
      default:
        System.out.println("Input 2 tidak valid");
        break;
    }

    int output = Integer.parseInt(input1) - Integer.parseInt(input2);
    if (output < 0) {
      output *= -1;
    }
    System.out.println("Jarak = " + output + "jt km");
  }
}
