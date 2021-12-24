package TugasPraktikum2a;

import java.util.Scanner;
public class NotaCoba {
    public static void main(String args[]){
        Scanner coba = new Scanner(System.in);

        String nama,barang = "";
        double harga,jumlah,diskon,total,bayar,kembalian,hemat=0;
        int banyak = 0;

        System.out.print("Nama Pembeli :");
        nama = coba.next();
        System.out.print("Nama Barang : ");
        barang = coba.next();
        System.out.print("Harga Barang : ");
        harga = coba.nextDouble();
        System.out.print("Banyak : ");
        banyak = coba.nextInt();

        jumlah = harga*banyak;
        System.out.println("Jumlah : "+jumlah);

        if (jumlah >= 120000) {
            diskon = jumlah * 0.05;
        } else if (jumlah >= 90000) {
            diskon = jumlah * 0.02;
        } else {
            diskon = jumlah * 0;
        }
        System.out.println("Anda Hemat : "+diskon);

        total = jumlah-diskon;
        System.out.println("Total : "+total);

        System.out.print("Bayar : ");
        bayar = coba.nextDouble();

        kembalian = bayar - total;
        System.out.println("Kembalian : "+kembalian);

    //DIALOG
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("| TOKO JAYA SELALU |");
        System.out.println("--------------------");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Nama Barang : " + barang);
        System.out.println("Banyak : " + banyak);
        System.out.println("Jumlah : Rp." + jumlah);
        System.out.println("Anda Hemat : Rp." + diskon);
        System.out.println("Total : Rp." + total);
        System.out.println("Bayar : Rp." + bayar);
        System.out.println("Kembalian : Rp." + kembalian);
        System.out.println("*** THANK YOU ***");
    }
}
