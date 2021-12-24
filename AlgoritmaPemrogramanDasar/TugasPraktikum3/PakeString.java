package TugasPraktikum4;

import java.util.Scanner;

public class PakeString {
    public enum warnaLampu{
        merah,kuning,hijau,salah;

        public static warnaLampu nyala(String str){
            try {
                return valueOf(str);
            }catch (Exception e){
                return salah;
            }
        }
    }
    /** Creates a new instance of switchString */
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        String warna = "";

        System.out.print("Masukkan pilihan : ");
        warna = masuk.next();

        switch (warnaLampu.nyala(warna)){
            case merah:
                System.out.println("stop");break;
            case kuning:
                System.out.println("pelan");break;
            case hijau:
                System.out.println("jalan");break;
            default:
                System.out.println("waton!!!");break;
        }
    }
}
