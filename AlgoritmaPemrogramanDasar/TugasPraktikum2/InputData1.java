package TugasPraktikum2;

import java.util.Scanner;
public class InputData1 {
    public static void main(String args[]){
        Scanner data = new Scanner(System.in);

        //pendefinisian varibel
        int NIM = 0;
        String NAMA = "";
        String GOL = "";
        float BERAT = 0;
        double TINGGI = 0.0;

        //membaca dari keyboard
        System.out.print("Nomor Induk Mahasiswa:");
            NIM=data.nextInt();
        System.out.print("Nama Mahasiswa :");
            NAMA= data.next();
        System.out.print("Golongan Darah:");
            GOL=data.next();
        System.out.print("Berat Badan:");
            BERAT= data.nextFloat();
        System.out.print("Tinggi Badan:");
            TINGGI= data.nextDouble();

        //mencetak isi variabel
        System.out.println("HASIL INPUT KEYBOARD");
        System.out.println("Nomor Induk Mahasiswa:" + NIM);
        System.out.println("Nama Mahasiswa:" + NAMA);
        System.out.println("Golongan Darah:" + GOL);
        System.out.println("Berat Badan:" + BERAT);
        System.out.println("Tinggi Badan:" + TINGGI);
    }

}
