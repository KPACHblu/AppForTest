package org.aub.pattern.gof.behavioral.strategy;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
