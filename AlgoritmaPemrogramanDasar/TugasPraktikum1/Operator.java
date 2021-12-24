package TugasPraktikum1;

public class Operator {
    public static void main(String args[]){
        int x = 4;
        int y = 8;
        int z = 9;
        int g = 0;

        g = x+y;
        System.out.println("Penjumlahan (x + y)=" + g);

        g = y-x;
        System.out.println("Pengurangan (y - x)=" + g);

        g = x*y;
        System.out.println("Perkalian (x * y)=" + g);

        g = y/x;
        System.out.println("Pembagian (y / x)=" + g);

        g = z%x;
        System.out.println("Sisa Pembagian(z % x)=" + g);

        g = x+(y-(z/x));
        System.out.println("Pembagian (y/x)=" + g);

    }
}
