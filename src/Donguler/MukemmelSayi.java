package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int a = inp.nextInt();
        int toplam = 0;

        for (int i = 1; i < a; i++) {

            if (a % i == 0) {
                toplam += i;
            }
        }

        if (toplam == a) {
            System.out.println("Sorgulanan sayı mükemmel sayıdır. " + toplam);
        } else {
            System.out.println("Sorgulanan sayı mükemmel bir sayı değildir. " + toplam);
        }
    }
}
