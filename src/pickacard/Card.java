package pickacard;
import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.

 * @author Fiaz Syed
 * Date: May 28, 2020
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    //insert two methods to generate random value and suit
   public int randomValue(){
       Random r = new Random();
       int x = r.nextInt(13)+1;
       return x;
   }
    //second method for suit
    public String randomSuit(){
        Random s = new Random();
        int y = s.nextInt(3);
        return SUITS[y];
    }

}
