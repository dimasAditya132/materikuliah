package TugasPraktikum4;

public class Increment1 {
    public static void main(String[] args){
        int a = 10;
        int b = 10;

        System.out.println("Post Increment");
        System.out.println("--------------");
        System.out.println("Nilai Variabel a:" + a);
        System.out.println("Nilai Variabel a:" + a++);
        System.out.println("Nilai Variabel a:" + a);

        System.out.println("");

        System.out.println("Pre Increment");
        System.out.println("--------------");
        System.out.println("Nilai Variabel b:" + b);
        System.out.println("Nilai Variabel b:" + ++b);
        System.out.println("Nilai Variabel b:" + b);

        System.out.println("");

        System.out.println("Post Decrement");
        System.out.println("--------------");
        System.out.println("Nilai Variabel a:" + a);
        System.out.println("Nilai Variabel a:" + a--);
        System.out.println("Nilai Variabel a:" + a);

        System.out.println("");

        System.out.println("Pre Decrement");
        System.out.println("--------------");
        System.out.println("Nilai Variabel b:" + b);
        System.out.println("Nilai Variabel b:" + --b);
        System.out.println("Nilai Variabel b:" + b);
    }
}