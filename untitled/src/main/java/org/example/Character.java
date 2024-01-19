package org.example;

public class Character {

    private int strength;
    private int endurance;
    private int dexterity;
    private int agility;
    private int level;



    public Character(int strength, int endurance, int dexterity, int agility, int level) {

        this.strength = strength;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.agility = agility;
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }




}
