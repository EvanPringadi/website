package College.PraktikumAlgo.UTS;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class UTS_Soal3_1124012 {
  public static void main(String[] args) {
    double gaji = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("masukkan gaji per bulan"));
    int lamaKerja = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("masukkan lama kerja dalam tahun"));
    double persenKenaikanGaji = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("masukkan kenaikan gaji setiap tahun (dalam desimal)"));

    for (int i = 0; i < lamaKerja; i++) {
      double perhitungan = gaji * 12;
      if (perhitungan > 54000000) {
        perhitungan -= 54000000;
      } else {
        perhitungan = 0;
      }
      double pajak = 0;
      if (perhitungan < 50000000) {
        pajak += perhitungan * 5/100;
        perhitungan = 0;
      } else {
        pajak += 2500000;
        perhitungan -= 50000000;
      }
      if (perhitungan < 250000000) {
        pajak += perhitungan * 15/100;
        perhitungan = 0;
      } else {
        pajak += 250000000 * 15/100;
        perhitungan -= 250000000;
      }
      if (perhitungan < 500000000) {
        pajak += perhitungan * 25/100;
        perhitungan = 0;
      } else {
        pajak += 500000000 * 25/100;
        perhitungan -= 500000000;
      }
      if (perhitungan > 0) {
        pajak += perhitungan * 35/100;
        perhitungan = 0;
      }
      System.out.println("Pajak yang harus dibayar untuk tahun ke-"+i+" adalah Rp"+pajak);
      gaji *= 1 + persenKenaikanGaji;
    }
  }
}
