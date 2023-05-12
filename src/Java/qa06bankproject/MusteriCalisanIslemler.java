package Java.qa06bankproject;

import static qa06bankproject.Qa06BankGiris.showMenu;

public class MusteriCalisanIslemler extends PersonIslemler {

    public static void add() {

        char secim = 'q';
        int c =0;
        int m=0;
        do {
            System.out.println("Çalışan eklemek için : '1' e basınız");
            System.out.println("Müşteri eklemek için : '2' e basınız");
            System.out.println("Önceki menü için     : '0' a basınız");
            System.out.println("Ana menü için        : 'a' ya basınız");
            System.out.println("Çıkmak için          : 'q' ya basınız");
            secim = input.next().charAt(0);
            if (secim=='q'){
                System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                break;
            }
            if (secim=='a'){
                showMenu();
            }
            if (secim=='0'){
                personIslemler();
            }

            System.out.println("Eklemek istediğiniz kişnin ad ve soyadını giriniz:");
            String adSoyad = input.next();

            System.out.println("Eklemek istediğiniz kimlik nosunu giriniz:");
            String kimlikNo = input.next();

            System.out.println("Eklemek istediğiniz cinsiyetini giriniz:");
            String cinsiyet = input.next();

            System.out.println("Eklemek istediğiniz yaşı giriniz:");
            int yas = input.nextInt();

            System.out.println("Eklemek istediğiniz eMaili giriniz:");
            String email = input.next();

            switch (secim) {
                case '1':
                    System.out.println("Eklemek istediğiniz sicil numarasını giriniz");
                    String sicilNo = input.next();

                    System.out.println("Eklemek istediğiniz maaşı giriniz");
                    int maas = input.nextInt();

                    System.out.println("Eklemek istediğiniz depertmanı giriniz");
                    String departman = input.next();
                    Calisan calisan = new Calisan(adSoyad, kimlikNo, cinsiyet, yas, email, sicilNo, maas, departman);
                    calisans.add(calisan);

                        System.out.println(calisan.toString());

//                    System.out.println("Ad soyad : " + calisans.get(c).getAdSoyad() +
//                            " Kimlik No : " + calisans.get(c).getKimlikNo() +
//                            " Cinsiyet : " + calisans.get(c).getCinsiyet() + " Yas : " + calisans.get(c).getYas() + " Email : "
//                            + calisans.get(c).geteMail() + " Sicil No : " + calisans.get(c).getSicilNo() + " Maaş : " + calisans.get(c).getMaas() +
//                            " Departman :  " + calisans.get(c).getDepatman());
//                    c++;
                    break;
                case '2':
                    System.out.println("Eklemek istediğiniz mesleği giriniz:");
                    String meslek = input.next();
                    System.out.println("Eklemek istediğiniz geliri giriniz");
                    int gelir = input.nextInt();

                    Musteri musteri = new Musteri(adSoyad, kimlikNo, cinsiyet, yas, email, meslek, gelir);

                    musteris.add(musteri);
                    System.out.println(musteri.toString());
                //                    System.out.println("Ad soyad : " + musteris.get(m).getAdSoyad() +
//                            " Kimlik No : " + musteris.get(m).getKimlikNo() +
//                            " Cinsiyet : " + musteris.get(m).getCinsiyet() + " Yas : " + musteris.get(m).getYas() + " Email : "
//                            + musteris.get(m).geteMail() + " Meslek : " + musteris.get(m).getMeslek() + " Gelir : " + musteris.get(m).getGelir());
//                    m++;
                    break;

                    default:
                    System.out.println("Geçerli bir giriş yapınız");
                    add();//recrusive method

            }
        } while (secim != 'q');


    }

    public static void remove() {
        char secim ;
        do {
            System.out.println("Çalışan silmek için     : '1' e basınız");
            System.out.println("Müşteri silmek için     : '2' e basınız");
            System.out.println("Önceki menü için        : '0' a basınız");
            System.out.println("Ana menü için           : 'a' ya basınız");
            System.out.println("Çıkmak için             : 'q' ya basınız");
            secim=input.next().charAt(0);
            switch (secim) {
                case '1':
                    System.out.println("Silmek istediğiniz çalışanın T.C kimlik numarasını giriniz...");
                    String tcNoCal=input.next();
                    for (Calisan c:calisans){
                        if (c.getKimlikNo().equals(tcNoCal)){
                            calisans.remove(c);
                            System.out.println("Girmiş olduğunuz T.C'ye ait çalışan silinmiştir...");
                            break;

                        }else{
                            System.out.println("Girmiş olduğunuz T.C'ye ait kişi bulunamamıştır.\nLütfen T.C'yi tekrar giriniz...");
                            break;
                        }
                    }
                    break;
                case '2':
                    System.out.println("Silmek istediğiniz müşterinin T.C kimlik numarasını giriniz...");
                    tcNoCal=input.next();
                    for (Musteri m:musteris){
                        if (m.getKimlikNo().equals(tcNoCal)){
                            musteris.remove(m);
                            System.out.println("Girmiş olduğunuz T.C'ye ait müşteri silinmiştir...");

                        }else{
                            System.out.println("Girmiş olduğunuz T.C'ye ait kişi bulunamamıştır.\nLütfen T.C'yi tekrar giriniz...");
                            remove();
                        }
                    }
                    break;
                case'0':
                    personIslemler();
                    break;
                case 'a':
                    showMenu();
                    break;
                case 'q':
                    System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                    break;
                default:
                    System.out.println("Geçerli bir giriş yapınız");
                    break;
            }
        } while (secim != 'q');

    }


