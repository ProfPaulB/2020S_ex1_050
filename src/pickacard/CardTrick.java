package pickacard;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Ayush Narang
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        Boolean flag = false;
        
       Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
           c.setValue(rnd.nextInt(13-1+1)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the card number.(1-13)");
        int cardNum = scn.nextInt();
        System.out.println("Enter the card suit number. \nHearts \t         0 \nDiamonds \t  1 \nSpades \t         2 \nClubs \t         3");
        
        int cardSuit = scn.nextInt();
        Card userChoice = new Card(Card.SUITS[cardSuit],cardNum);
        // and search magicHand hereCard 
        System.out.print("Your Card:" + userChoice.getValue() + " ");
            System.out.println(userChoice.getSuit());
            System.out.println("Magic Hand: ");
        for (int i = 0; i < magicHand.length; i++) {
            
            System.out.print(magicHand[i].getValue() + " ");
            System.out.println(magicHand[i].getSuit());
            if(magicHand[i].getValue() == userChoice.getValue() && magicHand[i].getSuit() == userChoice.getSuit()  ){
                flag = true;
                break;
            }
        }
        //Then report the result here
        if (flag) {
            System.out.println("Congratulations! You guessed one of the MagicHands Right.");
        }
        else    {
            System.out.println("Better Luck Next Time.");
        }
    }

}