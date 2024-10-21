package College.PraktikumAlgo.Modul3;

import java.util.*;
import javax.swing.JOptionPane;

public class EvanAshleyPringadi_1124012_Modul3_No4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int angkaAcak = random.nextInt(98)+1;

    for(int i = 1; i <= 5; i++) {

      System.out.println("Tebak Angka 1-99");
      int guess = Integer.parseInt(sc.nextLine());

      if(guess==angkaAcak) {
        System.out.println("congrats");
        JOptionPane.showMessageDialog(null, "Congratss!!!", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
        break;
      } else if (guess >= angkaAcak+80) {
        //vastly less
        JOptionPane.showMessageDialog(null, "Vastly Less", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess >= angkaAcak+40) {
        //far less
        JOptionPane.showMessageDialog(null, "Far Less", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess >= angkaAcak+25) {
        //less
        JOptionPane.showMessageDialog(null, "Less", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess >= angkaAcak) {
        //slightly less
        JOptionPane.showMessageDialog(null, "Slightly Less", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess <= angkaAcak-80) {
        //vastly more
        JOptionPane.showMessageDialog(null, "Vastly More", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess <= angkaAcak-40) {
        //far more
        JOptionPane.showMessageDialog(null, "Far More", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else if (guess <= angkaAcak-25) {
        //more
        JOptionPane.showMessageDialog(null, "More", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      } else {
        //slightly more
        JOptionPane.showMessageDialog(null, "Slightly More", "Game Gabut Tebakan Ben", JOptionPane.INFORMATION_MESSAGE);
      }
      if (i == 5) {
        JOptionPane.showMessageDialog(null, "Game Over", "Game Gabut Tebakan Ben", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}
