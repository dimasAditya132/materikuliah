package TugasPraktikum2a;

import java.util.Scanner;
public class Diskon {
    public static void main (String []args){
        //untuk mengimput data dari user
        Scanner input=new Scanner(System.in);

        // mendeklarasika variabel
        int price ; // harga
        int amount; //jumlah
        int discount; // diskon
        int total ; //jumlah*harga

        // Selanjutnya kita membuat program untuk memasukan harga barang dan jumlah barang yang langsung di input oleh user

        System.out.print("Masukan Harga barang disini : ");
        price=input.nextInt();
        System.out.print("Masukan Jumlah barang disini : ");
        amount=input.nextInt();
        total=amount*price;

        // Selanjutnya kita buat program diskonnya menggunakan IF else
        if(total>=3000000){
            discount=total*30/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 30%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if(total>= 2000000){
            discount=total*20/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 20%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if(total>=1000000){
            discount=total*10/100;
            total=total-discount;
            System.out.println("Selamat anda mendapatkan diskon 10%" );
            System.out.println ("jadi totalnya : "+total);
        }
        else if (total<1000000){
            discount=total*0/100;
            total=total-discount;
            System.out.println("Maaf anda tidak mendapatkan diskon" );
            System.out.println ("jadi totalnya : "+total);
        }
    }
}
