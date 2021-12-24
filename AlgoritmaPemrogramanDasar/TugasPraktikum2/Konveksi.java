package TugasPraktikum2;

import java.util.Scanner;
public class Konveksi {
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);

        float m,cm,inci;

        System.out.print("Masukkan ukuran dalam Meter:");
        m = masuk.nextFloat();
        cm = m * 100;
        inci = m * 100 / 2.54f;

        System.out.println("Ukuran dalam CM =" + cm);
        System.out.println("Ukuran dalam Inci =" + inci);
    }
}
