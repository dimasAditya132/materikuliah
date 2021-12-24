package TugasPraktikum3;

import java.util.Scanner;
public class CaseJurusan {
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);

        int pil;

        System.out.print("Masukkan pilihan : ");
        pil = masuk.nextInt();

        switch (pil){
            case 1:System.out.print("Jurusan MI/D3");break;
            case 2:System.out.print("Jurusan TK/D3");break;
            case 3:System.out.print("Jurusan KA/D3");break;
            case 4:System.out.print("Jurusan TI/S1");break;
            case 5:System.out.print("Jurusan SI/S1");break;
            default: System.out.println("Salah masukkan pilihan");
                break;
        }
    }
}
