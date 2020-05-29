package pickacard;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Jeel Puranik 05/28/20 
 */
public class CardTrick {

    public static void main(String[] args) {
    
        Card[] magicHand = new Card[7];
        
        Card LuckyCard= new Card();
        
        LuckyCard.setValue(7);
        
        LuckyCard.setSuit(1);
        

        for (int i = 0; i < magicHand.length; i++) {
     
            magicHand[i]=new Card();     
            
            magicHand[i].setValue((int) ((Math.random()*13)+1)); 
            
            magicHand[i].setSuit((int) (Math.round(Math.random()*3)));
           
        } 
       
        int a=0;
      
         for (int i = 0; i < magicHand.length; i++) {
            
            if(magicHand[i].getValue()== LuckyCard.getValue() && (magicHand[i].getSuit().equals(LuckyCard.getSuit())))
            {
                a++;
            }                   
                     
        } 
        
        if(a>0) {
            System.out.println("WooHoo!! Your guess is correct.");
        }
        
        else {
            System.out.println("Opps!! Your guess is not correct.");
        }
          
    
    }
}
