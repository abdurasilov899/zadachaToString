package com.company;

public class Main {

    public static void main(String[] args) {
        Kitep kitep = new Kitep();
//        kitep.setNamebook("Arstan ");
//        kitep.setAvtorbook("Dastan Meerinbaev ");
//         kitep.setPage(124);
//        System.out.println(kitep.toString());
        Audiobook audiobook =new Audiobook();
        audiobook.setNamebook("Arstan ");
        audiobook.setAvtorbook("Dastan Meerinbaev ");
        audiobook.setPage(124);
        audiobook.setPricebook(250);
        System.out.println(audiobook.toString());

        Onlinebook onlinebook = new Onlinebook();
        onlinebook.setNamebook("Kocho ");
        onlinebook.setAvtorbook("Sanjar Meerinbaev ");
        onlinebook.setPage(210);
        onlinebook.setPricekurs(250);
        onlinebook.setPricekurs(2500);
        System.out.println(onlinebook.toString());

        Subclass subscription = new Subclass();
        subscription.setName("PLOV ");
        System.out.println(subscription.toString());
    }
}
