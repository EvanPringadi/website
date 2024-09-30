package College.PraktikumAlgo;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class EvanAshleyPringadi_1124012_Modul1_No3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Silakan Isi Presentase Pajak Anda...");
    double presentasePajak = sc.nextDouble()/100;

    System.out.println("Silakan Isi Gaji Anda...");
    int gaji = sc.nextInt();

    System.out.println("Silakan Isi Bonus Anda...");
    int bonus = sc.nextInt();

    System.out.println("Silakan Isi Denda Anda...");
    int denda = sc.nextInt();

    double penghasilan = gaji + bonus - denda;
    double total = penghasilan - (penghasilan * presentasePajak);

    System.out.println("Penghasilan Kotor Anda adalah "+penghasilan);
    JOptionPane.showMessageDialog(null, "Penghasilan Anda adalah: Rp " + penghasilan, "Informasi Penghasilan", JOptionPane.INFORMATION_MESSAGE);

    System.out.println("Penghasilan Bersih Anda adalah"+total);
    JOptionPane.showMessageDialog(null, "Penghasilan Bersih Anda adalah: Rp " + total, "Informasi Penghasilan", JOptionPane.INFORMATION_MESSAGE);
  }
}
