package College.PraktikumAlgo.Modul5;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul5_No8 {
  static String currentCountry = "start";
  static int currentCoordsX = 0;
  static int currentCoordsY = 0;
  static int nextCoordsX = 0;
  static int nextCoordsY = 0;
  static double jarakTotal = 0;

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    inputNegara();
    while (!currentCountry.equals("")) {
      inputRute();
    }
    double cost = hitungCost();
    System.out.printf("Jarak Rute adalah %.2f km, dengan cost Rp %.2f", jarakTotal, cost);
  }
  public static void inputNegara() {
    System.out.print("Masukkan Negara: ");
    currentCountry = sc.nextLine().toLowerCase();
    switch (currentCountry) {
      case "indonesia":
        currentCoordsX = 100;
        currentCoordsY = 23;
        break;
      case "jerman":
        currentCoordsX = 15;
        currentCoordsY = 1243;
        break;
      case "russia":
        currentCoordsX = 129;
        currentCoordsY = 3948;
        break;
      case "china":
        currentCoordsX = 283;
        currentCoordsY = 382;
        break;
      case "burkina faso":
        currentCoordsX = 374;
        currentCoordsY = 10;
        break;
      case "ukraina":
        currentCoordsX = 203;
        currentCoordsY = 989;
        break;
      case "afghanistan":
        currentCoordsX = 2390;
        currentCoordsY = 1;
        break;
      case "inggris":
        currentCoordsX = 394;
        currentCoordsY = 38;
        break;
      case "prancis":
        currentCoordsX = 232;
        currentCoordsY = 90;
        break;
    
      default:
        break;
    }
  }
  public static void inputRute() {
    System.out.print("Masukkan Rute: ");
    currentCountry = sc.nextLine().toLowerCase();
    switch (currentCountry) {
      case "indonesia":
        nextCoordsX = 100;
        nextCoordsY = 23;
        break;
      case "jerman":
        nextCoordsX = 15;
        nextCoordsY = 1243;
        break;
      case "russia":
        nextCoordsX = 129;
        nextCoordsY = 3948;
        break;
      case "china":
        nextCoordsX = 283;
        nextCoordsY = 382;
        break;
      case "burkina faso":
        nextCoordsX = 374;
        nextCoordsY = 10;
        break;
      case "ukraina":
        nextCoordsX = 203;
        nextCoordsY = 989;
        break;
      case "afghanistan":
        nextCoordsX = 2390;
        nextCoordsY = 1;
        break;
      case "inggris":
        nextCoordsX = 394;
        nextCoordsY = 38;
        break;
      case "prancis":
        nextCoordsX = 232;
        nextCoordsY = 90;
        break;
    
      default:
        break;
    }
    jarakTotal += cariJarak(currentCoordsX, currentCoordsY, nextCoordsX, nextCoordsY);
    currentCoordsX = nextCoordsX;
    currentCoordsY = nextCoordsY;
  }
  public static double cariJarak(int x1, int y1, int x2, int y2) {
    double jarak = Math.sqrt(
    Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)
    );
    return jarak;
  }
  public static double hitungCost() {
    System.out.print("Masukkan nama pesawat: ");
    String pesawat = sc.nextLine().toLowerCase();
    double cost1KM = 0;
    switch (pesawat) {
      case "boeing 737":
        cost1KM = 1500;
        break;
      case "airbus a320":
        cost1KM = 1800;
        break;
      case "boeing 787 dreamliner":
        cost1KM = 2900;
        break;
      case "sukhoi su-27":
        cost1KM = 900;
        break;
      case "boeing 747":
        cost1KM = 1200;
        break;
      case "sikorsky uh-60 black hawk":
        cost1KM = 3700;
        break;
      case "gulfstream g650":
        cost1KM = 600;
        break;
      case "cessna citation x":
        cost1KM = 350;
        break;
    
      default:
      System.out.println("input tidak valid");
        break;
    }
    return jarakTotal * cost1KM / 3;
  }
}
