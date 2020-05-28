package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) 
    {
        
        Card[] magicHand = new Card[7];
        int value;
        String suits;
        String result="";
       // int[] temp = new int[7];

        for (int i = 0; i < magicHand.length; i++)
        {
            magicHand[i]= new Card();
           // temp[i]= (int)(Math.random()*13);
            //Card c = new Card();
            //c.setValue((int)(Math.random()*13));//c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[(int)(Math.random()*4)]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i].setValue((int)(Math.random()*13));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter card value and Suit:");//insert code to ask the user for Card value and suit, create their card
        value = input.nextInt();
        suits = input.nextLine();
        
        for (int i = 0; i < magicHand.length; i++)               // and search magicHand here
        {
             if(magicHand[i].getValue()==value && magicHand[i].getSuit().equals(suits))
             {
                 result="You got the magic hand";
             }
             else
             {
                 result="You diidn't get the magic hand";
             }
            
        }

        System.out.println(result);//Then report the result here
    }

}
