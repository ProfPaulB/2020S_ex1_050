package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Vali Mohammad
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        Card[] magicHand = new Card[7];

        int[] temp = new int[7];
        String[] temp1 = new String[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue((int) (Math.random() * 13));
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);

            //System.out.println(c.getValue());
            //System.out.println(c.getSuit());
            temp[i] = c.getValue();
            temp1[i] = c.getSuit();
        }

        System.out.println("enter value of card from 1 to 13");

        int value = input.nextInt();                //inserted code to ask the user for Card value and suit, create their card
        System.out.println("enter suit Hearts, Spades, Diamonds, Clubs (case sensitive)");
        String suit = input.next();                          // and searched magicHand here

        for (int i = 0; i < magicHand.length; i++) {      //Results
            if ((value == temp[i]) && (suit.equals(temp1[i]))) {
                System.out.println("YOU WON");
            } else {
                System.out.println("YOU lose");
            }

        }
    }

}
