package Donguler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantityOfNumber, number, max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        quantityOfNumber = input.nextInt();

        for (int i = 1; i <= quantityOfNumber; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }


    }


