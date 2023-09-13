package com.ironhack.model;

import com.ironhack.exceptions.ValueException;

public class Warrior extends Character {
    final static int STAMINA_MAX = 50;
    final static int STAMINA_MIN = 10;
    final static int STRENGTH_MAX = 10;
    final static int STRENGTH_MIN = 1;


    private int stamina;
    private int strength;

    public Warrior() {
    }

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        try {
            setStamina(stamina);
            setStrength(strength);
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setStamina(int stamina) throws ValueException {
        if (stamina < STAMINA_MIN || STAMINA_MAX < stamina)
            throw new ValueException("Stamina value error. Should be between " + STAMINA_MIN + " and " + STAMINA_MAX);
        this.stamina = stamina;
    }

    public void setStrength(int strength) throws ValueException {
        if (strength < STRENGTH_MIN || STRENGTH_MAX < strength)
            throw new ValueException("Strength value error. Should be between " + STRENGTH_MIN + " and " + STRENGTH_MAX);
        this.strength = strength;
    }

    public int getStamina(){
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
}
