package adventure.game;

import org.junit.jupiter.api.Test;

class TestAdventureGame {

    @Test
    void useSword() {
        Character player = new King();
        String fight = player.fight();
        player.setWeapon(new SwordBehavior());
        String attack = player.weapon.useWeapon();
        System.out.printf("%s -> %s", fight, attack);
    }
}
