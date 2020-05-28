package pickacard;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import static javax.management.Query.value;
import static pickacard.Card.SUITS;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Hy Ngo
 */
public class CardTrick {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        String[] store = new String[7];
        Random rdnumber = new Random();
        
        int number;
        int Low = 1;
        int High = 13;
        Vector b = new Vector();
      for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
                
          
             number = rdnumber.nextInt(13);
           c.setValue(number);
           c.getValue();
           int d = rdnumber.nextInt(4);
          c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue()+ c.getSuit();
    
          /* if(!b.contains(number)){
             i++;
               b.add(number); 
              
               int d = rdnumber.nextInt(3);
               //c.setValue(insert call to random number generator here)
               c.setValue(number);
               //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
               c.setSuit(Card.SUITS[d]);
               
           
                   
           }*/
      }
       System.out.println("enter Card Number: ");
        String cardnumber  = input.nextLine();
        System.out.println("enter SUITS of Card: ");
         String SUITS  = input.nextLine();
        String results = cardnumber+SUITS;
        
        for (int u = 0; u < magicHand.length;u++){
            String o =  store[u];
                if(o.equals(results)){
                             System.out.println("correctS" ); 

                }
        }
          System.out.println("magic hand is:");
              for (int qu = 0; qu < magicHand.length;qu++){
           System.out.println(store[qu] ); 
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        // and search magicHand here
        
        //Then report the result here
    

}
}
