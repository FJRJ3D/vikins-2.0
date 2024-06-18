package org.example.soldier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    int strength = 150;
    int health = 300;

    Soldier soldier = new Soldier(health, strength);

    @Test
    public void should_receive_2_arguments() {
        assertNotNull(soldier);
    }

    @Test
    public void should_receive_the_health_property_as_its_1st_argument() {
        assertEquals(300, soldier.health);
    }

    @Test
    public void should_receive_the_strength_property_as_its_2st_argument() {
        assertEquals(150, soldier.strength);
    }

    @Test
    public void attack_should_receive_0_arguments() {
        int resultAttack = soldier.attack();
        assertEquals(this.strength, resultAttack);
    }

    @Test
    public void attack_should_return_a_integer() {
        int resultAttack = soldier.attack();
        assertEquals("Integer", ((Object) resultAttack).getClass().getSimpleName());
    }

    @Test
    public void attack_should_return_the_strength_property_of_the_Soldier() {
        int resultAttack = soldier.attack();
        assertEquals(150, resultAttack);
    }

    @Test
    public void damage_should_receive_1_arguments() {
        soldier.receiveDamage(20);
        assertEquals(280, soldier.health);
    }

    @Test
    public void should_remove_the_received_damage_from_the_health_property() {
        soldier.receiveDamage(30);
        assertEquals(270, soldier.health);
    }
}