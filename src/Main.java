import concrete.CheckManager;
import concrete.CompanyManager;
import concrete.GameManager;
import concrete.GamerManager;
import entities.Company;
import entities.Game;
import entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        gamer.setTc("10033430576");
        gamer.setDogumYılı(2001);
        gamer.setAdı("sidar");
        gamer.setSoyAdı("şahin");
        GamerManager gamerManager=new GamerManager(new CheckManager());
        gamerManager.add(gamer);
        Game game = new Game();
        game.setAdı("csgo");
        game.setPrice(60);
        GameManager gameManager=new GameManager();
        gameManager.sale(gamer);
        Company company=new Company();
        company.setAdı("yaz indirimi");
        company.setAcıklama("%10 indirim");
        company.setIndirim(6);
        System.out.println(company.getIndirim());
        CompanyManager companyManager=new CompanyManager();
        companyManager.add(game);
    }
}
