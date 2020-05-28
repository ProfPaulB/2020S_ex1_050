package pickacard;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import static javax.management.Query.value;
import static pickacard.Card.SUITS;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Hy Ngo
 */
public class CardTrick {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        String[] store = new String[7];
        Random rdnumber = new Random();
        
        int number;
        int Low = 1;
        int High = 13;
       
        int luckn=0;
        String suitn;
        
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Hearts");
         luckn= luckyCard.getValue();
         suitn = luckyCard.getSuit();
        String luckynumber = luckn + suitn;
        //this one is automatic find Lucky card 
          for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
                   
             number = rdnumber.nextInt(13);
           c.setValue(number);
           c.getValue();
           int d = rdnumber.nextInt(4);
          c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue()+ c.getSuit();
       if(  luckynumber.equals(store[i])){
           System.out.println("correct");}
       else
          System.out.println("not correct");
          }
      
          
//  This is code for magic hand pick random card and searching
       
    /*  for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
                
          
             number = rdnumber.nextInt(13);
           c.setValue(number);
           c.getValue();
           int d = rdnumber.nextInt(4);
          c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue()+ c.getSuit();
    

      }
       System.out.println("enter Card Number: ");
        String cardnumber  = input.nextLine();
        System.out.println("enter SUITS of Card: ");
         String SUITS  = input.nextLine();
        String results = cardnumber+SUITS;
        
        for (int u = 0; u < magicHand.length;u++){
            String o =  store[u];
                if(o.equals(results)){
                             System.out.println("correctS" ); 

                }
        }
          System.out.println("magic hand is:");
              for (int qu = 0; qu < magicHand.length;qu++){
           System.out.println(store[qu] ); 
        }*/
        
        //insert code to ask the user for Card value and suit, create their card
        
        // and search magicHand here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Pick a card number: ");
        int cardNumber= in.nextInt();
        System.out.println("Pick a suit: ");
        String suit= in.next();
        
        String result= cardNumber+suit;
        
        boolean search= false;
        /*for (int i = 0; i < magicHand.length; i++){
            if(result == magicHand[i]){{
                search = true;
                System.out.println("You're card is matches a chard in the Magic hand!");
            }
        }*/
        for (int u = 0; u < magicHand.length;u++){
            String o =  store[u];
                if(o.equals(result)){
                             System.out.println("correctS" ); 

                }
        }
        
            if (!search){
                System.out.println("Your card is not in the Magic hand.");
            }
        
        //Then report the result here
    System.out.println("magic hand is:");
              for (int qu = 0; qu < magicHand.length;qu++){
           System.out.println(store[qu] ); 
        }


}
}
