package pickacard;



import java.util.Random;
import java.util.Scanner;



/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Sehajdeep Kaur
 */
public class CardTrick {
    

    

   

  
    
    public static void main(String[] args) {
      
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
           
            c.setValue((int)(1+ Math.random()*12));
            c.setSuit((Card.SUITS[(int)Math.random()*3]));
             
        }
        Scanner input = new Scanner(System.in);
        int cardValue = 1;
        int suitvalue = 1;
        String suitName = null;
        
        System.out.println("Enter cardvalue");
        cardValue = input.nextInt();
        System.out.println("Enter suitvalue");
        suitvalue = input.nextInt();
             
            
            switch (suitvalue)
            {
                case 1:
                    suitName = "clubs";
                    break;
                case 2:
                    suitName = "hearts";
                    break;
                case 3:
                    suitName = "spades";
                    break;
                case 4:
                    suitName = "diamonds";
                    break;
                
            }
            System.out.println("User picked " +  cardValue  + " of " +  suitName);
            System.out.println();
           
         
           
            int[]  value = new int[7];
            String[] suit = new String[7];
         
            for (int i = 0; i < magicHand.length; i++) 
            {
                Card c = new Card();
            
            
            
                c.setValue((int)(1+ Math.random()*12));
                c.setSuit((Card.SUITS[(int)Math.random()*3]));
                value[i] =  c.getValue();
                suit[i]  =  c.getSuit(); 
            }
            for (int i = 0; i < suit.length ;i++)
            {
                
                System.out.println("Card value is " + value[i]);
                System.out.println(" Suit is " + suit[i]);
            }
             for (int i = 0; i < magicHand.length; i++) 
             {
                 if(value[i] == cardValue && suit[i] == suitName)
                 {
                     System.out.println("Yippe! You get a magic Card");
                 }
                     else
                 {
                     System.out.println("Oh no! You lost the magic Card");
                 }
                         
             }
       
    }
}