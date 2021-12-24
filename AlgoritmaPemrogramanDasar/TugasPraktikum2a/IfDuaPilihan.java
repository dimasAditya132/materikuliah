package TugasPraktikum2a;

import java.util.Scanner;
public class IfDuaPilihan {
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan Bilangan : ");
        bil = masuk.nextInt();
            if(bil==0)
        System.out.println("Bilangan Nol");
            else
                System.out.println("Bilangan Bukan Nol");
    }
}
