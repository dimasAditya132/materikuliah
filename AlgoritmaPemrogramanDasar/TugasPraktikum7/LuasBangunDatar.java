package TugasPraktikum7;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void lingkaran() {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r, luas;
        System.out.println("\n--->LINGKARAN<---");
        System.out.print("Masukkan panjang jari-jari: ");
        r = input.nextDouble();
        luas = phi * r * r;
        System.out.println("Luas = " + luas);
        System.out.println(" ");
    }

    public static void bujur_sangkar() {
        Scanner input = new Scanner(System.in);
        double s, luas;
        System.out.println("\n--->BUJUR SANGKAR<---");
        System.out.print("Masukkan panjang sisi: ");
        s = input.nextDouble();
        luas = s * s;
        System.out.println("Luas = " + luas);
        System.out.println(" ");
    }

    public static void segitiga() {
        Scanner input = new Scanner(System.in);
        double a, t, luas;
        System.out.println("\n--->SEGITIGA<---");
        System.out.print("Masukkan alas: ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();
        luas = 0.5 * a * t;
        System.out.println("Luas: " + luas);
        System.out.println(" ");
    }

    public static void persegi_panjang() {
        Scanner input = new Scanner(System.in);
        double p, l, luas;
        System.out.println("\n--->PERSEGI PANJANG<---");
        System.out.print("Masukkan panjang: ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        l = input.nextDouble();
        luas = p * l;
        System.out.println("Luas:" + luas);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int pil = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Menghitung Luas Bangun Datar");
            System.out.println("1.Segitiga");
            System.out.println("2.Lingkaran");
            System.out.println("3.Persegi panjang");
            System.out.println("4.Bujur Sangkar");
            System.out.println("Masukkan pilihan: ");
            pil = input.nextInt();
        } catch (Exception ignored) {
        }
        switch (pil) {
            case 1:
                LuasBangunDatar.segitiga();
                break;
            case 2:
                LuasBangunDatar.lingkaran();
                break;
            case 3:
                LuasBangunDatar.persegi_panjang();
                break;
            case 4:
                LuasBangunDatar.bujur_sangkar();
                break;
            default:
                System.out.println("Salah Pilih");
        }
    }
}
