package TugasPraktikum5;

import java.util.Scanner;

public class GajiSwitch {
    public static void main(String[] args)
            throws java.io.IOException {
        Scanner gaji = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        String nama, jawab;
        int a = 0;
        double gajipokok, jabatan, kesehatan, total;
        int golongan;
        while (running) {
            do {
                System.out.print("Nama : ");
                nama = gaji.next();
                System.out.print("Gaji Pokok : ");
                gajipokok = gaji.nextDouble();
                System.out.println("Golongan : ");
                System.out.println("1. Golongan 1");
                System.out.println("2. Golongan 2");
                System.out.println("3. Golongan 3");
                System.out.println("4. Tanpa Golongan");
                System.out.print("Pilih satu :");
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
            } while (golongan < 1 || golongan > 4);
            System.out.println("\n");

            //Dialog
            System.out.println(" -------------------------- ");
            System.out.println(" Nama : " + nama);
            System.out.println(" Gaji Pokok : Rp." + gajipokok);
            System.out.println(" Tunjangan Jabatan : Rp." + jabatan);
            System.out.println(" Tunjangan Kesehatan : Rp." + kesehatan);
            System.out.println(" Gaji total dari " + nama + " adalah Rp." + total);

            System.out.println(" ");
            System.out.println("Apakah anda ingin menambah lagi?");
            System.out.println("Jawab [YA/TIDAK].");

            jawab = scan.next();

            if (jawab.equalsIgnoreCase("tidak")) {
                running = false;
            } else {
                running = true;
            }
            a++;
        }
    }
}