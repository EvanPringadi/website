import java.util.Scanner;

public class Test { 
  public static void main(String args[]) 
  { 
      System.out.println("Hello World"); 
      System.out.println("What is your name?");

      String name = "Evan";
      System.out.println(name);

      System.out.println("Silakan isi panjang balok...");
      Scanner scannerPanjang = new Scanner(System.in);
      float panjang = scannerPanjang.nextFloat();

      System.out.println("Silakan isi lebar balok...");
      Scanner scannerLebar = new Scanner(System.in);
      float lebar = scannerLebar.nextFloat();

      System.out.println("Silakan isi tinggi balok...");
      Scanner scannerTinggi = new Scanner(System.in);
      float tinggi = scannerTinggi.nextFloat();

      float volume = panjang * lebar * tinggi; 

      System.out.println("Volume balok tersebut adalah " + volume);

  } 
}
