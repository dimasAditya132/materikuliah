package TugasPraktikum2;

import javax.swing.JOptionPane;
public class Input3 {
    public static void main(String args[]){
        String nama;
        String nim;
        nama = JOptionPane.showInputDialog("Ketik Nama Anda: ");
        nim = JOptionPane.showInputDialog("Ketik NIM Anda: ");

        JOptionPane.showMessageDialog(null, "Hallo" + nama + "\n" + "NIM anda adalah " + nim);
    }
}
