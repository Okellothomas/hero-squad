package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHeroObjectGetCreated_true() throws Exception{
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        assertEquals(true, hero instanceof Hero);
    }
    @Test
    public void getmName_myHeoresName_String(){
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        String mName = "Messi";
        assertEquals("Messi", hero.getName());
    }

    @Test
    public void getmAge_myHeoresAge_Int(){
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        int mAge = 46;
        assertEquals(46, hero.getAge());
    }
    @Test
    public void getmSpecialPower_myHeoresName_String(){
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        String mSpecialpower = "Tribbler";
        assertEquals(mSpecialpower, hero.getPower());
    }

    @Test
    public void getmWeaknesses_myHeoresWeaknesses_String(){
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        String mWeaknesses = "eating";
        assertEquals(mWeaknesses, hero.getWeakness());
    }

    @Test
    public void getPublished_createdHeroPublished_false(){
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        assertEquals(false, hero.getPublished());
    }

    @Test
    public void getId_HeroInstantiatedWithAnId_1(){
        Hero.clearAllHeros();
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        assertEquals(1,hero.getId());
    }
}