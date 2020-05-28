package pickacard;
import java.util.*;     //importing util package
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Malkit Singh Date:2020/05/27
 */
public class CardTrick {

    /**
     * This is the main method and program starts here
     * @param args 
     */
    public static void main(String[] args) {
        
        int card_Value,temp;            //initializing variables
        
        String suit;
        
        char play='y';
        
        Card[] magicHand = new Card[7];
        
        Scanner object=new Scanner(System.in);
        while(play=='y' || play=='Y'){
            temp=0;
            System.out.println("Enter your card number(1-13): ");
            card_Value=object.nextInt();                            //taking user input
            System.out.println("Enter your suit(Hearts, Diamonds, Spades or Clubs): ");
            suit=object.next();
         
            for (int i = 0; i < magicHand.length; i++) {                //loop to compare the user input with the magicHand array
               Card c = new Card();
               c.setValue((int)(1+Math.random()*13));
               c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
               if(card_Value==c.getValue() && suit.equalsIgnoreCase(c.getSuit())){
                  System.out.println("You have got a magic hand");
                  temp=1;
                  break;
            }
                                  
            }
            if(temp==0)
                System.out.println("You didn't get the magic hand");
            
            System.out.println("You want to play again?(Y or N)");
            play=object.next().charAt(0);
        }

    }

}
