package com.ironhack.model;

import com.ironhack.exceptions.ValueException;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class WarriorTest {
    @Test
    void aCreateWarriorCheckAutoIncrement() throws ValueException {
        Warrior warrior1 = new Warrior("Warrior#1",100,10,10);
        Warrior warrior2 = new Warrior();
        assertTrue(warrior1.isAlive());
        assertEquals(1, warrior1.getId());
        assertEquals(2, warrior2.getId());
    }

    @Test
    void createWarriorCheckOverMaxValues() {
        Warrior warrior = new Warrior();
        assertThrows(ValueException.class, () -> warrior.setStamina(Warrior.STAMINA_MAX + 1));
        assertThrows(ValueException.class, () -> warrior.setStrength(Warrior.STRENGTH_MAX + 1));
        assertThrows(ValueException.class, () -> warrior.setHp(Warrior.HP_MAX + 1));
    }

    @Test
    void createWarriorCheckUnderMinValues() {
        Warrior warrior = new Warrior();
        assertThrows(ValueException.class, () -> warrior.setStamina(Warrior.STAMINA_MIN - 1));
        assertThrows(ValueException.class, () -> warrior.setStrength(Warrior.STRENGTH_MIN - 1));
        assertThrows(ValueException.class, () -> warrior.setHp(Warrior.HP_MIN - 1));
    }

    @Test
    void createWarriorCheckUnderNegativeValues() {
        Warrior warrior = new Warrior();
        assertThrows(ValueException.class, () -> warrior.setStamina(-10));
        assertThrows(ValueException.class, () -> warrior.setStrength(-10));
        assertThrows(ValueException.class, () -> warrior.setHp(-10));
        System.out.println(warrior);
    }



}