package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue(){
        // only return the value if the card is face up
        if(isFaceUp){
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() throws Exception{
        // only return the value if the card is face up
        if(isFaceUp){
            switch (value){
                case "A":
                    return 11;
                case "K":
                case "Q":
                case "J":
                case "10":
                    return 10;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                default:
                    throw new Exception("Invalid Value");

            }
        } else {
            return -1;
        }
    }

    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }
    public String toString(){
        return suit + " of " + value;
    }
}
