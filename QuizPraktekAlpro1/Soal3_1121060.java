package QuizPraktekAlpro1;

import java.util.Scanner;

public class Soal3_1121060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = sc.nextInt();
        System.out.println("Masukkan tebal : ");
        int tebal = sc.nextInt();
        for (int i = 1; i <= tebal; i++) {
            for (int j = 1; j <= tebal * 2 + n + n - 1; j++) {
                System.out.print("= ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            System.out.println("");
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= tebal; j++) {
                System.out.print("= ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= tebal; i++) {
            for (int j = 1; j <= tebal * 2 + n + n - 1; j++) {
                System.out.print("= ");
            }
            System.out.println("");
        }
    }
}
