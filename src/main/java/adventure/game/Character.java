package adventure.game;

abstract class Character {
    WeaponBehavior weapon;
    abstract String fight();

    void setWeapon(WeaponBehavior wb) {
        weapon = wb;
    }
}
