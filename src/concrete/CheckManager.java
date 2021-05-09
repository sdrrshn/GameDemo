package concrete;

import Abstracts.ICheckServices;
import entities.Gamer;

public class CheckManager implements ICheckServices {


    @Override
    public boolean check(Gamer gamer) {
        return true;
    }
}
