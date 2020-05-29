package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Harmeek Singh Bhatti
 * Date May 28 2020
 */
public class CardTrick {

    public static void main(String[] args) {
         
        Card[] magicHand = new Card[7];    
        //Card c = new Card();
	Card luckyCard = new Card();
   
        Scanner input = new Scanner(System.in);
      
        for (int i = 0; i < magicHand.length; i++) {
            Card b = new Card();
            b.setValue((int)(1 + Math.random()*13));
            b.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            
            magicHand[i] = b;
        }
        
       
     //  System.out.println("Enter card: ");
     //  int card = input.nextInt();
     //  c.setValue(card);
        
        
        

        
      //  System.out.println("select one .Hearts 2.Diamonds 3.Spades 4.Clubs");
      //  int Number = input.nextInt();
      //  
      //  switch(Number)
      //  {
      //      case 1: c.setSuit(Card.SUITS[0]);  
      //            break;
      //      case 2: c.setSuit(Card.SUITS[1]);
      //            break;
      //      case 3: c.setSuit(Card.SUITS[2]);
      //           break;
      //      case 4: c.setSuit(Card.SUITS[3]);
      //           break;
      //  }
        
        
        
      luckyCard.setValue(7);
      luckyCard.setSuit(Card.SUITS[0]);
        
        String output = "Winner";
        
        for(int i = 0; i < magicHand.length; i++)
        {
            if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
            {
                output = "Winner";
            }
            else
            {
                output = "you lose";
            }
        }
        
        System.out.print(output);
           
    }
}


	  
