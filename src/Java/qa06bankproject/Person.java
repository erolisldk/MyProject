package Java.qa06bankproject;

import java.util.List;

public class Person{

    private String adSoyad;
    private String kimlikNo;
    private String cinsiyet;
    private int yas;
    private String eMail;
    public Person(String adSoyad, String kimlikNo, String cinsiyet, int yas, String eMail) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.eMail = eMail;
    }
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {return yas;}

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {this.eMail = eMail;}

    @Override
    public String toString() {
        return "Person{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", yas=" + yas +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}