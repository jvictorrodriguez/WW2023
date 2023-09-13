package com.ironhack.model;

import com.ironhack.exceptions.ValueException;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class WizardTest {

    @Test
    void aCreateAWizard() {
        Wizard wizard1= new Wizard();
        Wizard wizard2= new Wizard();
        assertTrue(wizard1.isAlive());
        //wizard2 should have an id + 1 that wizard1
        assertEquals(wizard1.getId()+1,wizard2.getId());
    }

    @Test
    void createWizardCheckOverMaxValues() {
        Wizard wizard = new Wizard();
        assertThrows(ValueException.class, () -> wizard.setMana(Wizard.MANA_MAX+1));
        assertThrows(ValueException.class, () -> wizard.setIntelligence(Wizard.INTELLIGENCE_MAX+1));
        assertThrows(ValueException.class, () -> wizard.setHp(Warrior.HP_MAX + 1));
    }
    @Test
    void createWizardCheckUnderMinValues() {
        Wizard wizard = new Wizard();
        assertThrows(ValueException.class, () -> wizard.setMana(Wizard.MANA_MIN-1));
        assertThrows(ValueException.class, () -> wizard.setIntelligence(Wizard.INTELLIGENCE_MIN-1));
        assertThrows(ValueException.class, () -> wizard.setHp(Wizard.HP_MIN - 1));
    }
    @Test
    void createWizardCheckUnderNegativeValues() {
        Wizard wizard = new Wizard();
        assertThrows(ValueException.class, () -> wizard.setMana(-10));
        assertThrows(ValueException.class, () -> wizard.setIntelligence(-10));
        assertThrows(ValueException.class, () -> wizard.setHp(-10));
        System.out.println(wizard);
    }
}