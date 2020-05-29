package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Jatinderjit Singh Minhas May 28 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card user = new Card();

        // filling the array of type Card randomly.
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(1 + Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        
        /*
        Asking user to enter a value.
        then, storing it into the user object.
        */
        
        System.out.print("Enter the card value: ");
        int value = input.nextInt();
        user.setValue(value);
        System.out.println();
        
        
        
        /*
        Asking user to enter the suit number.
        then, storing the corresponding suit value into the user ojbect using a switch.
        */
        
        System.out.println("Choose Suit \n1.Hearts 2.Diamonds 3.Spades 4.Clubs");
        int suitNum = input.nextInt();
        
        switch(suitNum)
        {
            case 1: user.setSuit(Card.SUITS[0]);  
                      break;
            case 2: user.setSuit(Card.SUITS[1]);
                      break;
            case 3: user.setSuit(Card.SUITS[2]);
                      break;
            case 4: user.setSuit(Card.SUITS[3]);
                      break;
        }
        
        /*
        getting the result.
        result variable of String type is used to store the result message.
        for loop is used to check whether it's win or lose  and is used to add the corresponding message to result variable
        */
        
        String result = "Win";
        
        for(int i = 0; i < magicHand.length; i++)
        {
            if(magicHand[i].getValue() == user.getValue() && magicHand[i].getSuit().equalsIgnoreCase(user.getSuit()))
            {
                result = "++++WIN++++";
            }
            else
            {
                result = "you lose, Sorry try next time.";
            }
        }
        
        System.out.println("\n" + result); //Finally, displaying the results.
           
    }

}
