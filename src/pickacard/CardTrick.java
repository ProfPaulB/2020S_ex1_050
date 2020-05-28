package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * 
 * @author Jashanpal Singh Bains  Date: 28 May 2020
 */
import javax.swing.*;
  public class CardTrick { // class started
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) { // method started

       //String str1 = JOptionPane.showInputDialog("Enter the card value between 1 and 13");// User will input value of card
        //int a = Integer.parseInt(str1);

        //String str2 = JOptionPane.showInputDialog(" Choose one of the suit :(Hearts, Diamonds, Spades, Clubs) "); // User will input suit

	    
	    Card luckyCard = new Card();
	    luckyCard.setSuit("Hearts");
	    luckyCard.setValue(5);
	    
	    String l = luckyCard.getSuit();
	    int v = luckyCard.getValue();
	    

    Card[] magicHand = new Card[7];

    String[] suit = new String[7];

    int [] value = new int[7];


     for (int i = 0; i < magicHand.length; i++)
     {
            Card c = new Card();


            c.setValue((int)(1 + Math.random()*12));
            c.setSuit(Card.SUITS[(int)Math.random()*4]);

            suit[i] = c.getSuit();
            value[i] = c.getValue();


        }

	    for(int i = 0 ; i <magicHand.length;i++)
	    {
		    if(value[i] == v &&  suit[i] == l)
			     System.out.println(" HURRAY !! , You got a magicHand");
		    else
			    System.out.println(" OOPS !! , You didn't got a magicHand");
	    }
			    

 //  for(int i = 0 ; i< magicHand.length ; i++)
   //{
	   
   //if(value[i]== a && suit[i] == str2)
			// System.out.println(" HURRAY !! , You got a magicHand");

			// else
			 //System.out.println(" OOPS !! , You didn't got a magicHand");
  // }
	    
	    /* This loop is used 
	    t0 print the content of array's */
	    
	    for(int i = 0 ; i <suit.length ; i++)
   {
       System.out.println(suit[i] + " : " + value[i]);
   }




    } // method closed

} // class closed



