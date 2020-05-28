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
        Card luckycard =new Card();
        luckycard.setValue(5);
        luckycard.setSuit("Hearts");
        
        int num1;
        String suit1;
        num1=luckycard.getValue();
        suit1=luckycard.getSuit();
        Card[] magicHand = new Card[7];
        
         for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            if(num1==c.getValue() && suit1.equalsIgnoreCase(c.getSuit()))
                System.out.println("You have got a magic hand");
            else
                System.out.println("You have n't got a magic hand");
        
        
        
     /*   
        Card[] magicHand = new Card[7];
        int cardValue; // Declaring inputs.
        String suit;

      
            Scanner input = new Scanner(System.in);
           
            
            System.out.println("Enter your card number(1-13): ");
            cardValue = input.nextInt();
            System.out.println("Enter your suits(Hearts, Diamonds, Spades or clubs): ");
            suit = input.next();
           
            
          for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            if(cardValue==c.getValue() && suit.equalsIgnoreCase(c.getSuit()))
                System.out.println("You have got a magic hand");
            else
                System.out.println("You have n't got a magic hand");
              
                
                
          }*/
        
          }//End of the main method.
        
    }


