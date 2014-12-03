package org.aub.pattern.gof.behavioral.strategy;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Knife in action");
    }
}
