package com.company;

public class Subclass {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected static String sclass(){
        return "LOVER";
    }

    @Override
    public String toString() {
        return (getName() +" "+ sclass());
    }
}
