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
        int check = 0;                                 // check variable of type int for checking the match.
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));    //Setting random values of cards.
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]); //setting random suits of cards.
            tempValue[i] = c.getValue();               //Assigning the random values to temporary variable.
            tempSuit[i] = c.getSuit();                 //Assigning the random suits to temporary variable.
        }

        // Asking user for input of card(suit and value).
        System.out.println("Enter the suit of card (Hearts, Diamonds, Spades, Clubs)");
        String suit = n.nextLine();
        System.out.println("Enter the value of card ( Ace = 1, 2-10, Jack =11, Queen =12, King = 13)");
        int value = n.nextInt();

        //Searching the magic hand of 7 cards for user's card.
        for (int i = 0; i < magicHand.length; i++) {
            if ((value == tempValue[i]) && (suit.equalsIgnoreCase(tempSuit[i]))) {
                check = 1;
            }
        }

        //Displaying the result.
        if (check == 1) {
            System.out.printf("Congrats, your %d of %s card is found in magic hand of 7 cards.\n", value, suit);
        } else {
            System.out.printf("Sorry, your %d of %s card could not be found in magic hand of 7 cards\n", value, suit);
        }
        
        //Displaying the content of array.
        System.out.println("Magic hand of 7 cards:");
        for(int j=0; j<magicHand.length; j++)
        {
            System.out.println(tempValue[j]+" of "+tempSuit[j]);
        }

    }
}
