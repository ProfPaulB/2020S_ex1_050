package pickacard;

import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Chirag Chirag 28 May 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        
        for(int i=0;i<magicHand.length; i++) {
            Card c=new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value for card:(spades,diamond,clubs,hearts):");
        int value = s.nextInt();
        System.out.print("Enter suit for card: ");
        String suit =s.next();
        int count=0;
       for(int i=0; i<magicHand.length; i++)
       {
           if(value==magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit()))
           {
               count=1;
           }    
            //System.out.println(magicHand[i].getValue() +" " +MagicHand[i].getSuit());
       }
       if(count==1)
       {
           System.out.println("Game won");
       }
       else{
           System.out.println("game loossed");
            }
    }
}