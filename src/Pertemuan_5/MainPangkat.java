package Pertemuan_5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc14.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc14.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc14.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("1. BRUTE FORCE");
        System.out.println("2. DIVIDE AND CONQUER");
        System.out.print("Pilih Metode :  ");
        int pilihan = sc14.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < png.length; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < png.length; i++) {
                    System.out.println(
                            "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(
                                    png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        sc14.close();
    }
}
