package org.aub.pattern.gof.behavioral.strategy;

public class Knigh extends Character{
    public Knigh() {
        weaponBehavior = new SwordBehavior();
    }
}
