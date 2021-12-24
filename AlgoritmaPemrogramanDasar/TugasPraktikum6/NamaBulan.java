package TugasPraktikum6;

public class NamaBulan {
    public static void main(String[] args) {
        String[] bulan;
        bulan = new String[12];

        bulan[0] = "Januari";
        bulan[1] = "Februari";
        bulan[2] = "Maret";
        bulan[3] = "April";
        bulan[4] = "Mei";
        bulan[5] = "Juni";
        bulan[6] = "Juli";
        bulan[7] = "Agustus";
        bulan[8] = "September";
        bulan[9] = "Oktober";
        bulan[10] = "November";
        bulan[11] = "Desember";

        int i;
        for (i = 0; i < 12; i++)
            System.out.println("Bulan Ke " + (i + 1) + " " + bulan[i]);
    }
}
