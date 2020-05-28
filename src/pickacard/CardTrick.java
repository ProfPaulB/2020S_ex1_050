package pickacard;

/**
  * @author Dhruv Shukla  20th May 
 */
//import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) 
    {
        
        Card[] magicHand = new Card[7];
        Card LuckyCard = new Card();
        LuckyCard.setValue(5);
        LuckyCard.setSuit("Spades");
        int value;
        String suits;
        String result="";
       // int[] temp = new int[7];

        for (int i = 0; i < magicHand.length; i++)
        {
            magicHand[i]= new Card();
           // temp[i]= (int)(Math.random()*13);
            //Card c = new Card();
            //c.setValue((int)(Math.random()*13));//c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[(int)(Math.random()*4)]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i].setValue((int)(Math.random()*13));
            magicHand[i].setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
        
        
        //Scanner input = new Scanner(System.in);

       /* System.out.println("Enter card value and Suit:");//insert code to ask the user for Card value and suit, create their card
        value = input.nextInt();
        suits = input.nextLine();*/
        
        for (int i = 0; i < magicHand.length; i++)               // Searching for a match with magicHand  
        {
             if(magicHand[i].getValue()==LuckyCard.getValue() && magicHand[i].getSuit().equals(LuckyCard.getSuit()))
             {
                 result="You got the magic hand, you win";
             }
             else
             {
                 result="You diidn't get the magic hand, you lose";
             }
            
        }

        System.out.println(result);//Then report the result here
    }

}
