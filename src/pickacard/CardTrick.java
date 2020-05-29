package pickacard;

import java.util.*;     //importing util package

/**

* A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and

* searches the array of cards for the match to the user's card. To be used as starting code in ICE 1

*

* @author Karanvir Singh Date:2020/05/28

*/

public class CardTrick {

 

    /**

     * This is the main method and program starts here

     * @param args

     */

    public static void main(String[] args) {

       

        int c_Value;           

        

        int[] card_value=new int[7];

       

        String[] card_Suit=new String[7];

       

        String c_suit;

       

        String[] cSuit=new String[7];

              

        Card[] magicHand = new Card[7];

       

        Scanner ob=new Scanner(System.in);

            System.out.println("Enter your card number[1to13]");

            c_Value=ob.nextInt();                           

            System.out.println("Enter your suit(Hearts, Diamonds, Spades or Clubs): ");

            c_suit=ob.next();

        

            for (int i = 0; i < magicHand.length; i++) {              

            Card c = new Card();

            c.setValue((int)(1+Math.random()*13));

            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);

              

            card_value[i]=c.getValue();

            cSuit[i]=c.getSuit();

            }

           

            System.out.println("The seven generated magic cards are:"); 

            

            for (int i = 0; i < magicHand.length; i++)

                System.out.println(card_value[i]+" "+cSuit[i]);

           

            for (int i = 0; i < magicHand.length; i++){            

                if(c_Value==card_value[i] && c_suit.equalsIgnoreCase(cSuit[i])){

                System.out.println("You have got a magic hand");

                    break;

                }

                                 

            }

            

        }

}