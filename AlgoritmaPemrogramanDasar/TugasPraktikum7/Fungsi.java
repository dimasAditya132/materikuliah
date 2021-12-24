package TugasPraktikum7;

import java.io.*;

public class Fungsi {
    static double cel_fah(double c) {
        double hasil;
        hasil = c + 273.15;
        return hasil;
    }

    static double cel_kel(double c) {
        double hasil;
        hasil = (9 / 5 * c) + 32;
        return hasil;
    }

    static double cel_rea(double c) {
        double hasil;
        hasil = (4 / 5) * c;
        return hasil;
    }

    //program utama
    public static void main(String args[]) {
        double cc = 0;
        int pil = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Derajat: ");
            cc = Double.parseDouble(in.readLine());
            System.out.println("Pilih konversi 1 Fahrenheit: ");
            System.out.println("Pilih konversi 2 Kelvin: ");
            System.out.println("Pilih konversi 3 Reamur: ");
            pil = Integer.parseInt(in.readLine());
        } catch (Exception e) {
        }//end try
        switch (pil) {
            case 1:
                System.out.println(cc + "Derajat C ke F = " + cel_fah(cc));
                break;
            case 2:
                System.out.println(cc + "Derajat C ke K = " + cel_kel(cc));
                break;
            case 3:
                System.out.println(cc + "Derajat C ke R = " + cel_rea(cc));
                break;
            default:
                System.out.println("Salah Pilih");
        }
    }//end main
}//end class
