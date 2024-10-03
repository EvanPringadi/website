import java.util.Scanner;

public class Test { 
  public static void main(String args[]) { 
      System.out.println("Hello World"); 
      System.out.println("What is your name?");

      String name = "Evan";
      System.out.println(name);

      System.out.println("Silakan isi panjang balok...");
      Scanner sc = new Scanner(System.in);
      float panjang = sc.nextFloat();

      System.out.println("Silakan isi lebar balok...");
      float lebar = sc.nextFloat();

      System.out.println("Silakan isi tinggi balok...");
      float tinggi = sc.nextFloat();

      float volume = panjang * lebar * tinggi; 

      System.out.println("Volume balok tersebut adalah " + volume);

  } 
}
