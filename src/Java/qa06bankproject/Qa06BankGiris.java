package Java.qa06bankproject;

import java.util.Scanner;

import static qa06bankproject.PersonIslemler.personIslemler;


public class Qa06BankGiris {
    static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        char secim = 'q';
        do {
            System.out.println("********************QA06 BANK*******************");
            System.out.println("*******************HOŞGELDİNİZ******************");
            System.out.println("****lÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ****");
            System.out.println("Çalışan ve Müşteri İşlemleri için :'1' e basınız");
            System.out.println("Departman İşlemleri için          :'2' e basınız");
            System.out.println("Hesap İşlemleri için              :'3' e basınız");
            System.out.println("Çıkmak için                       :'q'ya basınız");
            System.out.println("********************QA06 BANK*******************");
            secim = input.next().charAt(0);

            switch (secim) {
                case '1':
                    personIslemler();
                    break;
                case '2':
                case '3':
                case 'q':
                    System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyiniz");
            }
        } while (secim != 'q');
    }




}//class
