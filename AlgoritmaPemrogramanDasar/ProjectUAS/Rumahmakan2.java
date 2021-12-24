package ProjectUAS;

import java.util.*;

public class Rumahmakan2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws java.io.IOException {
//        boolean Y = true;
        int jumlahbeli, harga;
        String ulangi = "y", namaitem;
        char pilihan;
        while (ulangi.equalsIgnoreCase("y") || ulangi.equalsIgnoreCase("Y")) {
            System.out.println("=================================================================================");
            System.out.println("=================================  MENU  BURJO  =================================");
            System.out.println("=================================================================================");
            System.out.println("| NO.   | Nama Item                             | Harga                         |");
            System.out.println("|  1.   | Sayap Ayam                            | Rp.11.000,00                  |");
            System.out.println("|  2.   | Dada Ayam                             | Rp.14.000,00                  |");
            System.out.println("|  3.   | Paha Ayam                             | Rp.12.000,00                  |");
            System.out.println("|  4.   | Kepala Ayam                           | Rp.10.000,00                  |");
            System.out.println("=================================================================================");
            System.out.println("|  Note*  : Diskon 5% bila jumlahbayar > RP.50.000,00                           |");
            System.out.println("=================================================================================");
            System.out.print("\n|  Menu berapa yang anda pilih      : ");
            pilihan = (char) System.in.read();
            System.out.print("| Masukan Jumlah beli         : ");
            jumlahbeli = scan.nextInt();
            switch (pilihan) {
                case '1' -> {
                    namaitem = "Sayap";
                    harga = 11000;
                    proses(jumlahbeli, namaitem, harga);
                }
                case '2' -> {
                    namaitem = "Dada";
                    harga = 14000;
                    proses(jumlahbeli, namaitem, harga);
                }
                case '3' -> {
                    namaitem = "Paha";
                    harga = 12000;
                    proses(jumlahbeli, namaitem, harga);
                }
                case '4' -> {
                    namaitem = "Kepala";
                    harga = 10000;
                    proses(jumlahbeli, namaitem, harga);
                }
            }
            System.out.print("\n Ingin masuk ke menu lagi ? [Y/N] : ");
            scan.nextLine();
            ulangi = scan.nextLine();
            System.out.println("\n");
        }
        System.out.println("\n============================================");
        System.out.println("Terima Kasih >>>>>");
    }

    public static void proses(int param_jumlahbeli, String param_namaitem, int param_harga) {
        int jumlahbayar, harga = 10000, diskon, totalbayar, uangpembeli = 0, kembalian;
        boolean validasi_bila_kurang = true;
        System.out.println("\n======== Anda Memilih " + param_namaitem + "Ayam ========");
        jumlahbayar = param_jumlahbeli * harga;
        if (jumlahbayar >= 50000) {
            diskon = jumlahbayar * 5 / 100;
        } else {
            diskon = 0;
        }
        totalbayar = jumlahbayar - diskon;
        System.out.println("| Diskon yang didapat           :" + diskon);
        System.out.println("| Total bayar anda              :" + totalbayar);
        while (validasi_bila_kurang) {
            System.out.print("| Masukan uang bayar              : ");
            uangpembeli = scan.nextInt();
            if (uangpembeli < totalbayar) {
                System.out.println("| Maaf uang anda kurang !  ");
            } else {
                validasi_bila_kurang = false;
            }
        }
        kembalian = uangpembeli - totalbayar;
        System.out.println("| Kembaliannya                      :" + kembalian);
    }
}
