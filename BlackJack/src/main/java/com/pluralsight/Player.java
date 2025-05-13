package com.pluralsight;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }
    public void addCard(Card card){
        hand.add(card);

    }
    public int getHandValue() throws Exception {
        int value = 0;
        for(Card card: hand){
            value += card.getPointValue();
        }
        return value;

    }
    public String getName(){
        return name;
    }
    public String showHand(){
//        StringBuilder builder = new StringBuilder();
        for(Card card: hand){
//            builder.append(card.toString());
//            builder.append(" ");
        }
//        builder.append("Total: " + getHandValue());
        return hand.toString();
    }
}
