package models;

import java.util.ArrayList;
import java.util.List;

public class SquadT  {
   private List<Squad> squadList = new ArrayList<>();

   public void  addSquad(List<Squad> list,Squad squad){
       squadList = list;
       squadList.add(squad);
   }

   public List<Squad> getAllTask(){
       return squadList;
   }

}
