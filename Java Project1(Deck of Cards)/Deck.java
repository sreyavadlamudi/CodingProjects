/** Deck.java
*
*This is a simple Deck class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 3 - Crazy Eights
* @version 1.0
*/

/** The Deck class will assign each Card to a specific suit and rank, and then populate the deck of 52 cards as well as methods is get the size of
* the deck and a functionn to get a specific card from the deck. Along with this, there is another method in order to remove a randomCard from the deck
* and return the specific card.
*/

import java.util.LinkedList;
import java.util.Random;

public class Deck{
  /** The name of the deck. */
    private LinkedList<Card> cards = new LinkedList<Card>();
    /** The linkedlist of type Card called cards. */
    String[] suit = {"hearts", "spades", "clubs", "diamonds"};
    /** The array of the suits. */
    String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    /** The array of the ranks. */
    Random random = new Random();
    /** random function to get randomCard. */
    private int randomCard;
    /** The value/number assigned to randomCard. */

    /** The default constructor - populates the card deck with two for loops, one for the suits which has 4 Strings
    * and one for ranks which has 13 Strings.
    */

    public Deck(){
        for (int i = 0; i<4; i++){
          for(int j = 0; j<13; j++){
            Card c1 = new Card(suit[i],rank[j]);
            cards.add(c1);
          }
        }
    } 

    /** Displays the size of the card deck
     * @return return an integer representing the total number of cards in the deck
     */

    public int stockSize(){
      return cards.size();
    }

    /** Displays the card at a certain number/index
     * @return return the card of type Card with a given suit and rank.
     */

    public Card get(int randomCard){
      Card card = cards.get(randomCard);
      return card;
    }


    /** Displays which card at a certain number randomCard will be removed
     * @return Card type card that is removed from the deck.
     */

    public Card deal(){
      randomCard = random.nextInt(cards.size());
      return cards.remove(randomCard);
    }
}
