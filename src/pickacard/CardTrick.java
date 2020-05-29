package pickacard;

import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Tapasvi Patel
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card LuckyCard= new Card();
        LuckyCard.setValue(4);
        LuckyCard.setSuit(2);

        for (int i = 0; i < magicHand.length; i++) {
           // Card c = new Card();
            magicHand[i]=new Card();           
            magicHand[i].setValue((int) ((Math.random()*13)+1));//insert call to random number generator here)
            magicHand[i].setSuit((int) (Math.round(Math.random()*3))); //0-3      
            //System.out.println(magicHand[i].getSuit());
            //System.out.println(magicHand[i].getValue());
        } 
        
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Enter a Card value (1-13): ");
        int val=sc.nextInt();
        
        System.out.print("Enter a Suit (Clubs, Spades, Diamonds, Hsearts): ");
        String suit=sc.next();
        
        System.out.println("");
        
        int b=0;
        
        for (int i = 0; i < magicHand.length; i++) {
            
            if(magicHand[i].getValue()== val && (magicHand[i].getSuit().equals(suit)))
            {
                b++;
            }                   
                     
        }
       
        
        if(b>0) {
            System.out.println("Hurray!! Your Guess is Correct.");
        }
        
        else 
            System.out.println("Sorry :( Try Again.");
          
    }

}