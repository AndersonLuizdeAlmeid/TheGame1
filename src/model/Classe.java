package model;

import model.Life;

public class Classe {
    private String name;
    private Life life;
    private Defense defense;

    public Classe(String name, Life life, Defense defense) {
        this.life = life;
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Life getLife() {
        return this.life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public Defense getDefense() {
        return this.defense;
    }

    public void setDefense(Defense defense) {
        this.defense = defense;
    }


}