    public static void listele() {
        char secim;
        do {
            System.out.println("Çalışan listelemek için : '1' e basınız");
            System.out.println("Müşteri listelemek için : '2' e basınız");
            System.out.println("Önceki menü için        : '0' a basınız");
            System.out.println("Ana menü için           : 'a' ya basınız");
            System.out.println("Çıkmak için             : 'q' ya basınız");
            secim=input.next().charAt(0);
            switch (secim) {
                case '1':
                    for (int i = 0; i < calisans.size(); i++) {
                        System.out.println("Ad soyad : " + calisans.get(i).getAdSoyad() +
                                " Kimlik No : " + calisans.get(i).getKimlikNo() +
                                " Cinsiyet : " + calisans.get(i).getCinsiyet() + " Yas : " + calisans.get(i).getYas() + " Email : "
                                + calisans.get(i).geteMail() + " Sicil No : " + calisans.get(i).getSicilNo() + " Maaş : " + calisans.get(i).getMaas() +
                                " Departman :  " + calisans.get(i).getDepatman());
                    }
                    break;
                case '2':
                    for (int i = 0; i < musteris.size(); i++) {
                        System.out.println("Ad soyad : " + musteris.get(i).getAdSoyad() +
                                " Kimlik No : " + musteris.get(i).getKimlikNo() +
                                " Cinsiyet : " + musteris.get(i).getCinsiyet() + " Yas : " + musteris.get(i).getYas() + " Email : "
                                + musteris.get(i).geteMail() + " Meslek : " + musteris.get(i).getMeslek() +
                                " Gelir : " + musteris.get(i).getGelir());
                    }
                    break;
                case'0':
                    personIslemler();
                    break;
                case 'a':
                    showMenu();
                    break;
                case 'q':
                    System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                    break;
                default:
                    System.out.println("Geçerli bir giriş yapınız");
                    break;
            }
        } while (secim != 'q');


    }

    public static void kisiGoster() {
        char secim ;
        do {
            System.out.println("Çalışanı görüntülemek için  : 'c' e basınız");
            System.out.println("Müşteriyi görüntülemek için : 'm' e basınız");
            System.out.println("Önceki menü için            : '0' a basınız");
            System.out.println("Ana menü için               : 'a' ya basınız");
            System.out.println("Çıkmak için                 : 'q' ya basınız");
            secim=input.next().charAt(0);
            switch (secim) {
                case 'c':
                    int sayac=0;
                    System.out.println("Görüntülemek istediğiniz çalışanın T.C kimlik numarasını giriniz...");
                    String tcNoCal=input.next();
//                    for (Calisan calisan:calisans) {
//                        if (calisan.getKimlikNo().equals(tcNoCal)){
//                            System.out.println(calisan.toString());
//                            break;
//                        }else if (sayac!=){
//                            System.out.println("Girmiş olduğunuz T.C'ye ait kişi bulunamamıştır.\nLütfen T.C'yi tekrar giriniz...");
//                        }


                    for (int i = 0; i < calisans.size(); i++) {

                        if (calisans.get(i).getKimlikNo().equals(tcNoCal)){
                            System.out.println("Girmiş olduğunuz T.C'ye ait çalışan aşağıda görüntülenmiştir...");

                             System.out.println("Ad soyad : " + calisans.get(i).getAdSoyad() +
                                    " Kimlik No : " + calisans.get(i).getKimlikNo() +
                                    " Cinsiyet : " + calisans.get(i).getCinsiyet() + " Yas : " + calisans.get(i).getYas() + " Email : "
                                    + calisans.get(i).geteMail() + " Sicil No : " + calisans.get(i).getSicilNo() + " Maaş : " + calisans.get(i).getMaas() +
                                    " Departman :  " + calisans.get(i).getDepatman());
                             sayac=0;
                             break;

                        }else if (sayac==calisans.size()-1){
                            System.out.println("Girmiş olduğunuz T.C'ye ait kişi bulunamamıştır.\nLütfen T.C'yi tekrar giriniz...");
                            break;
                        }
                        sayac++;

                    }
                    break;
                case 'm':
                    System.out.println("Görüntülemek istediğiniz müşterinin T.C kimlik numarasını giriniz...");
                    tcNoCal=input.next();
                    for (Musteri m:musteris){
                        if (m.getKimlikNo().equals(tcNoCal)){
                            System.out.println("Girmiş olduğunuz T.C'ye ait müşteri aşağıda görüntülenmiştir...");
                            System.out.println("Ad soyad : " + m.getAdSoyad() +
                                    " Kimlik No : " + m.getKimlikNo() +
                                    " Cinsiyet : " + m.getCinsiyet() + " Yas : " + m.getYas() + " Email : "
                                    + m.geteMail() + " Sicil No : " + " Meslek : " + m.getMeslek() + " Gelir : " + m.getGelir());
                            break;
                        }else{
                            System.out.println("Girmiş olduğunuz T.C'ye ait kişi bulunamamıştır.\nLütfen T.C'yi tekrar giriniz...");
                            kisiGoster();
                            break;
                        }
                    }
                    break;
                case'0':
                    personIslemler();
                    break;
                case 'a':
                    showMenu();
                    break;
                case 'q':
                    System.out.println("Tekrar giriş yapmak için yeniden başlatmalısınız");
                    break;
                default:
                    System.out.println("Geçerli bir giriş yapınız");
                    break;
            }
        } while (secim != 'q');
    }

}
