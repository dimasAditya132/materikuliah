import java.util.Scanner;

public class RataScan {
    public static void main(String args[]){
        Scanner rata = new Scanner(System.in);

        int a,b,c = 0;
        double hasil = 0.0;

        System.out.print("Masukkan Angka 1 : ");
            a = rata.nextInt();
        System.out.print("Masukkan Nilai 2 : ");
            b = rata.nextInt();
        System.out.print("Masukkan Nilai 3 : ");
            c = rata.nextInt();

            hasil = (a + b + c) / 3;

        System.out.println(" ");
        System.out.println("*** HASIL NILAI RATA-RATA ***");
        System.out.println("Nilai 1 : " +a);
        System.out.println("Nilai 2 : " +b);
        System.out.println("Nilai 3 : " +c);
        System.out.println("Rata-rata Nilai : " +hasil);
    }
}
