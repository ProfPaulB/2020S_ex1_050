package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card.
 *
 * @author Daljeet Singh 28 May 2020
 * @version 1.0
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        int[] tempValue = new int[7];                  // temporary variable for holding the values(int) of different cards.
        String[] tempSuit = new String[7];             // temporary variable for holding the suit(String) of different cards.
        int check = 0;                                 // int variable for checking the match.
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));    
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]); 
            tempValue[i] = c.getValue();               
            tempSuit[i] = c.getSuit();
        }

        // Asking user for input of card.
        System.out.println("Enter the suit of card  (Hearts, Diamonds, Spades, Clubs)");
        String suit = n.nextLine();
        System.out.println("Enter the value of card ( Ace = 1, 2-10, Jack =11, Queen =12, King = 13)");
        int value = n.nextInt();               
        
        //Searching the magic hand of 7 cards for user's card.
        for (int i = 0; i < magicHand.length; i++) {     
            if ((value == tempValue[i]) && (suit.equals(tempSuit[i]))) {
                check = 1;
            }
        }
        
        //Displaying the result.
        if (check == 1) {
            System.out.printf("Congrats, your %d of %s card is found in magic hand of 7 cards.\n", value, suit);
        } else {
            System.out.printf("Sorry, your %d of %s card could not be found in magic hand of 7 cards\n", value, suit);
        }

    }
}
