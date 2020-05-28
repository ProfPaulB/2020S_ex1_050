package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Parth Contractor 26th may 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

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
        String sut=sc.next();
        
        System.out.println("");
        
        int b=0;
        
        for (int i = 0; i < magicHand.length; i++) {
            
            if(magicHand[i].getValue()== val && (magicHand[i].getSuit().equals(sut)))
            {
                b++;
            }                   
                     
        } 
        
        if(b>0) {
            System.out.println("Congrats!! your guess is correct.");
        }
        
        else 
            System.out.println("Better Luck next time!! your guess is not correct.");
          
    }

}
