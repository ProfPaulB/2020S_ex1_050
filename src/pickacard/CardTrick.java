package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. 
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Abhinav Girdhar
 * Date Modified - May 28, 2020.
 */

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];    

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            // Generating Random Value between 1 & 13
            c.setValue((int)(1+Math.random()*13));
            
            //Generating Random Suit Array Index from 0 to 3
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            //Loading The Array
            magicHand[i]= c;
            
            /* 
            Printing Generated Cards for Debugging
            System.out.println("Value = " + c.getValue() + " Suit = " + c.getSuit());
            */
            
        }
        
        String result= " ";
        
        //Creating Hard-coded object
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        
        //Searching hard-coded object in Magic Hand
        for (int i = 0; i < magicHand.length; i++) {
           if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit() == luckyCard.getSuit())
           {
               result = "Congratulations, you won!";
           }
           else
           {
               result = "Sorry! Try Again!";
           }
            
        }
        
        //Reporting the result
        System.out.println(result);
               
    }

}
