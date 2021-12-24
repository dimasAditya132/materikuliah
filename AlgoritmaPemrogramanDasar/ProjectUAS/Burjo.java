package ProjectUAS;

import java.util.*;

public class Burjo {
    static Scanner scan = new Scanner(System.in);
    static String pilihan;
    static String[][] itemmakanan_bonus = new String[2][10];
    static int[][] hargamakanan_qty = new int[2][10];
    static int jumlah_jenis_menu = 0;

    static void headermenu() {
        System.out.println("\n\n=================================================================================");
        System.out.println("=================================  MENU  BURJO  ==================================");
        System.out.println("======================  Jln. Ahmad Yani no. 12, Kartasura  =======================");
        System.out.println("==================================================================================");
    }

    static void menupaket() {
        headermenu();
        System.out.println("| No. | Nama Paket          | Menu Paket            | Bonus         | Harga      |");
        System.out.println("|================================================================================|");
        System.out.println("| 1.  | Paket Pedas 1       | Ayam Geprek + Es Teh  | Nasi Double   | Rp.12.000,-|");
        System.out.println("| 2.  | Paket Pedas 2       | Ayam Geprek + Es Susu | Nasi Double   | Rp.13.000,-|");
        System.out.println("| 3.  | Paket Hemat 1       | Nasi Sayur  + Es Teh  | Double Es Teh | Rp.9.000,- |");
        System.out.println("| 4.  | Paket Mewah 1       | Magelangan  + Es Susu | Ayam Goreng   | Rp.15.000,-|");
        System.out.println("| 5.  | Pilihan Dengan Menu Terpisah                                             |");
        System.out.println("|================================================================================|");
        System.out.println("|Note* Diskon 5% bila jumlahbayar > Rp.50.000,00                                 |");
        System.out.println("|================================================================================|");
        System.out.print("| Masukkan Menu Pilihan Anda : ");
        pilihan = scan.nextLine();
        prosesnya();
    }

    static void menuterpisah() {
        headermenu();
        System.out.println("|================================================================================|");
        System.out.println("| No. | Nama Makanan        | Harga         |  | Nama Minuman       | Harga      |");
        System.out.println("|  1. | Magelangan          | Rp.11.000,00  |  | Es Teh / Teh       | Rp.2500,00 |");
        System.out.println("|  2. | Nasi Goreng         | Rp.9.000,00   |  | Es Jeruk / Jeruk   | Rp.3000,00 |");
        System.out.println("|  3. | Ayam Geprek         | Rp.10.000,00  |  | Es Jus             | Rp.5000,00 |");
        System.out.println("|  4. | Nasi Sayur          | Rp.8.000,00   |  | Es Susu            | Rp.4000,00 |");
        System.out.println("|  5. | Tidak Pesan Makanan / Tidak Pesan Minuman                                |");
        System.out.println("|  6. | Pilihan Dengan Menu Paket                                                |");
        System.out.println("==================================================================================");
        System.out.println("| Note* : Diskon 5% bila jumlahbayar >Rp.50.000,00                               |");
        System.out.println("==================================================================================");
        System.out.print("| Masukkan Menu Makanan Anda : ");
        pilihan = scan.nextLine();
        pilihan = pilihan + "2";
        prosesnya();
        System.out.print("| Masukkan Menu Minuman Anda : ");
        pilihan = scan.nextLine();
        pilihan = pilihan + "3";
        prosesnya();
    }

    public static void main(String[] args) throws java.io.IOException {
        boolean lagi_dong = true;
        boolean pesan_lagi = true;
        String cek;
        while (lagi_dong) {
            while (pesan_lagi) {
                menupaket();
                System.out.print("| Ada Pesanan Lain ? [Y/N] : ");
                cek = scan.nextLine();
                if (cek.equalsIgnoreCase("y") || cek.equalsIgnoreCase("Y")) {
                    pesan_lagi = true;
                } else {
                    pesan_lagi = false;
                }
            }
            checkout();
            System.out.print("Ingin Masuk Ke Menu Lagi ? [Y/N] : ");
            String menulagi = scan.nextLine();
            if (menulagi.equalsIgnoreCase("y") || menulagi.equalsIgnoreCase("Y")) {
                jumlah_jenis_menu = 0;
                lagi_dong = true;
                pesan_lagi = true;
            } else {
                lagi_dong = false;
            }
        }
    }

