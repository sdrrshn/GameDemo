package entities;

public class Game {
    String adı;

    public Game() {
    }

    public Game(String adı, int price) {
        super();
        this.adı = adı;
        this.price = price;
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;
}
