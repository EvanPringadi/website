package College.PraktikumAlgo.Modul7;

class City {
  String Nama, Provinsi, Latitude, Longitude;
}

public class EvanAshleyPringadi_1124012_Modul7_No1 {
  public static void main(String[] args) {
    City Kota1 = new City();
    Kota1.Nama = "Bandung";
    Kota1.Provinsi = "Jawa Barat";
    Kota1.Latitude = "6.9021856 S";
    Kota1.Longitude = "107.6187558 E";

    System.out.println(Kota1.Nama);
    System.out.println(Kota1.Provinsi);
    System.out.println(Kota1.Latitude);
    System.out.println(Kota1.Longitude);
  }
}