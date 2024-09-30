package College.PraktikumAlgo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EvanAshleyPringadi_1124012_Modul1_No5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Silakan Juri Pertama Untuk Mengisi Nilai...");
    System.out.println("Masukkan Nilai Intonasi...");
    double nilaiIntonasi = sc.nextDouble();
    System.out.println("Masukkan Nilai Kualitas Vokal...");
    double nilaiKualitasVokal = sc.nextDouble();
    System.out.println("Masukkan Nilai Kesesuaian dengan Partitur...");
    double nilaiKesesuaianDenganPartitur = sc.nextDouble();
    System.out.println("Masukkan Nilai Penampilan Artistik...");
    double nilaiPenampilanArtistik = sc.nextDouble();

    double nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
    double nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
    double nilaiTotalJuriSatu = (nilaiTeknikal + nilaiArtistik)/2;

    System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
    System.out.println("Dengan demikian, Nilai Akumulasinya adalah " + nilaiTotalJuriSatu);
    System.out.println("Terima Kasih atas Penilaian Anda!");



    System.out.println("Silakan Juri Kedua Untuk Mengisi Nilai...");
    System.out.println("Masukkan Nilai Intonasi...");
    nilaiIntonasi = sc.nextDouble();
    System.out.println("Masukkan Nilai Kualitas Vokal...");
    nilaiKualitasVokal = sc.nextDouble();
    System.out.println("Masukkan Nilai Kesesuaian dengan Partitur...");
    nilaiKesesuaianDenganPartitur = sc.nextDouble();
    System.out.println("Masukkan Nilai Penampilan Artistik...");
    nilaiPenampilanArtistik = sc.nextDouble();

    nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
    nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
    double nilaiTotalJuriDua = (nilaiTeknikal + nilaiArtistik)/2;

    System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
    System.out.println("Dengan demikian, Nilai Akumulasinya adalah " + nilaiTotalJuriDua);
    System.out.println("Terima Kasih atas Penilaian Anda!");



    System.out.println("Silakan Juri Ketiga Untuk Mengisi Nilai...");
    System.out.println("Masukkan Nilai Intonasi...");
    nilaiIntonasi = sc.nextDouble();
    System.out.println("Masukkan Nilai Kualitas Vokal...");
    nilaiKualitasVokal = sc.nextDouble();
    System.out.println("Masukkan Nilai Kesesuaian dengan Partitur...");
    nilaiKesesuaianDenganPartitur = sc.nextDouble();
    System.out.println("Masukkan Nilai Penampilan Artistik...");
    nilaiPenampilanArtistik = sc.nextDouble();

    nilaiTeknikal = (nilaiIntonasi + nilaiKualitasVokal)/2;
    nilaiArtistik = (nilaiKesesuaianDenganPartitur + nilaiPenampilanArtistik)/2;
    double nilaiTotalJuriTiga = (nilaiTeknikal + nilaiArtistik)/2;

    System.out.println("Nilai Teknikal dan Nilai Artistik yang Anda Berikan adalah " + nilaiTeknikal + " dan " + nilaiArtistik);
    System.out.println("Dengan demikian, Nilai Akumulasinya adalah " + nilaiTotalJuriTiga);
    System.out.println("Terima Kasih atas Penilaian Anda!");

    double nilaiAkhir = (nilaiTotalJuriSatu + nilaiTotalJuriDua + nilaiTotalJuriTiga)/3;
    System.out.println("Dengan demikian, Nilai Semua Juri telah Ditentukan, yaitu adalah " + nilaiAkhir);
    JOptionPane.showMessageDialog(null, "Nilai Akhir Semua Juri adalah " + nilaiAkhir, "Nilai Akhir", JOptionPane.INFORMATION_MESSAGE);
  }
}