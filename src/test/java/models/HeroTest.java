package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void newHeroObjectGetCreated_true() throws Exception{
        Hero hero = new Hero("Messi", 46, "Tribbler","eating");
        assertEquals(true, hero instanceof Hero);
    }
}