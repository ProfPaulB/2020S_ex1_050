package pickacard;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 *
 * @author Sukhpreet Kaur 28 May 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
       Card luckyCard= new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Hearts");
        
        int num1=luckyCard.getValue();
        String cardsuit= luckyCard.getSuit();

        Card[] magicHand = new Card[7];
               
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4 )]);

              if(num1==c.getValue() && cardsuit.equalsIgnoreCase(c.getSuit())){
        System.out.println("you have got a magic hand");}
        }
           
       
   

     
 
    }

}

