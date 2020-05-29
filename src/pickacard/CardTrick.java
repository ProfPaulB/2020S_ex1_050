package pickacard;

import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @modified Vadim Andreev
 */
public class CardTrick {

    public static void main(String[] args) {
        
        //created cardValue and suit for user
        int userVal;
        String userSuit;
        boolean isFound = false;
        
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //enter random number generator
            c.setValue(c.randVal());
            //enter random number from 0-3
            c.setSuit(c.randSuit());
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Hello! Enter card value from 1-13: ");
        userVal = sc.nextInt();
        luckyCard.setValue(userVal);
        
        System.out.println("Now enter suit same \nClubs \nSpades \nDiamonds \nHearts");
        userSuit = sc.next();
        luckyCard.setSuit(userSuit);
        
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())){
                isFound = true;
            }
        }
        
        //Then report the result here
        if (isFound) 
            System.out.println("You found the card! Nice one!");
        else 
            System.out.println("ooh no! your card wasn't in the hand! Better luck next time");
    }

}
