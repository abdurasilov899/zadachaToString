package com.company;

public class Audiobook extends Kitep {
    protected  int pricebook;

    public int getPricebook() {
        return pricebook;
    }

    public  void setPricebook(int pricebook) {
        this.pricebook = pricebook;
    }

    @Override
    public String toString() {
        return  "Audiobook :" +
                "\n pricebook =" + pricebook +
                "\n namebook  =" + namebook  +
                "\n avtorbook =" + avtorbook +
                "\n page= " + page +
                " " ;
    }
}
