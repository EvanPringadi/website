package College.PraktikumAlgo.Modul3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EvanAshleyPringadi_1124012_Modul3_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan jumlah peserta");
    int sum = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= sum; i++) {
      System.out.println("Silakan Juri Pertama Untuk Mengisi Nilai Peserta " + i + "...");
      System.out.println("Masukkan Nilai Intonasi Peserta "  + i + "...");
      double nilaiIntonasi = sc.nextDouble();
      System.out.println("Masukkan Nilai Kualitas Vokal Peserta "  + i + "...");
      double nilaiKualitasVokal = sc.nextDouble();
      System.out.println("Masukkan Nilai Kesesuaian dengan Partitur Peserta " + i + "...");
      double nilaiKesesuaianDenganPartitur = sc.nextDouble();
      System.out.println("Masukkan Nilai Penampilan Artistik Peserta " + i + "...");
      double nilaiPenampilanArtistik = sc.nextDouble();

      double nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
      double nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
      double nilaiTotalJuriSatu = (nilaiTeknikal + nilaiArtistik)/2;

      System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
      System.out.println("Dengan demikian, Nilai Akumulasi Peserta"+i+" adalah " + nilaiTotalJuriSatu);
      System.out.println("Terima Kasih atas Penilaian Anda!");



      System.out.println("Silakan Juri Kedua Untuk Mengisi Nilai Peserta " + i + "...");
      System.out.println("Masukkan Nilai Intonasi Peserta " + i + "...");
      nilaiIntonasi = sc.nextDouble();
      System.out.println("Masukkan Nilai Kualitas Vokal Peserta " + i + "...");
      nilaiKualitasVokal = sc.nextDouble();
      System.out.println("Masukkan Nilai Kesesuaian dengan Partitur Peserta " + i + "...");
      nilaiKesesuaianDenganPartitur = sc.nextDouble();
      System.out.println("Masukkan Nilai Penampilan Artistik Peserta " + i + "...");
      nilaiPenampilanArtistik = sc.nextDouble();

      nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
      nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
      double nilaiTotalJuriDua = (nilaiTeknikal + nilaiArtistik)/2;

      System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
      System.out.println("Dengan demikian, Nilai Akumulasi Peserta "+i+" adalah " + nilaiTotalJuriDua);
      System.out.println("Terima Kasih atas Penilaian Anda!");



      System.out.println("Silakan Juri Ketiga Untuk Mengisi Nilai Peserta " + i + "...");
      System.out.println("Masukkan Nilai Intonasi Peserta " + i + "...");
      nilaiIntonasi = sc.nextDouble();
      System.out.println("Masukkan Nilai Kualitas Vokal Peserta " + i + "...");
      nilaiKualitasVokal = sc.nextDouble();
      System.out.println("Masukkan Nilai Kesesuaian dengan Partitur Peserta " + i + "...");
      nilaiKesesuaianDenganPartitur = sc.nextDouble();
      System.out.println("Masukkan Nilai Penampilan Artistik Peserta " + i + "...");
      nilaiPenampilanArtistik = sc.nextDouble();

      nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
      nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
      double nilaiTotalJuriTiga = (nilaiTeknikal + nilaiArtistik)/2;

      System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
      System.out.println("Dengan demikian, Nilai Akumulasi Peserta "+i+" adalah " + nilaiTotalJuriTiga);
      System.out.println("Terima Kasih atas Penilaian Anda!");

      double nilaiAkhir = Math.round((nilaiTotalJuriSatu + nilaiTotalJuriDua + nilaiTotalJuriTiga)/3);
      System.out.println("Dengan demikian, Nilai Semua Juri telah Ditentukan, yaitu adalah " + nilaiAkhir);
      JOptionPane.showMessageDialog(null, "Nilai Akhir Peserta "+i+" adalah " + nilaiAkhir, "Nilai Akhir Peserta "+ i, JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
