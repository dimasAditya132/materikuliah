package TugasPraktikum4;

import java.util.Scanner;
public class GajiIf {
    public static void main(String args[]){
        Scanner gaji = new Scanner(System.in);

        String nama,bagian;
        int harikerja;
        double uangmakan,uangtrans, gajikotor,bonus, gajibersih,total;


        System.out.print("Nama : ");
        nama = gaji.next();
        System.out.print("Bagian : ");
        bagian = gaji.next();
        System.out.print("Jumlah hari kerja : ");
        harikerja = gaji.nextInt();
        uangmakan = harikerja*25000;
//        System.out.println("Total uang makan : " + uangmakan);
        uangtrans = harikerja*15000;
//        System.out.println("Total uang transport : " +uangtrans);
        gajikotor =  uangmakan+uangtrans;
//        System.out.println("Gaji Kotor : " + gajikotor);

        if (harikerja >= 24){
            bonus = 75000;
        } else if (harikerja >= 20){
            bonus = 50000;
        } else if (harikerja >= 18){
            bonus = 30000;
        }else {
            bonus = 0;
        }
//        System.out.println("Bonus : "+bonus);
        total = gajikotor+bonus;
        gajibersih = total - (total*0.05);
//        System.out.println("Gaji Bersih" + gajibersih);

        //Dialog
        System.out.println(" ");
        System.out.println("----------------------------------");
        System.out.println(" SISTEM PENGGAJIAN KARYAWAN ");
        System.out.println(" Nama : " + nama);
        System.out.println(" Bagian : " + bagian);
        System.out.println(" Jumlah hari kerja : " +harikerja);
        System.out.println(" Total Uang Makan : Rp." +uangmakan);
        System.out.println(" Total Uang Transport : Rp." +uangtrans);
        System.out.println(" ------------------------------ ");
        System.out.println(" Gaji Kotor : Rp." +gajikotor);
        System.out.println(" Bonus : Rp." +bonus);
        System.out.println(" Gaji Bersih : Rp."+gajibersih);

    }
}
