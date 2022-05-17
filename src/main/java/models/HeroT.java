package models;

import java.util.ArrayList;
import java.util.List;

public class HeroT {

    private List<Hero> heroList = new ArrayList<>();

    public void  addHero(List<Hero> list,Hero hero){
        heroList= list;
        heroList.add(hero);
    }

    public List<Hero> getAllTask(){
        return heroList;
    }
}
