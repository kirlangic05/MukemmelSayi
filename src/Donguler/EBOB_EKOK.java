package Donguler;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int i = 1, ebob = 1;

        if (n1 < n2) {
            while (i <= n1) {

                if (n1 % i == 0 && n2 % i == 0) {

                    ebob = i;
                }
                i++;

            }
        }
        if (n2 < n1) {
            while (i <= n2) {

                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                }
                i++;

            }
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + (n1 * n2) / ebob);
    }
}
