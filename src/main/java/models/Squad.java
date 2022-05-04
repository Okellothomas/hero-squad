package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    // declaring the variables for Squad
    private int sSize_max;
    private String sName;
    private String sCause;
    private List<Hero> sHeros;
    private static List<Squad> sInstances = new ArrayList<>();
    private int sId;

    public Squad(int sSize_max, String sName, String sCause) {
        this.sSize_max = sSize_max;
        this.sName = sName;
        this.sCause = sCause;
        sInstances.add(this);
        this.sId = sInstances.size();
        this.sHeros = new ArrayList<Hero>();
    }

    public int getsSize_max() {
        return sSize_max;
    }

    public String getsName() {
        return sName;
    }

    public String getsCause() {
        return sCause;
    }

    public List<Hero> getsHeros() {
        return sHeros;
    }

    public static List<Squad> getsInstances() {
        return sInstances;
    }

    public int getsId() {
        return sId;
    }

    public static void clear(){
        sInstances.clear();
    }

    public static Squad findById(int sId){
        return sInstances.get(sId - 1);
    }

    public void addMyHero(Hero hero){
        sHeros.add(hero);
    }

}
