package TugasPraktikum6;

public class Ratarata {
    public static void main(String[] args) {
        int[] nilai = new int[10];
        nilai[0] = 80;
        nilai[1] = 75;
        nilai[2] = 86;
        nilai[3] = 87;
        nilai[4] = 78;
        nilai[5] = 92;
        nilai[6] = 83;
        nilai[7] = 85;
        nilai[8] = 76;
        nilai[9] = 75;

        int i;
        float rata = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Nilai Ke " + (i + 1) + " = " + nilai[i]);
            rata = rata + nilai[i];
        }
        System.out.println("Rata - rata = " + rata / 10);
    }
}
