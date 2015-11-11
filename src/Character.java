/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enki
 */
public class Character {
    
    private String name;
    private int level;
    private int STR;
    private int DEX;
    private int AGI;
    private int INT;
    private int LUK;
    private int VIT;
    
    private int MAXHP;
    private int MAXSP;
    
    private double wATK = 0;
    private double wDEF = 0;
    private double ATK;
    private double DEF;
    private double CRIT;

    public Character(String name,int level, int STR, int DEX, int AGI, int INT, int LUK, int VIT) {
        this.name = name;
        this.level = level;
        this.STR = STR;
        this.DEX = DEX;
        this.AGI = AGI;
        this.INT = INT;
        this.LUK = LUK;
        this.VIT = VIT;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getAGI() {
        return AGI;
    }

    public void setAGI(int AGI) {
        this.AGI = AGI;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getLUK() {
        return LUK;
    }

    public void setLUK(int LUK) {
        this.LUK = LUK;
    }

    public int getVIT() {
        return VIT;
    }

    public void setVIT(int VIT) {
        this.VIT = VIT;
    }

    public int getMAXHP() {
        return MAXHP;
    }

    public void setMAXHP(int MAXHP) {
        this.MAXHP = MAXHP;
    }

    public int getMAXSP() {
        return MAXSP;
    }

    public void setMAXSP(int MAXSP) {
        this.MAXSP = MAXSP;
    }

    public double getwATK() {
        return wATK;
    }

    public void setwATK(double wATK) {
        this.wATK = wATK;
    }

    public double getwDEF() {
        return wDEF;
    }

    public void setwDEF(double wDEF) {
        this.wDEF = wDEF;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public double getCRIT() {
        return CRIT;
    }

    public void setCRIT(double CRIT) {
        this.CRIT = CRIT;
    }
    
    
    
}
