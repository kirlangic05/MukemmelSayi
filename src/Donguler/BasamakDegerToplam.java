package Donguler;

import java.util.Scanner;

public class BasamakDegerToplam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int total = 0;
        int basamak;

        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();

        int sayi2 = sayi;

        while (sayi2 != 0) {

            basamak = sayi2 % 10;
            total += basamak;
            sayi2 /= 10;

        }
        System.out.println("Basamakların toplamından elde edilen sayı : "+total);

    }
}
