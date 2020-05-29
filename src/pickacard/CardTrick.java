package pickacard;

import java.util.Random;
import java.util.Scanner;

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
        int number = 0;
        String [] store = new String [7];
        Random rdnumber = new Random();
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Diamonds");
        int luckn= luckyCard.getValue();
         String suitn = luckyCard.getSuit();
        String luckynumber = luckn + suitn;
        //create magic hand
         for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
                   
             number = rdnumber.nextInt(13);
           c.setValue(number);
           c.getValue();
           int d = rdnumber.nextInt(4);
          c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue()+ c.getSuit();
          int l = i+1;
          //check lucky number
       if(  luckynumber.equals(store[i])){
           System.out.println("You got a Lucky card");}
       else
          System.out.println("Card"+ l +" not correct");
      
               
          }
         //show the magichand
         System.out.println("the magicHand are :");
                  for (int i = 0; i < magicHand.length; i++){
                        System.out.println( store[i] );
                  }
        //set value suits and get value suits  then store in array 
 /*       for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
             number = rdnumber.nextInt(12)+ 1;
            c.setValue(number);
           c.getValue();
           int d  = rdnumber.nextInt(4);
             c.setSuit(Card.SUITS[d]);
          c.getSuit();
          store[i] = c.getValue() + c.getSuit();
          }
        //ask user for card and suits of card
         System.out.println("enter Card Number: ");
        String cardnumber  = input.nextLine();
        System.out.println("enter SUITS of Card: ");
         String SUITS  = input.nextLine();
        String results = cardnumber+SUITS;
        //searching for card if there are in magichand or not
        for (int i = 0; i < magicHand.length; i++) {
            String o =  store[i];
           
                if(o.equals(results)){
                    //report the resul
                             System.out.println("You Got MagicHand" ); 
        break;
        } **/
       
          
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}

