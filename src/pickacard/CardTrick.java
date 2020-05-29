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
       
       Scanner input1 = new Scanner(System.in);
       System.out.println("Choose your suit: Spades Hearts Clubs Diamonds");
       String suit= input1.next();

       Scanner input2 = new Scanner(System.in);
       System.out.println("Choose a card number(1-13)");
       int num= input2.nextInt();

        Card[] magicHand = new Card[7];
               
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4 )]);

              if(num==c.getValue() && suit.equalsIgnoreCase(c.getSuit())){
        System.out.println("you have got a magic hand");}
        }
           
       
   

     
 
    }

}

