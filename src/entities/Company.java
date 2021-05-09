package entities;

public class Company {
    String adı;
    String acıklama;
    double indirim;

    public Company() {
    }

    public Company(String adı, String acıklama, double indirim) {
        super();
        this.adı = adı;
        this.acıklama = acıklama;
        this.indirim = indirim;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public double getIndirim() {
        return indirim;
    }

    public void setIndirim(double indirim) {
        this.indirim = indirim;
    }
}
