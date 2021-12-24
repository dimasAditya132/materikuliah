package TugasPraktikum5;
//membuat loop do-while untuk memproses suatu menu
public class DoWhileMenu {
    public static void main(String[] args)
    throws java.io.IOException{
        char pilihan;
        do{
            System.out.println("Silahkan pilih :");
            System.out.println("1. If");
            System.out.println("2. Switch");
            System.out.println("3. While");
            System.out.println("4. Do-while");
            System.out.println("5. for \n");
            System.out.println("Pilih satu :");
            pilihan = (char)System.in.read();
        }while (pilihan<'1' || pilihan > '5');
        System.out.println("\n");

        switch (pilihan) {
            case '1' -> {
                System.out.println("Statement if\n");
                System.out.println("if(kondisi) statement");
                System.out.println("else statement");
            }
            case '2' -> {
                System.out.println("Statement switch:\n");
                System.out.println("Switch (ekspresi) {");
                System.out.println("case konstanta:");
                System.out.println("runtun statement");
                System.out.println("break");
                System.out.println("// ...");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("Loop while:\n");
                System.out.println("while(kondisi) statement;");
            }
            case '4' -> {
                System.out.println("Loop do-while:\n");
                System.out.println("do{");
                System.out.println("statement;");
                System.out.println("} while (kondisi);");
            }
            case '5' -> {
                System.out.println("Loop for:\n");
                System.out.println("for(inisialisasi; kondisi; iterasi)");
                System.out.println("statement");
            }
        }

    }
}

