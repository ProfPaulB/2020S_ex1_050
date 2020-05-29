package pickacard;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Manveer Singh
 * Date 28 may 2020
 */
public class CardTrick {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        String[] store = new String[7];
        Random rdnumber = new Random();
        int number;
          for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
                   
             number = 1+rdnumber.nextInt(12);
           c.setValue(number);
           c.getValue();
           int d = rdnumber.nextInt(3);
          c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue()+ c.getSuit();
      //  System.out.println(store[i]); // to check the generated card;
          }
         
     
       
   
        System.out.println("Magic hand card game");
        System.out.println("What will be the number of the card? Choose from 1-13");
        int usernumber= input.nextInt();
        System.out.println("What will be the suit of the card- Diamonds,Spades,Clubs or Hearts?");
        String usersuit= input.next();
        String usercard = usernumber+usersuit;
        
        
        
       
        //this above one is to allow user to select card by choosing the card number and the suit
        String luckynumber;
        int i;
        for ( i = 0; i < magicHand.length; i++){
            luckynumber =  store[i];
                if(luckynumber.equals(usercard)){
                    System.out.println("");
                    System.out.println("The card is in the magic hand");
                    i++;
                     break;
                        }
                else{
                    continue;
                    
                }
        }
        
               luckynumber = store[i-1];
               if(luckynumber.equals(usercard)){
               }
               else
                   {System.out.println("");
                    System.out.println("The card isnt in the magic hand");}
                    //this above one searches and tells whether the user card was in the magic hand or not
                
                    System.out.println("");
                    System.out.println("Magic hand was:");
                
                 for (  i=0 ; i < magicHand.length ; i++){
                     System.out.println(store[i]);
                 }
                //this is to display the real magic hand cards
                
        }
       
        
        


}


