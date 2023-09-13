package com.ironhack.model;

public abstract class Character {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Character() {
        id = idCounter++;
    }

    public Character(String name, int hp) {
        this();
        this.name = name;
        this.hp = hp;
        isAlive = true;
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

    public void setHp(int hp) {
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
