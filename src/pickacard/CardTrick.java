package pickacard;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. 
 *
 * @author Kunal Kumar  May 28, 2020.
 */

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];    

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            /*Random Value*/
            c.setValue((int)(Math.random()*13+1));
            /*Random Suit Array*/
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]= c;
            
            /* 
            Generated Cards
            System.out.println("Value = " + c.getValue() + " Suit = " + c.getSuit());
            */
            
        }
        
        Card u = new Card();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your suit: Spades Hearts Clubs Diamonds");
        String suit= in.next();
        System.out.println("Choose a card number(1-13)");
        int number= in.nextInt();
        String result= "";
        
      
       
        for (int i = 0; i < magicHand.length; i++) {
           if (magicHand[i].getValue() == number && magicHand[i].getSuit().equalsIgnoreCase(suit))
           {
               result = "Winner";
           }
           else
           {
               result = "Sorry, You Lose";
           }
            
        }
        
        //Reporting the result
        System.out.println(result);
               
    }

}
