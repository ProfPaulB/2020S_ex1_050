package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        
        //Random number generator
        Random gen = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(gen.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[gen.nextInt(4)]);
            //add card to hand
            magicHand[i] = c;
        }

        Scanner keyboard = new Scanner(System.in);
        //insert code to ask the user for Card value and suit, create their card
       /* System.out.println("Enter predicted card value:");
        int inputValue = keyboard.nextInt();
        System.out.println("Enter predicted suit:");
        String inputSuit = keyboard.next();
        boolean isFound = false;*/
        //add luck card for search
       int inputValue = 7;
       int inputSuit = "Clubs";
        // and search magicHand here
        for(Card c: magicHand){
          
            if(c.getValue() == inputValue){
                if(c.getSuit().equals(inputSuit)){
                    isFound = true;
                }
            }
        }
        //Then report the result here
        if(isFound)
            System.out.println("Card found in magic hand.");
        else
            System.out.println("Card not found.");
    }

}
