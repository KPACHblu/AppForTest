package org.aub.pattern.gof.behavioral.strategy;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword in action");
    }
}
