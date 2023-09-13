package com.ironhack.model;

import com.ironhack.exceptions.ValueException;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import com.ironhack.model.Warrior;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class WarriorTest {
    @Test
    void aCreateWarriorCheckAutoIncrement() {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();
        assertEquals(1, warrior1.getId());
        assertEquals(2, warrior2.getId());
    }

    @Test
    void createWarriorCheckOverMaxValues() {
        Warrior warrior = new Warrior();
        assertThrows(ValueException.class, () -> warrior.setStamina(Warrior.STAMINA_MAX+1));

    }
    @Test
    void createWarriorCheckUnderMinValues() {
        Warrior warrior = new Warrior();
        assertThrows(ValueException.class, () -> warrior.setStamina(Warrior.STAMINA_MIN-1));
    }

    @Test
    void createWarriorCheckCorrectValues() {
        Warrior warrior = new Warrior();
        int stamina=25;
//        assertDoesNotThrow(()-> new Warrior());
        assertDoesNotThrow(()-> warrior.setStamina(stamina));
    }


}