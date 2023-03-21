/** Game.java
*
*This is a simple Game class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 3 - Crazy Eights
* @version 1.0
*/

/** The Game class will initiate the game and play out the game until one of the players wins, or if there is a draw.
* Along with this, this class will have the methods to calculate who wins how many games, the scores, the average amount of cards the losing player has,
* the average number of eights, and number of times the stock of cards becomes empty.
*/

import java.util.LinkedList;

public class Game{
  /** The name of the game. */
  private Player player1;
  /** The player1 of type Player. */
  private Player player2;
  /** The player2 of type Player. */
  private int player1Points;
  /** The score of player1. */
  private int player2Points;
  /** The score of player2. */
  private Deck cardDeck;
  /** The cardDeck with type Deck. */
  private Card start;
  /** The first card in the deck of type Card after start2. */
  private int eightFrequency;
  /** The amount of times eight card is placed. */
  private String winner;
  /** The winner of the game between player1 and player2. */
  private int empty;
  /** The amount of the times the stock/deck goes empty. */
  private int cardHeld;
  /** The amount of cards the player has. */
  private Card start2;
  /** Card that starts out the game, then moves onto start when not null */


  /** The default constructor - sets the eightFrequences, points of player1, points of player2, and the amount of times stock goes empty to 0.
   * creates object fro the cardDeck, and gives player1 and player2 five cards to start out with as well as give start a card to start out with.
   */

  public Game(){
    eightFrequency = 0;
    player1Points = 0;
    player2Points = 0;
    empty = 0;
    cardDeck = new Deck();
    player1 = new Player(1,cardDeck);
    player2 = new Player(2,cardDeck);
    start = new Card();
    start = cardDeck.deal();
  }

  /** Displays whether or not the cards in the hand of the players is empty or not in order to determine whether the game is over or not as well as check if the entire deck is empty
   * start2 occurs if nothing equals 0, and it the card start2 is not equal to null, then it moves onto another card in order to prevent a null exception
   * @return return an boolean that states whether this statement is true or false
   */

  public String play(){

    while((player1.ownedCardSize()!=0)&&(player2.ownedCardSize()!=0)&&(cardDeck.stockSize()!=0)){
      start2 = player1.takeTurn(start,cardDeck);
      if(start2!=null){
        start = start2;
        if(start.getRank().equals("8")){
          eightFrequency = eightFrequency + 1;
        }
     }

     if(player1.isCompleted() || cardDeck.stockSize() == 0 ){
       break;
     }

     start2 = player2.takeTurn(start,cardDeck);
     if(start2!=null){
       start = start2;
       if(start.getRank().equals("8")){
         eightFrequency = eightFrequency + 1;
       }
    }

    if(player2.isCompleted() || cardDeck.stockSize() == 0 ){
      break;
    }

  }

  winner = countWinner();
  return winner;
}

  /** Displays the winner of the game and calls to the score method
   * @return return the winner of the game with the type String
   */

  public String countWinner(){
    winner = null;
    if(player1.ownedCardSize()==0){
      player1Points = player2.Score();
      winner = "player1";
    }
    else if(player2.ownedCardSize()==0){
      player2Points = player1.Score();
      winner = "player2";
    }
    else if(player1.ownedCardSize()>player2.ownedCardSize()){
      player2Points = player1.Score();
      winner = "player2";
    }
    else if(player1.ownedCardSize()<player2.ownedCardSize()){
      player1Points = player2.Score();
      winner = "player1";
    }
    else if(player1.ownedCardSize() == player2.ownedCardSize()){
      winner = "";
      player1Points = 0;
      player2Points = 0;
    }
    return winner;
  }

  /** Displays the amount of the cards that the loser of the game has left at the end
   * @return return the integer of the amount of the cards in the loser's hands
   */

  public int losingCardNumber(){
    if(player1.ownedCardSize()==0){
      cardHeld = player2.ownedCardSize();
    }
    else if(player2.ownedCardSize()==0){
      cardHeld = player1.ownedCardSize();
    }
    else if(player1.ownedCardSize()>player2.ownedCardSize()){
      cardHeld = player1.ownedCardSize();
    }
    else if(player1.ownedCardSize()< player2.ownedCardSize()){
      cardHeld = player2.ownedCardSize();
    }
    return cardHeld;
  }

  /** Displays the amount of points of the player
   * @return return an integer of the total points of player1
   */

  public int pointsPlayer1(){
    return player1Points;
  }

  /** Displays the amount of points of the player
   * @return return an integer of the total points of player2
   */

  public int pointsPlayer2(){
    return player2Points;
  }

  /** Displays the amount of times the card of eight is used in the game
   * @return return an integer of the amount of times eight is played
   */

  public int eightCount(){
    return eightFrequency;
  }

  /** Displays amount of times stock is empty
   * @return return an integer for the amount of times the stock or deck of cards is empty
   */

  public int emptyStock(){
    if(cardDeck.stockSize()==0){
      empty = empty + 1;
    }
    return empty;
  }

}
