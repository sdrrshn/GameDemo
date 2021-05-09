package entities;

public class Gamer {
    String tc;
    String adı;
    String soyAdı;
    int dogumYılı;

    public Gamer(){}

    public Gamer(String tc, String adı, String soyAdı, int dogumYılı) {
        super();
        this.tc = tc;
        this.adı = adı;
        this.soyAdı = soyAdı;
        this.dogumYılı = dogumYılı;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public String getSoyAdı() {
        return soyAdı;
    }

    public void setSoyAdı(String soyAdı) {
        this.soyAdı = soyAdı;
    }

    public int getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(int dogumYılı) {
        this.dogumYılı = dogumYılı;
    }
}
