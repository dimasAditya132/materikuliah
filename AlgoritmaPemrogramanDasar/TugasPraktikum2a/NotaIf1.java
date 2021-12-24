package TugasPraktikum2a;

import java.util.Scanner;
public class NotaIf1 {
    public static void main(String args[]){
        Scanner nota = new Scanner(System.in);

        String nama= "";
        String barang= "";
        double harga, total, bayar, kembalian = 0;
        int jumlah = 0;

        System.out.print("Nama Pembeli :");
        nama = nota.next();
        System.out.print("Nama Barang :");
        barang = nota.next();
        System.out.print("Harga Barang :");
        harga = nota.nextDouble();
        System.out.print("Jumlah beli : ");
        jumlah = nota.nextInt();

        total = harga * jumlah;
        System.out.println("Total : Rp." +total);

        System.out.print("Bayar : ");
        bayar = nota.nextDouble();

        kembalian = bayar - total;
        System.out.println("Kembalian : RP." +kembalian);

        //Dialog
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("| TOKO JAYA SELALU |");
        System.out.println("--------------------");
        System.out.println("Nama Pembeli : " +nama);
        System.out.println("Nama Barang : " +barang);
        System.out.println("Jumlah Beli : " +jumlah);
        System.out.println("Total : Rp." +total);
        System.out.println("Bayar : Rp." +bayar);
        System.out.println("Kembalian : Rp." +kembalian);

        if(total >= 80000)
            System.out.println("Selamat anda mendapat Mug Syantikk");

        System.out.println("*** THANK YOU ***");
    }
}
