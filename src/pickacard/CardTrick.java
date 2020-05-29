package pickacard;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Tapasvi Patel
 * @Date 28 May 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card LuckyCard= new Card();
        LuckyCard.setValue(11);
        LuckyCard.setSuit(3);

        for (int i = 0; i < magicHand.length; i++) {
           
            magicHand[i]=new Card();           
            magicHand[i].setValue((int) ((1 + Math.random()*13)));
            magicHand[i].setSuit((int) (Math.round(Math.random()*3)));      
            
        }
        
        int temp=0;
        
        for (int i = 0; i < magicHand.length; i++) {
            
            if(magicHand[i].getValue()== LuckyCard.getValue() && (magicHand[i].getSuit().equals(LuckyCard.getSuit()))) {
                temp++;
            }                                
                     
        }
       
        
        if(temp>0) {
            System.out.println("Hurray!! Your Guess is Correct.");
        }
        
        else 
            System.out.println("Sorry :( Try Again.");
          
    }

}
