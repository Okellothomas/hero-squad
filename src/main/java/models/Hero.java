package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mName;
    private int mAge;
    private String mSpecialPower;
    private String mWeaknesses;
    private boolean created;
    private static List<Hero> mHeroes = new ArrayList<>();
    private int mId;

    public Hero(String mName, int mAge, String mSpecialPower, String mWeaknesses) {
        this.mName = mName;
        this.mAge = mAge;
        this.created = false;
        this.mSpecialPower = mSpecialPower;
        this.mWeaknesses = mWeaknesses;
        mHeroes.add(this);
        this.mId = mHeroes.size();
    }

    public String getmName() {
        return mName;
    }

    public int getmAge() {
        return mAge;
    }

    public String getmSpecialPower() {
        return mSpecialPower;
    }

    public String getmWeaknesses() {
        return mWeaknesses;
    }

    public static List<Hero> getmHeroes() {
        return mHeroes;
    }

    public int getmId() {
        return mId;
    }

    public static void clearAllHeros(){
        mHeroes.clear();
    }

    public boolean getPublished(){
        return this.created;
    }

    public static Hero findById(int mId){
        return mHeroes.get(mId - 1);
    }
}
