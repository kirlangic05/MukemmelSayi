package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userNumber, password;
        int hak = 3;
        int islem;
        int bakiye = 5000;
        int tutar;

        Scanner input = new Scanner(System.in);


        while (hak > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userNumber = input.nextLine();
            System.out.print("Parolayı giriniz : ");
            password = input.nextLine();

            if (userNumber.equals("furkan") && password.equals("123")) {
                System.out.println("Giriş başarıyla gerçekleşti.");
                do {

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
                    System.out.println("1-Bakiye sorgulama\n" + "2-Para yatırma\n" + "3-Para çekme\n" + "4-Çıkış");
                    islem = input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");

                            tutar= input.nextInt();
                            bakiye += tutar;
                            break;
                        case 3:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            tutar= input.nextInt();
                            bakiye -= tutar;
                            break;
                        case 4:
                            System.out.println("Sistemden çıkılıyor.");
                            break;
                        default:
                            System.out.println("Geçersiz işlem girdiniz. Lütfen tekrar deneyin.");


                    }
                } while (islem != 4);
break;

            } else {
                hak--;
                System.out.println("Hatalı giriş yaptınız");
                System.out.println("Kalan hakkınız : " + hak);
            }
        }
    }
}
