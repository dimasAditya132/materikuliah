package TugasPraktikum3;

import java.util.Scanner;
public class GajiSwitch {
    public static void main(String[] args) {
        Scanner gaji = new Scanner(System.in);
        String nama;
        double gajipokok, jabatan, kesehatan, total;
        int golongan;

        System.out.print("Nama : ");
        nama = gaji.next();
        System.out.print("Gaji Pokok : ");
        gajipokok = gaji.nextDouble();
        System.out.print("Golongan : ");
        golongan = gaji.nextInt();

        switch (golongan) {
            case 1:
                jabatan = 500000;
                kesehatan = 250000;
                break;
            case 2:
                jabatan = 300000;
                kesehatan = 200000;
                break;
            case 3:
                jabatan = 100000;
                kesehatan = 100000;
                break;
            default:
                jabatan = 0;
                kesehatan = 0;
                break;
        }
        total = gajipokok + jabatan + kesehatan;

        //Dialog
        System.out.println(" ");
        System.out.println(" -------------------------- ");
        System.out.println(" Nama : " + nama);
        System.out.println(" Gaji Pokok : Rp." + gajipokok);
        System.out.println(" Tunjangan Jabatan : Rp." + jabatan);
        System.out.println(" Tunjangan Kesehatan : Rp." + kesehatan);
        System.out.println(" Gaji total dari " + nama + " adalah Rp." + total);

    }
}