package TugasPraktikum4;

public class ForBersarang {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.print("*");

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
