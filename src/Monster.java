
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enki
 */
public class Monster extends Character{
    int EXP;
    int cEXP;
    int ID;
    ArrayList<String> dropList = new ArrayList<>();

    public Monster(int ID, String name, int level ,int STR, int DEX, int AGI, int INT, int LUK, int VIT, int EXP, int cEXP) {
        super(name, level, STR, DEX, AGI, INT, LUK, VIT);
        this.EXP = EXP;
        this.cEXP = cEXP;
        this.ID = ID;
    }

    public int getEXP() {
        return EXP;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public ArrayList<String> getDropList() {
        return dropList;
    }

    public void setDropList(ArrayList<String> dropList) {
        this.dropList = dropList;
    }
    
    
    
    
    
    
}
