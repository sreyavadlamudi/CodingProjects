/** Simulation.java
*
*This is a simple Simulation class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 3 - Crazy Eights
* @version 1.0
*/

/** The Simulation class is the main driver class that executes the entire code and prints out the results for both of the players after multiple games are played.
*/

import java.util.Scanner;

public class Simulation{
  private int m_gamesNumber;
  /** The name of the game. */
  private Game m_game;
  /** The name of the game. */
  private Player player1;
  /** The name of the game. */
  private Player player2;
  /** The name of the game. */
  private int player1Score;
  /** The amount of points player1 has. */
  private int player2Score;
  /** The amount of points player2 has. */
  private int player1GamesWon;
  /** The amount of games player1 won. */
  private int player2GamesWon;
  /** The amount of games player2 won. */
  private String winner;
  /** The name of the winner(Player1 or Player2). */
  private int losingCardAverage;
  /** The number of cards left in the hands of the losing player. */
  private int eightAverage;
  /** The amount of times the eight card is used. */
  private int emptyStock;
  /** The amount of times the stock becomes empty. */

  /** The default constructor - sets the number of games, player Score, player game Wins, losing cards average, eightAverage, and empty stock amount all to 0
   */

  public Simulation(){
    m_gamesNumber = 0;
    player1Score = 0;
    player2Score = 0;
    player1GamesWon = 0;
    player2GamesWon = 0;
    losingCardAverage = 0;
    eightAverage = 0;
    emptyStock = 0;
  }

  /** The overloaded constructor - creates the simulation of the game with a given number of games to be played
   * @param gamesNumber int representing number of games that are played by the players
   * @param m_game object created from the Game Classes
   * @param player1 object created from the player class
   * @param player2 object created from the player class
   */

  public Simulation(int gamesNumber){
    m_gamesNumber = gamesNumber;
    m_game = new Game();
    player1 = new Player();
    player2 = new Player();
  }

  /** Displays the number of the games the players want to play
   * @return return the integer of the amount of games that will be played
   */

  public int simulate(){
    return m_gamesNumber;
  }

  /** Displays the calculated data for all the results of the game
   * @return does not return a variable, but it calculates the total data that will be called on later
   */

  public void calculate(){
      simulate();
      for(int i = 0; i<m_gamesNumber;i++){
        m_game = new Game();
        player1 = new Player();
        player2 = new Player();
        winner = m_game.play();
        player1Score = player1Score + m_game.pointsPlayer1();
        player2Score = player2Score + m_game.pointsPlayer2();
        if(winner.equals("player1")){
          player1GamesWon += 1;
        }
        if(winner.equals("player2")){
          player2GamesWon += 1;
        }
        losingCardAverage = losingCardAverage + m_game.losingCardNumber();
        eightAverage = (eightAverage + m_game.eightCount());
        emptyStock = emptyStock + m_game.emptyStock();
      }
  }

  /** Displays all the results of all the games that are played
   * @return all the print statements that represent Strings of all the data
   */

  public void report(){
    System.out.println("Number of Points for Player1: " + player1Score);
    System.out.println("Number of Points for Player2: " + player2Score);

    System.out.println("Number of Games Won by Player1: " + player1GamesWon);
    System.out.println("Number of Games Won by Player2: " + player2GamesWon);

    System.out.println("Average Number of Cards Held by the Losing Player at End of the Game: " + (double)(losingCardAverage)/m_gamesNumber);
    System.out.println("Average Number of Eight Cards Played in the Games: " + (double)(eightAverage)/m_gamesNumber);
    System.out.println("Number of Times Stock Became Empty: " + emptyStock);
  }

  /** This Simulation class is the main method. Calls to the methods of Card.java, Deck.java, Player.java, and Game.java, and exercises the functionality of these classes.
   * @param args command-line arguments (not used)
   */

  public static void main (String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Number of Games:   ");
    int Games = scnr.nextInt();
    Simulation s = new Simulation(Games);
    s.calculate();
    s.report();
  }
}
