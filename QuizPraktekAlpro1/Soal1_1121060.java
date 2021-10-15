package QuizPraktekAlpro1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Soal1_1121060 {

    public static void main(String[] args) {
        Random random = new Random();
        int simbol = random.nextInt(4)+1;
        int kartu = random.nextInt(13)+1;
        int nomorSimbol = 0;
        int angkaKartu;
        String namaSimbol = null, lambangKartu;
        do {
            char simboll = JOptionPane.showInputDialog("Input Simbol\n(S)Spade\n(H)Heart\n(D)Diamond\n(C)Club").charAt(0);
            if (simboll == 'S' || simboll == 's') {
                nomorSimbol = 1;
                namaSimbol = "Spade";
            } else if (simboll == 'H' || simboll == 'h') {
                nomorSimbol = 2;
                namaSimbol = "Heart";
            } else if (simboll == 'D' || simboll == 'd') {
                nomorSimbol = 3;
                namaSimbol = "Diamond";
            } else if (simboll == 'C' || simboll == 'c') {
                nomorSimbol = 4;
                namaSimbol = "Club";
            }
            String angka = JOptionPane.showInputDialog("Input Angka\n(1)As\n(2)2\n(3)3\n(4)4\n(5)5\n(6)6\n(7)7\n(8)8\n(9)9\n(10)\n(11)Jack\n(12)Queen\n(13)King");
            angkaKartu = Integer.parseInt(angka);
            if (angkaKartu == 1) {
                lambangKartu = "As";
            } else if (angkaKartu == 11) {
                lambangKartu = "Jack";
            } else if (angkaKartu == 12) {
                lambangKartu = "Queen";
            } else if (angkaKartu == 13) {
                lambangKartu = "King";
            } else {
                lambangKartu = String.valueOf(angka);
            }
            if (lambangKartu.equals(kartu) && namaSimbol.equals(simbol)) {
                JOptionPane.showMessageDialog(null, "Selamat tebakan anda benar!! Kartu yang tepat adalah " + namaSimbol + "-" + namaSimbol);
            } else if (nomorSimbol != simbol) {
                JOptionPane.showMessageDialog(null, "Simbol kartu tebakan anda masih kurang tepat, ayo pilih kartu lainnya");
            } else if (angkaKartu < kartu) {
                JOptionPane.showMessageDialog(null, "Ayo sedikit lagi, angka kartu anda masih kurang besar");
            } else if (angkaKartu > kartu) {
                JOptionPane.showMessageDialog(null, "Ayo sedikit lagi, angka kartu anda masih kurang kecil");
            }
        } while (lambangKartu != "kartu" || nomorSimbol != simbol);
    }
}
