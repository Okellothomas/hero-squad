package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    // declaring the variables for Squad
    private String sSize;
    private String sName;
    private String sCause;
    private List<Hero> sHeros;
    private static List<Squad> sInstances = new ArrayList<>();
    private int sId;

    public Squad(String sSize, String sName, String sCause) {
        this.sSize = sSize;
        this.sName = sName;
        this.sCause = sCause;
        sInstances.add(this);
        this.sId = sInstances.size();
        this.sHeros = new ArrayList<Hero>();
    }

    public String getsSize() {
        return sSize;
    }

    public String getsName() {
        return sName;
    }

    public String getsCause() {
        return sCause;
    }


}
