package concrete;

import Abstracts.CompanyService;
import entities.Company;
import entities.Game;

public class CompanyManager implements CompanyService {
    Company company;
    @Override
    public void add(Game game) {
        System.out.println(" indirim yapıldı" );
    }

    @Override
    public void update(Game game) {

    }
}
