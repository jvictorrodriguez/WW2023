package com.ironhack.model;

import com.ironhack.exceptions.ValueException;

public abstract class Character implements Attacker{
    private static int idCounter = 1;
    private final int id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character() {
        id = idCounter++;
        isAlive=true;
    }

    public Character(String name, int hp) throws ValueException {
        this();
        this.name = name;
        setHp(hp);
    }

    public static void setIdCounter(int idCounter) {
        Character.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws ValueException {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}
