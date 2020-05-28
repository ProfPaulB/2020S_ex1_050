package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * searches the array of cards for the match to lucky card.
 *
 * @author Daljeet Singh 28 May 2020
 * @version 2.0
 */
public class CardTrick {

    public static void main(String[] args) {
      
        Card[] magicHand = new Card[7];
        int[] tempValue = new int[7];                  // temporary variable for holding the values(int) of different cards.
        String[] tempSuit = new String[7];             // temporary variable for holding the suit(String) of different cards.
        int check = 0;                                 // check variable of type int for checking the match.
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (1 + Math.random()*13));    //Setting random values of cards.
            c.setSuit(Card.SUITS[(int) (Math.random()*4)]);//setting random suits of cards.
            tempValue[i] = c.getValue();               //Assigning the random values to temporary variable.
            tempSuit[i] = c.getSuit();                 //Assigning the random suits to temporary variable.
        }
        
        //luckyCard to replace the user input.
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");

        //Searching the magic hand of 7 cards for user's card.
        for (int i = 0; i < magicHand.length; i++) {
            if ( (luckyCard.getValue() == tempValue[i]) && (luckyCard.getSuit().equalsIgnoreCase(tempSuit[i])) ) {
                check = 1;
            }
        }

        //Displaying the result.
        if (check == 1) {
            System.out.printf("Congrats, your %d of %s card is found in magic hand of 7 cards.\n", luckyCard.getValue(), luckyCard.getSuit());
        } else {
            System.out.printf("Sorry, your %d of %s card could not be found in magic hand of 7 cards\n", luckyCard.getValue(), luckyCard.getSuit());
        }
        
        //Displaying the content of array.
        System.out.println("Magic hand of 7 cards:");
        for(int j=0; j<magicHand.length; j++)
        {
            System.out.println(tempValue[j]+" of "+tempSuit[j]);
        }
    }
}