    static void prosesnya() {
        boolean validasi = true;
        if (pilihan.equalsIgnoreCase("5")) {
            menuterpisah();
        } else if (pilihan.equalsIgnoreCase("62") || pilihan.equalsIgnoreCase("63")) {
            menupaket();
        } else if (pilihan.equalsIgnoreCase("53") || pilihan.equalsIgnoreCase("52")) {

        } else if (pilihan.equalsIgnoreCase("1") || pilihan.equalsIgnoreCase("2") ||
                pilihan.equalsIgnoreCase("3") || pilihan.equalsIgnoreCase("4") ||
                pilihan.equalsIgnoreCase("12") || pilihan.equalsIgnoreCase("22") ||
                pilihan.equalsIgnoreCase("32") || pilihan.equalsIgnoreCase("42") ||
                pilihan.equalsIgnoreCase("52") || pilihan.equalsIgnoreCase("13") ||
                pilihan.equalsIgnoreCase("23") || pilihan.equalsIgnoreCase("33") ||
                pilihan.equalsIgnoreCase("43") || pilihan.equalsIgnoreCase("53")) {
            jumlah_jenis_menu = jumlah_jenis_menu + 1;
            while (validasi) {
                System.out.print("|  Masukkan Jumlah Beli Menu Anda : ");
                hargamakanan_qty[1][jumlah_jenis_menu - 1] = scan.nextInt();
                scan.nextLine();
                if (hargamakanan_qty[1][jumlah_jenis_menu - 1] <= 0) {
                    validasi = true;
                    System.out.println("|  Kesalahan Dalam Pengisian Jumlah Beli ! Mohon Diulangi !");
                } else {
                    validasi = false;
                }
            }
            switch (pilihan) {
                case "1":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Paket Pedas 1 : Ayam Geprek + Es Teh ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 12000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Nasi Double";
                    break;
                case "2":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Paket Pedas 2 : Ayam Geprek + Es Susu ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 13000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Nasi Double";
                    break;
                case "3":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Paket Hemat 1 : Nasi Sayur + Es Teh ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 9000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Double Es Teh";
                    break;
                case "4":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Paket Mewah 1 : Magelangan + Es Susu ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 15000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Ayam Goreng";
                    break;
                case "12":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Magelangan                           ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 11000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "22":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Nasi Goreng                          ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 9000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "32":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Ayam Geprek                          ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 10000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "42":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Nasi Sayur                           ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 8000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "13":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Es Teh / Teh                         ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 2500 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "23":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Es Jeruk / Jeruk                     ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 3000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "33":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Es Jus / Jus                         ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 5000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
                case "43":
                    itemmakanan_bonus[0][jumlah_jenis_menu - 1] = "Es Susu / Susu                           ";
                    hargamakanan_qty[0][jumlah_jenis_menu - 1] = 4000 * hargamakanan_qty[1][jumlah_jenis_menu - 1];
                    itemmakanan_bonus[1][jumlah_jenis_menu - 1] = "Tidak Dapat";
                    break;
            }
        } else {
            System.out.println("Masukkan Pilihan Yang Benar !");
        }
    }


    static void checkout() {
        int total = 0;
        int diskon = 0;
        int totalbayar = 0;
        System.out.println("__________________________________________________________________________________");
        System.out.println("| Checkout :                                                                     |");
        System.out.println("|________________________________________________________________________________|");
        System.out.println("| No. | Menu Makanan dan Minuman                | Qty | Bonus        | Sub Harga |");
        System.out.println("|________________________________________________________________________________|");
        for (int i = 0; i < jumlah_jenis_menu; i++) {
            System.out.println("| " + (i + 1) + ".  | " + itemmakanan_bonus[0][i] + "   |  " + hargamakanan_qty[1][i] + "   | " + itemmakanan_bonus[1][i] + "| Rp." + hargamakanan_qty[0][i] + ",00");
            total = total * hargamakanan_qty[0][i];
        }
        if (total > 50000) {
            diskon = total * 5 / 100;
        } else {
            diskon = 0;
        }
        totalbayar = total - diskon;
        System.out.println("|________________________________________________________________________________|");
        System.out.println("| Sub Total :                               | Rp." + total + ",00");
        System.out.println("| Diskon :                                  | Rp." + diskon + ",00");
        System.out.println("| Total Bayar :                             | Rp." + totalbayar + ",00");

        int uangbayar = 0;
        boolean validasiulang = true;
        while (validasiulang) {
            System.out.print("| Masukkan Uang Bayar Anda                | Rp.");
            uangbayar = scan.nextInt();
            scan.nextLine();
            if (uangbayar < totalbayar) {
                System.out.println("| Uang Anda Kurang Mohon Diulangi !");
                validasiulang = true;
            } else {
                validasiulang = false;
            }
        }
        System.out.println("| Kembalian Anda :                              | Rp." + (uangbayar - totalbayar) + ",00");
        System.out.println("|________________________________________________________________________________|");
        System.out.println("|Terima Kasih                                                                    |\n\n");
    }
}
