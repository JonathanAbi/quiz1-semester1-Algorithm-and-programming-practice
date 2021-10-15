package QuizPraktekAlpro1;

import java.util.Scanner;

public class Soal2B_1121060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int satu = 1;
        System.out.println("Masukkan n (1-9): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int hasil = satu * satu;
            System.out.println("n ke-" + i + " : " + satu + " x " + satu + " = " + hasil);
            satu = (satu * 10) + 1;
        }
        System.out.println("");
    }
}
