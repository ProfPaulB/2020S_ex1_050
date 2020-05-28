package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Vali Mohammad
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        Card[] magicHand = new Card[7];

        int[] temp = new int[7];         //temporary arrays
        String[] temp1 = new String[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue((int) (Math.random() * 13));          //setting values to card
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]); //setting suit

            //System.out.println(c.getValue());
            //System.out.println(c.getSuit());
            
            /*filling temporary arrays*/
            temp[i] = c.getValue(); 
            temp1[i] = c.getSuit();
        }
        //stoped asking user for input
 
       /* System.out.println("enter value of card from 1 to 13");

        int value = input.nextInt();                //inserted code to ask the user for Card value and suit, create their card
        System.out.println("enter suit Hearts, Spades, Diamonds, Clubs (case sensitive)");
        String suit = input.next();                          // and searched magicHand here*/
        
        Card luckyCard=new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Clubs");
        /*results*/
        for (int i = 0; i < magicHand.length; i++) {                
            if ((luckyCard.getValue() == temp[i]) && (luckyCard.getSuit().equals(temp1[i]))) {  //editted to compare with lucky Card object
                System.out.println("YOU WON!!!!!!!!!!!!!!");
            } else {
                System.out.println("YOU lose.....:[[[");
            }

        }
    }

}
