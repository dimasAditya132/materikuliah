package TugasPraktikum5;

import java.util.Scanner;
public class Coba {
    public static void main(String[] args){
        int bil,n,m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal :");
        m = scan.nextInt();
        System.out.print("Masukkan Nilai Akhir :");
        n = scan.nextInt();

         for (bil=m; bil<= n; bil++)
             if (bil % 2== 0) {
                 System.out.print(" "+bil);
             }
    }
}
