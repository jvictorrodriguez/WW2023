package com.ironhack.model;

import com.ironhack.exceptions.ValueException;

public class Wizard extends Character {
    final static int MANA_MAX= 50;
    final static int MANA_MIN=10;
    final static int INTELLIGENCE_MAX= 50;
    final static int INTELLIGENCE_MIN = 10;
    final static int HP_MAX = 100;
    final static int HP_MIN = 50;

    private int mana;
    private int intelligence;

    public Wizard() {

    }

    public Wizard(String name, int hp, int mana, int intelligence) throws ValueException {
        super(name, hp);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public void setMana(int mana) throws ValueException {
        if (mana<MANA_MIN || MANA_MAX< mana)
            throw new ValueException("Mana value error. Should be between "
                    + MANA_MIN + " and " + MANA_MAX);
        this.mana = mana;
    }

    public void setIntelligence(int intelligence) throws ValueException {
        if (intelligence<INTELLIGENCE_MIN || INTELLIGENCE_MAX< intelligence)
            throw new ValueException("Intelligence value error. Should be between "
                    + INTELLIGENCE_MIN + " and " + INTELLIGENCE_MAX);
        this.intelligence = intelligence;
    }

    @Override
    public void setHp(int hp) throws ValueException {
        if (hp < HP_MIN || HP_MAX < hp)
            throw new ValueException("Hp value error. Should be between " + HP_MIN + " and " + HP_MAX);
    }

    @Override
    public void heavyAttack() {

    }

    @Override
    public void weakAttack() {

    }
}
