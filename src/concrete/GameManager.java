package concrete;

import Abstracts.GameService;
import entities.Gamer;

public class GameManager implements GameService {

    @Override
    public void sale(Gamer gamer) {
        System.out.println("oyunu satın alındın " +gamer.getAdı());
    }
}
