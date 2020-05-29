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
 * @author dancye
 * @author Paul Bonenfant
 * @author Abhinav Garg
 * Date - 28 May 2020
 */
public class CardTrick {
    
    /**
     * This is the main method and program starts here
     */

    public static void main(String[] args) {
        
        
        Card luckyCard=new Card();
        
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        
        int value1  = luckyCard.getValue();
        String suit1 = luckyCard.getSuit();
        
        
        Card[] magicHand = new Card[7];                 //     Creating array of object of Class Card
        
        int[] value2 = new int[7];
        
        String[] suit2 = new String[7];
        
        
        for (int i = 0; i < magicHand.length; i++)       // This loop is to pick random numbers and to assign them
        {
            
            Card card = new Card();
            
            card.setValue((int)(1 + Math.random()*13));
            card.setSuit((Card.SUITS)[(int)Math.random()*4]);
            
            value2[i] = card.getValue();
            suit2[i] = card.getSuit();
            
        }
    
        
        for (int i = 0; i < magicHand.length; i++)
        {
            System.out.println(value2[i]+" "+suit2[i]);         // This is println statement to print the values
        }                                                       //  and suits
        
        
        for (int i = 0; i<magicHand.length; i++)                      
        {                                                                    // This loop helps find whether you goy magic hand or not
                                                                           
            if (value1 == value2[i] && suit1.equalsIgnoreCase(suit2[i])) 
            {
                System.out.println("You got a magic hand");             
            }
            
            else
            {
                System.out.println("You haven't get a magic hand");
            }
           
        }
       
    }
                     
}
