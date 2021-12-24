import java.util.Scanner;
public class Umur {
    public static void main(String args[]){
        String nama;
        int umur;
        int tahun;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        nama = scan.nextLine();
        System.out.print("Masukkan tahun lahir anda: ");
        tahun = scan.nextInt();
        umur = 2021 - tahun;
        System.out.println("Umur anda sekarang: " + umur) ;
    }
}
