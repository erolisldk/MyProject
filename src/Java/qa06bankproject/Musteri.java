package Java.qa06bankproject;
public class Musteri extends Person {
    private String meslek;
    private int gelir;

    public Musteri(String adSoyad, String kimlikNo, String cinsiyet, int yas, String eMail, String meslek, int gelir) {
        super(adSoyad, kimlikNo, cinsiyet, yas, eMail);
        this.meslek = meslek;
        this.gelir = gelir;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "adSoyad='" + getAdSoyad() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", cinsiyet='" + getCinsiyet() + '\'' +
                ", yas=" + getYas() +
                ", eMail='" + geteMail() + '\'' +
                "meslek='" + meslek + '\'' +
                ", gelir=" + gelir +
                '}';
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getGelir() {
        return gelir;
    }

    public void setGelir(int gelir) {
        this.gelir = gelir;
    }

}
