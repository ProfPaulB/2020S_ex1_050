package pickacard;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 *
 * @author Akashdeep Singh
 * Date-May 28,2020
 */
public class CardTrick {

    public static void main(String[] args) { //Start of the main method.
        
        Card[] magicHand = new Card[7];
        int cardValue; // Declaring inputs.
        String suit;

      
            Scanner input = new Scanner(System.in);
            /*
             Taking inputs from the user.
            Input section.
            */
            
            System.out.println("Enter your card number(1-13): ");
            cardValue = input.nextInt();
            System.out.println("Enter your suits(Hearts, Diamonds, Spades or clubs): ");
            suit = input.next();
            /*
            Displaying the result.
            Output section.
            */
            
          for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            if(cardValue==c.getValue() && suit.equalsIgnoreCase(c.getSuit()))
                System.out.println("You have got a magic hand");
            else
                System.out.println("You have n't got a magic hand");
                
                
          }
        
          }//End of the main method.
        
    }


