package QuizPraktekAlpro1;

import java.util.Scanner;

public class Soal2A_1121060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 100, range = max - min + 1;
        double r, p;
        int x = (int) (Math.random() * range) + min;
        int y = (int) (Math.random() * range) + min;
        System.out.println("Koordinat Cartesius : ");
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        r = Math.round(Math.sqrt(Math.sqrt((x * x) + (y * y))));
        p = Math.round(Math.atan(y / x));
        System.out.println("Koordinat Polar : ");
        System.out.println("R = " + r);
        System.out.println("P = " + p);
    }
}
