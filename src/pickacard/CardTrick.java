package pickacard;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Amandeep Singh Walia 28 May 2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)((Math.random()*13)+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");
        int num = 0;
        for(int i = 0; i<magicHand.length; i++)
        {
            if(luckyCard.getValue()==magicHand[i].getValue() && luckyCard.getSuit().equalsIgnoreCase(magicHand[i].getSuit()))
            {
                num = 1;
            }
            //System.out.println(magicHand[i].getValue() + "  " + magicHand[i].getSuit());
        }
        if(num==1)
        {
            System.out.println("Congragulations... You are a winner.");
        } 
        else
        {
            System.out.println("Sorry... You lose the game.");
        }
    }

}
