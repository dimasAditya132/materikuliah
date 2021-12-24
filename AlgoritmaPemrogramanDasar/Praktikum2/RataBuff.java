import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RataBuff {
    public static void main(String args[]){
        BufferedReader rata = new BufferedReader(new InputStreamReader(System.in));

    int a = 0;
    int b = 0;
    int c = 0;
    double hasil =0.0;

    try{
        System.out.print("Masukkan Nilai 1 : ");
            a = Integer.parseInt(rata.readLine());
        System.out.print("Masukkan Nilai 2 : ");
            b = Integer.parseInt(rata.readLine());
        System.out.print("Masukkan Nilai 3 : ");
            c = Integer.parseInt(rata.readLine());

            hasil = (a + b + c) / 3;
    }catch (Exception e){}

        System.out.println(" ");
        System.out.println("*** HASIL NILAI RATA-RATA ***");
        System.out.println("Nilai 1 : "+a);
        System.out.println("Nilai 2 : "+b);
        System.out.println("Nilai 3 : "+c);
        System.out.println("Rata-rata Nilai : " +hasil);
    }
}
