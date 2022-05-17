package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void newSquadObjectGetCreated_true() throws Exception{
        Squad squad = new Squad(9,"Winners","Academia");
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void size_getMaxSize() throws Exception{
        Squad squad = new Squad(9,"Winners","Academia");
        int sSize = 9;
        assertEquals(sSize, squad.getSize());
    }

    @Test
    public void cause_getSquadeCause() throws Exception{
        Squad squad = new Squad(9,"Winners","Academia");
        String sCause = "Academia";
        assertEquals(sCause, squad.getCause());
    }

    @Test
    public void name_getSquadeName() throws Exception{
        Squad squad = new Squad(9,"Winners","Academia");
        String sName = "Winners";
        assertEquals(sName, squad.getName());
    }
    @Test
    public void addhero_toSquadList_True() {
        Squad squad = new Squad(9,"Winners","Academia");
        Hero hero = new Hero("Messi",33,"Dribbler","Emotional");
        squad.addMyHero(hero);
        assertTrue(squad.getHeroes().contains(hero));
    }
    //
    @Test
    public void AllSquadesCorrectlyReturned_true(){
        Squad squad = new Squad(9,"Winners","Academia");
        Squad otherSquade = new Squad(9,"Winners","Academia");
        assertTrue(Squad.getInstances().contains(squad));
        assertTrue(Squad.getInstances().contains(otherSquade));
    }

    @Test
    public void clear_ClearAllempySquades() {
        Squad.clear();
        assertEquals(Squad.getInstances().size(), 0);
    }

    @Test
    public void getId_HeroInstantiatedWithAnId_1(){
        Squad.clear();
        Squad squad = new Squad(9,"Winners","Academia");
        assertEquals(1,squad.getId());
    }


}