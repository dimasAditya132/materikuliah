package TugasPraktikum2a;

import java.util.Scanner;
public class NotaIf2 {
    public static void main(String args[]){
        Scanner nota = new Scanner(System.in);

        String nama,barang = "";
        double harga,jumlah,diskon,total,bayar,kembalian =0;
        int banyak = 0;

        System.out.print("Nama Pembeli :");
        nama = nota.next();
        System.out.print("Nama Barang : ");
        barang = nota.next();
        System.out.print("Harga Barang : ");
        harga = nota.nextDouble();
        System.out.print("Banyak : ");
        banyak = nota.nextInt();

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
        bayar = nota.nextDouble();

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