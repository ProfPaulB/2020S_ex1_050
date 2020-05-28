package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Amandeep Singh Walia 28 May 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }

        Scanner input = new Scanner(System.in);
        Card c = new Card();
        System.out.print("Enter a value for card(note that Ace = 1, Jack =11, Queen =12, King = 13) : ");
        int value = input.nextInt();
        c.setValue(value);
        System.out.print("Enter a suit for card(Clubs, Spades, Diamonds, Hearts) : ");
        String suit = input.next();
        c.setSuit(suit);
        int num = 0;
        for(int i = 0; i<magicHand.length; i++)
        {
            if(c.getValue()==magicHand[i].getValue() && c.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
            {
                num = 1;
            }
            //System.out.println(magicHand[i].getValue() + "  " + magicHand[i].getSuit());
        }
        if(num==1)
        {
            System.out.println("User’s card is in the magic hand of random cards.");
        } 
        else
        {
            System.out.println("User’s card is not in the magic hand of random cards.");
        }
    }

}
