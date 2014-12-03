package org.aub.pattern.gof.behavioral.strategy;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
}
