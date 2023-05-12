package Java.qa06bankproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static qa06bankproject.MusteriCalisanIslemler.*;
import static qa06bankproject.Qa06BankGiris.showMenu;

public class PersonIslemler {
    static List<Calisan> calisans = new ArrayList<>();
    static List<Musteri> musteris = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void personIslemler() {
        char secim;

        do {
            System.out.println("     *****************QA06 BANK****************");
            System.out.println("*************ÇALIŞAN ve MÜŞTERİ İŞLEMLERİ***********");
            System.out.println("Lütfen  yapmak istediğiniz işlemi seçiniz");
            System.out.println("Kişi eklemek için      :'1' e basınız");
            System.out.println("Kişi silmek  için      :'2' e basınız");
            System.out.println("Kişi listelemek için   :'3' e basınız");
            System.out.println("Kişi görüntülemek için :'4' e basınız");
            System.out.println("Önceki menü için       :'0' a basınız");
            System.out.println("Çıkmak için            :'q' e basınız");
            System.out.println("     *****************QA06 BANK****************");
            secim = input.next().charAt(0);
            switch (secim) {
                case '1': {
                    add();
                    break;
                }
                case '2': {
                    remove();
                    break;
                }
                case '3': {
                    listele();
                    break;
                }
                case '4': {
                    kisiGoster();
                    break;
                }
                case '0': {
                    showMenu();
                    break;
                }
                case 'q': {
                    System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                    break;
                }
                default:
                    System.out.println("Geçerli bir giriş yapınız");
                    personIslemler();
            }
        } while (secim!='q');
    }










}







