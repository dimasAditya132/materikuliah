package TugasPraktikum7;

public class Fungsi3a {
    public static int jumlah(){
        int a=7,b=15;
        return (a + b);
    }
    public static void main(String args[]){
        Fungsi3a obyek = new Fungsi3a();
        System.out.println("Hasil pemanggilan method jumlah");
        System.out.println(obyek.jumlah());
    }
}
