package College.Algoritma.ifelse;

import java.util.Scanner;

public class nilaiAlgo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q1;
    int q2;
    int q3;
    int q4;
    int q5;
    int qTerendah;
    int totalq = 0;
    int uts;
    int uas;
    double rataq;
    double na;
    double ina;
    String aa;

    System.out.println("Masukkan nilai quiz 1...");
    q1 = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai quiz 2...");
    q2 = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai quiz 3...");
    q3 = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai quiz 4...");
    q4 = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai quiz 5...");
    q5 = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai uts...");
    uts = Integer.parseInt(sc.nextLine());
    System.out.println("Masukkan nilai uas...");
    uas = Integer.parseInt(sc.nextLine());

    if (q1>q2) {
      qTerendah = q2;
      totalq += q1;
    } else {
      qTerendah = q1;
      totalq += q2;
    }
    if (q3 > qTerendah) {
      totalq += q3;
    } else {
      totalq += qTerendah;
      qTerendah = q3;
    }

    if (q4 > qTerendah) {
      totalq += q4;
    } else {
      totalq += qTerendah;
      qTerendah = q4;
    }

    if (q5 > qTerendah) {
      totalq += q5;
    } else {
      totalq += qTerendah;
      qTerendah = q5;
    }

    rataq = totalq/4;
    na = rataq*0.2 + uts*0.35 + uas*0.45;

    if(na >= 80) {
      aa = "A";
      ina = 4;
    } else if (na >= 70) {
      aa = "B";
      ina = 3;
    } else if (na>=60) {
      aa = "C";
      ina = 2;
    } else if (na>= 50) {
      aa = "D";
      ina = 1;
    } else {
      aa = "E";
      ina = 0;
    }

    System.out.println("NA = " + na);
    System.out.println("AA = " + aa);
    System.out.println("INA = " + ina);
  }
}
