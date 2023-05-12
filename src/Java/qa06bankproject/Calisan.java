package Java.qa06bankproject;

public class Calisan extends Person {
    private String sicilNo;
    private int maas;
    private String depatman;

    public Calisan(String adSoyad, String kimlikNo, String cinsiyet, int yas, String eMail, String sicilNo, int maas, String depatman) {
        super(adSoyad, kimlikNo, cinsiyet, yas, eMail);
        this.sicilNo = sicilNo;
        this.maas = maas;
        this.depatman = depatman;
    }

    @Override
    public String toString() {
        return "Calisan{"  +
                "adSoyad='" + getAdSoyad() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", cinsiyet='" + getCinsiyet() + '\'' +
                ", yas=" + getYas() +
                ", eMail='" + geteMail() + '\'' +
                "sicilNo='" + sicilNo + '\'' +
                ", maas=" + maas +
                ", depatman='" + depatman + '\'' +
                '}';
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepatman() {
        return depatman;
    }

    public void setDepatman(String depatman) {
        this.depatman = depatman;
    }



}