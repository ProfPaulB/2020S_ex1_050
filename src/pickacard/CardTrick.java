package pickacard;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Rahul Rahul date 28-05-2020
 */
public class CardTrick {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
     
           Card[] magicHand = new Card[7];
           
           for (int i=0; i<magicHand.length;i++){
               
               magicHand[i] = new Card();
               magicHand[i].setValue((int)((Math.random()*13)+1));
               magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
               
           }
           
           System.out.println("Enter any card number: ");
           int value = input.nextInt();
           System.out.println("Enter suit for card: ");
           String suit = input.next();
           int number = 0;
           for (int i=0; i<magicHand.length; i++)
           {
               if(value==magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuit()))
               {
                   number=1;
               }
             
               System.out.println(magicHand[i].getValue()+ " " + magicHand[i].getSuit());
            
           }
           if(number==1){
               System.out.println("you are a winner Hurray");
           }
           else{
               System.out.println("you are a loser ");
           }
          
    
           
        
       
      

        
        //insert code to ask the user for Card value and suit, create their card
        
        // and search magicHand here
        
        //Then report the result here
    


}
}