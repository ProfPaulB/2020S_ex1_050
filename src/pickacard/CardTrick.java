package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. 
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Abhinav Girdhar
 * Date Modified - May 28, 2020.
 */

public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];    

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            // Generating Random Value between 1 & 13
            c.setValue((int)(1+Math.random()*13));
            
            //Generating Random Suit Array Index from 0 to 3
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            //Loading The Array
            magicHand[i]= c;
            

            
        }
        
        Scanner input = new Scanner(System.in);
        
        //Creating User's Card
        Card userCard = new Card();
        
        //Taking User Input
        System.out.println("Enter the card value");
        int value = input.nextInt();
        userCard.setValue(value);
        System.out.println("Enter the Suit Number -> 1.Hearts, 2.Diamonds, 3.Spades, 4.Clubs");
        int suitnum = input.nextInt();
        String suit = Card.SUITS[suitnum-1];
        userCard.setSuit(suit);
        
        String result= " ";
        
        // Searching in Magic Card
        for (int i = 0; i < magicHand.length; i++) {
           if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit() == userCard.getSuit())
           {
               result = "Congratulations, you won!";
           }
           else
           {
               result = "Sorry! Try Again!";
           }
            
        }
        
        //Reporting the result
        System.out.println(result);
        
    }

}
