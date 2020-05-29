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
       
        int cardNo;      
        String suitCard;
       
        Card luckyCard=new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("Clubs");
       
        cardNo=luckyCard.getValue();
       
        suitCard=luckyCard.getSuit();
       
        Card[] magicHand = new Card[7];
       
        int[] value=new int[7];
       
        String[] cSuit=new String[7];
       
        for (int i = 0; i < magicHand.length; i++) {               //loop to generate 7 random cards
               Card c = new Card();
               c.setValue((int)(1+Math.random()*13));
               c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
               
               value[i]=c.getValue();
               cSuit[i]=c.getSuit();
            }
       
        System.out.println("The seven generated magic cards are:");  //displaying the genrated cards
           
        for (int i = 0; i < magicHand.length; i++)
                System.out.println(value[i]+" "+cSuit[i]);
       
        for (int i = 0; i < magicHand.length; i++){             //checking if user got the magic hand or not
                  if(cardNo==value[i] && suitCard.equalsIgnoreCase(cSuit[i])){
                        System.out.println("You have got a magic hand");
                        break;
                  }
                                 
            }
           

    }

}
