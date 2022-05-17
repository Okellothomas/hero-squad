package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    // declaring the variables for Squad
    private int size;
    private String name;
    private String cause;
    private List<Hero> heroes;
    private static List<Squad> instances = new ArrayList<>();
    private int id;

    public Squad(int size, String name, String cause) {
        this.size = size;
        this.name = name;
        this.cause = cause;
        instances.add(this);
        this.id = instances.size();
        this.heroes = new ArrayList<Hero>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public static List<Squad> getInstances() {
        return instances;
    }

    public static void setInstances(List<Squad> instances) {
        Squad.instances = instances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void clear(){
        instances.clear();
    }

    public static Squad findById(int id){
        return instances.get(id - 1);
    }

    public void addMyHero(Hero hero){
        heroes.add(hero);
    }

    //    public Squad(int sSize_max, String sName, String sCause) {
//        this.sSize_max = sSize_max;
//        this.sName = sName;
//        this.sCause = sCause;
//        sInstances.add(this);
//        this.sId = sInstances.size();
//        this.sHeros = new ArrayList<Hero>();
//    }
//
//    public int getsSize_max() {
//        return sSize_max;
//    }
//
//    public String getsName() {
//        return sName;
//    }
//
//    public String getsCause() {
//        return sCause;
//    }
//
//    public List<Hero> getsHeros() {
//        return sHeros;
//    }
//
//    public static List<Squad> getsInstances() {
//        return sInstances;
//    }
//
//    public int getsId() {
//        return sId;
//    }
//
//    public static void clear(){
//        sInstances.clear();
//    }
//
//    public static Squad findById(int sId){
//        return sInstances.get(sId - 1);
//    }
//
//    public void addMyHero(Hero hero){
//        sHeros.add(hero);
//    }

}
