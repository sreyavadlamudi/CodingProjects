
/** Player.java
*
*This is a simple Player class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 3 - Crazy Eights
* @version 1.0
*/

/** The Player class will create two players and give them each five cards randomly from the card deck to start out in the game with. Along with this,
* this class will calculate the overall score the players will get at the end of the game based on the points associated with each of the different cards.
*/

import java.util.LinkedList;
import java.util.Random;

public class Player{
  /** The name of the player. */
  private int m_playerId;
  /** The number of the player */
  LinkedList<Card> m_ownedCards = new LinkedList<Card>();
  /** The linkedlist of the five different cards each player starts with. */
  private Deck cards;
  /** The object for deck of cards from Deck class */
  Random random = new Random();
  /** Allows to create a random integer for making a new Suit. */
  int Score;
  /** The integer that represents the Score */
  String[] suit = {"hearts", "spades", "clubs", "diamonds"};
  /** The array for suit. */
  String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
  /** The array for rank. */

  /** The default constructor - sets the player number to 0, creates a new object for the card Deck, and
   * sets the score to 0.
   */

  public Player(){
    m_playerId = 0;
    cards = new Deck();
    Score = 0;
  }


  /** The overloaded constructor - assigns the first player to five cards to start with.
   * @param playerId int representing the number of the player
   * @param cards Deck that adds five cards from the full deck to the cards in hand of the player
   */

  public Player(int playerId, Deck cards){
    m_playerId = playerId;
    for(int i = 0; i<5;i++){
        Card c = cards.deal();
        m_ownedCards.add(i,c);
    }
  }

  /** The overloaded constructor - assigns the second player to five cards to start with.
   * @param playerId int representing the number of the player
   * @param owned linkedlist that represents the cards that will be added to the five cards in hand of the player
   */

  public Player(int playerId, LinkedList<Card>owned){
    m_playerId = playerId;
    for(int i = 0; i<owned.size();i++){
        m_ownedCards.add(owned.get(i));
    }
  }

  /** Returns the playerId
  * @return An integer that represents the number of the player
  */
  public int getplayerId(){
    return m_playerId;
  }

  /** Displays whether or not the cards in the hand of the players is empty or not in order to determine whether the game is over or not
   * @return return an boolean that states whether this statement is true or false
   */

  public Boolean isCompleted(){
    return (m_ownedCards.size() == 0);
  }

  /** Displays the size of the cards in hand of the player
   * @return returns an integer of the size of the cards that each player has
   */

  public int ownedCardSize(){
    return m_ownedCards.size();
  }

  /** Displays the process of each player taking their turn in the game. If a card that the player places matches a specific suit or rank, the card is removed
   * from the cards in their hand.
   * @return return the type Card of the cards left in the player's hands
   */

  public Card takeTurn(Card current, Deck cards){
    for(int i = 0; i<m_ownedCards.size(); i++){
      Card firstCard = m_ownedCards.get(i);
      if(firstCard.getRank().equals(current.getRank())){
        return m_ownedCards.remove(i);
      }
      else if (firstCard.getSuit().equals(current.getSuit())){
        return m_ownedCards.remove(i);
      }
      else if (firstCard.getRank().equals("8")){
        newSuit();
        return m_ownedCards.remove(i);
      }
    }

    while(true){
      Card c = cards.deal();

      if(c.getRank().equals(current.getRank())){
        return c;
      }

      else if(c.getSuit().equals(current.getSuit())){
        return c;
      }

      else if (c.getRank().equals("8")){
        newSuit();
        return c;
      }
      else{
        m_ownedCards.add(c);
        return null;
      }
    }
  }

  /** Displays the reassigned suit of the card that will be placed in the pile
   * @return return an String which is the new suit that each player must match with their cards
   */

  public String newSuit(){
    String suit2;
    int number = random.nextInt(4);
    suit2 = suit[number];
    return suit2;
  }

  /** Displays the score of each player based on the points each card is worth
   * @return return an integer representing the total score of each player
   */

  public int Score(){
    int Score = 0;
    for(int i = 0; i<m_ownedCards.size();i++){
      Card firstCard = m_ownedCards.get(i);
      if (firstCard.getRank().equals("8")){
        Score = Score + 50;
      }
      else if(firstCard.getRank().equals("10")||firstCard.getRank().equals("K")||firstCard.getRank().equals("Q")||firstCard.getRank().equals("J")){
        Score = Score + 10;
      }

      else if(firstCard.getRank().equals("A")){
        Score = Score + 1;
      }
      else{
        Score = Score + Integer.parseInt(firstCard.getRank());
      }
    }
    return Score;
  }
}
