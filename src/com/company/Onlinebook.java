package com.company;

public class Onlinebook extends Kitep {
    protected int pricekurs;

    public int getPricekurs() {
        return pricekurs;
    }

    public void setPricekurs(int pricekurs) {
        this.pricekurs = pricekurs;
    }

    @Override
    public String toString() {
        return "\n Onlinebook :" +
                "\n namebook=  " + namebook +
                "\n avtorbook=  " + avtorbook  +
                "\n page=  " + page +
                "\n pricekurs=  " + pricekurs +
                " " ;
    }
}
