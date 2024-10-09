package College.Algoritma;
import java.util.*;

public class klasifikasiUmur {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan usia...");
    int umur = sc.nextInt();
    String kategori = "";
/*
    if(umur <= 5) {
      kategori = "Balita";
    } else if (umur <= 12) {
      kategori = "Anak";
    } else if (umur <= 18) {
      kategori = "Remaja"; 
    } else if (umur <= 25) {
      kategori = "Pemuda";
    } else if (umur <= 55) {
      kategori = "Dewasa";
    } else {
      kategori = "Tua";
    }

    System.out.println(kategori);
*/
 
/*
    if (umur <= 5) {
      kategori = "Balita";
    }
    if (umur > 5 && umur < 13) {
      kategori = "Anak";
    }
    if (umur > 12 && umur < 19) {
      kategori = "Remaja";
    }
    if ( umur > 18 && umur < 26) {
      kategori = "Pemuda";
    }
    if (umur > 25 && umur < 56) {
      kategori = "Dewasa";
    }
    if (umur > 55) {
      kategori = "Tua";
    }

    System.out.println(kategori);
*/

/*
    switch (umur) {
      case 0: kategori = "Balita"; break;
      case 1: kategori = "Balita"; break;
      case 2: kategori = "Balita"; break;
      case 3: kategori = "Balita"; break;
      case 4: kategori = "Balita"; break;
      case 5: kategori = "Balita"; break;

      case 6: case 7: case 8: case 9: case 10: case 11: case 12: kategori = "Anak"; break;

      case 13: case 14: case 15: case 16: case 17: case 18: kategori = "Remaja"; break;

      case 19: case 20: case 21: case 22: case 23: case 24: case 25: kategori = "Pemuda"; break;

      case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: kategori = "Dewasa"; break;
      
      default: kategori = "Tua"; break;

    }

    System.out.println(kategori);
*/

  }
}
