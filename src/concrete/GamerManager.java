package concrete;

import Abstracts.GamerService;
import Abstracts.ICheckServices;
import entities.Gamer;

public class GamerManager implements GamerService {
    ICheckServices iCheckServices;

    public GamerManager(ICheckServices iCheckServices) {
        super();
        this.iCheckServices = iCheckServices;
    }


    @Override
    public void add(Gamer gamer) {
        if (iCheckServices.check(gamer))
            System.out.println("sisteme eklendi " + gamer.getAdı());
        else System.out.println("sisteme eklenemedi");


    }

    @Override
    public void update(Gamer gamer) {

    }

    @Override
    public void delete(Gamer gamer) {

    }
}
