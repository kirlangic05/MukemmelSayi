package Donguler;

import java.util.Scanner;

public class Amortisman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int basSayi = 0;
        int basamak;
        int uslu ;
        int total=0;
        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();

        int tempSayi = sayi;

        while (tempSayi != 0) {
            tempSayi /= 10;
            basSayi++;
        }
        tempSayi = sayi;

        while (tempSayi != 0) {
            basamak = tempSayi % 10;
            uslu = 1;

            for (int i = 1; i <= basSayi; i++) {
                uslu *= basamak;

            }
            total+=uslu;
            tempSayi /= 10;

        }
        System.out.println(total);



    }
}
