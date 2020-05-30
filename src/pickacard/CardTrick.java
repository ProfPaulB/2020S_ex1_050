package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Yash Patel 28th May
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card LuckyCard = new Card();
        LuckyCard.setValue(1);
        LuckyCard.setSuit("Hearts");
       // int value;
        //String suit;
        String output = "";

        for (int i = 0; i < magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue((int)(Math.random() *13));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //   Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.println("Value = " +magicHand[i].getValue() + "Suit = "+magicHand[i].getSuit() );
            /*;Addded this line cause can't figure out if my code is right or worng 
              and it turns out to be wrong and cant really figure out why.
            UPDATE_ figured out the mistake and fixed.
            */
        }
     //insert code to ask the user for Card value and suit, create their card   
     //Scanner input = new Scanner(System.in);
        
     //System.out.println("Enter your card and suit");
       // value = input.nextInt();
        //suit = input.nextLine();
        
        
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
        //if(magicHand[i].getValue()==value && magicHand[i].getSuit().equals(suit))
          if(magicHand[i].getValue()==LuckyCard.getValue() && magicHand[i].getSuit().equals(LuckyCard.getSuit()))
          {
                output = "Congrats It Matched";
            }
          else 
          {
                output ="Better Luck Next Time";
            }
        } //Then report the result here
       System.out.println(output);
    }

}
