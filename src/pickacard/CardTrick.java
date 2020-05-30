package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Fiaz Syed Date: May 28, 2020
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(c.randomSuit());

            magicHand[i] = c;

            System.out.println(magicHand[i].getValue());
            System.out.println(magicHand[i].getSuit());
        }

        /*insert code to ask the user for Card value and suit, create their card
        and search magicHand hereThen report the result here */
        System.out.println("\n" + "Searching for Lucky Card Instant Winner");
                  
        Card luckyCard = new Card();
        luckyCard.setValue(13);
        luckyCard.setSuit("Spades");

        boolean found = false;
        for (int z = 0; z < magicHand.length; z++) {
            if ( luckyCard.getValue() == magicHand[z].getValue()) {
                if ( luckyCard.getSuit().equalsIgnoreCase(magicHand[z].getSuit())) {
                    found = true;
                }
            }
        }
        if (found == true) {
            System.out.println("\n" + "Winner!");
        } else {
            System.out.println("\n" + "Not so lucky today");
        }
    }

}
