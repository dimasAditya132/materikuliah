package TugasPraktikum2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InputData {
    public static void main(String args[]){

        //pendefinisian stream baca
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));

        //pendefinisian variabel
        int NIM = 0;
        String NAMA = "";
        String GOL = "";
        float BERAT = 0;
        double TINGGI = 0.0;

        //membaca dari keyboard
        try{
            System.out.print("Nomor Induk Mahasiswa : ");
                NIM = Integer.parseInt(baca.readLine());
            System.out.print("Nama Mahasiswa : ");
                NAMA = baca.readLine();
            System.out.print("Golongan Darah : ");
                GOL = baca.readLine();
            System.out.print("Berat Badan : ");
                BERAT = Float.parseFloat(baca.readLine());
            System.out.print("Tinggi Badan : ");
                TINGGI = Double.parseDouble(baca.readLine());
        }
        catch(Exception e){}

        //mencetak isi variabel
        System.out.println("HASIL INPUT KEYBOARD");
        System.out.println("Nomor Induk Mahasiswa : "+NIM);
        System.out.println("Nama Mahasiswa : "+NAMA);
        System.out.println("Golongan Darah : "+GOL);
        System.out.println("Berat Badan : "+BERAT);
        System.out.println("Tinggi Badan : "+TINGGI);
    }
}
