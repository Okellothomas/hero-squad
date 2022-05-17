package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private boolean created;
    private static List<Hero> heroes = new ArrayList<>();
    private int id;

    public Hero(String name, int age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.created = false;
        heroes.add(this);
        this.id = heroes.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public static List<Hero> getHeroes() {
        return heroes;
    }

    public static void setHeroes(List<Hero> heroes) {
        Hero.heroes = heroes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Hero findById(int id){
        return heroes.get(id - 1);
    }

        public static void clearAllHeros(){
        heroes.clear();
    }

    public boolean getPublished(){
        return this.created;
    }


    //    public Hero(String mName, int mAge, String mSpecialPower, String mWeaknesses) {
//        this.mName = mName;
//        this.mAge = mAge;
//        this.created = false;
//        this.mSpecialPower = mSpecialPower;
//        this.mWeaknesses = mWeaknesses;
//        mHeroes.add(this);
//        this.mId = mHeroes.size();
//    }
//
//    public String getmName() {
//        return mName;
//    }
//
//    public int getmAge() {
//        return mAge;
//    }
//
//    public String getmSpecialPower() {
//        return mSpecialPower;
//    }
//
//    public String getmWeaknesses() {
//        return mWeaknesses;
//    }
//
//    public static List<Hero> getmHeroes() {
//        return mHeroes;
//    }
//
//    public int getmId() {
//        return mId;
//    }
//
//    public static void clearAllHeros(){
//        mHeroes.clear();
//    }
//
//    public boolean getPublished(){
//        return this.created;
//    }
//
//    public static Hero findById(int mId){
//        return mHeroes.get(mId - 1);
//    }
}
