package com.ironhack.model;

import com.ironhack.exceptions.ValueException;

public class Warrior extends Character {
    final static int STAMINA_MAX = 50;
    final static int STAMINA_MIN = 10;
    final static int STRENGTH_MAX = 10;
    final static int STRENGTH_MIN = 1;
    final static int HP_MAX = 200;
    final static int HP_MIN = 100;


    private int stamina;
    private int strength;

    public Warrior() {

    }

    public Warrior(String name, int hp, int stamina, int strength) throws ValueException {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);

    }

    public void setStamina(int stamina) throws ValueException {
        if (stamina < STAMINA_MIN || STAMINA_MAX < stamina)
            throw new ValueException("Stamina value error. Should be between "
                    + STAMINA_MIN + " and " + STAMINA_MAX);
        this.stamina = stamina;
    }

    public void setStrength(int strength) throws ValueException {
        if (strength < STRENGTH_MIN || STRENGTH_MAX < strength)
            throw new ValueException("Strength value error. Should be between "
                    + STRENGTH_MIN + " and " + STRENGTH_MAX);
        this.strength = strength;
    }

    @Override
    public void setHp(int hp) throws ValueException {
        if (hp < HP_MIN || HP_MAX < hp)
            throw new ValueException("Hp value error. Should be between " + HP_MIN + " and " + HP_MAX);
        super.setHp(hp);
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                "} " + super.toString();
    }

    @Override
    public void heavyAttack() {

    }

    @Override
    public void weakAttack() {

    }
}
