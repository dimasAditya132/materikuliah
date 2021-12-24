package TugasPraktikum5;

import java.util.Scanner;
public class PerulanganWhile1 {
    public static void main(String[] args){
        boolean running = true;
        int a = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while (running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [YA/TIDAK].");

            jawab = scan.nextLine();

            //cek jawabnya, kalau ya maka berhenti mengulang
            if(jawab.equalsIgnoreCase("YA")){
                running = false;
            }
            a++;
        }
    }
}
