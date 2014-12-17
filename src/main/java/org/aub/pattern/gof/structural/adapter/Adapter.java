package org.aub.pattern.gof.structural.adapter;

public class Adapter implements NewFunctionality {
    private OldFunctionality oldFunctionality;

    public Adapter(OldFunctionality oldFunctionality) {
        this.oldFunctionality = oldFunctionality;
    }

    @Override
    public String getInfo() {
        return oldFunctionality.getDescription();
    }
}
