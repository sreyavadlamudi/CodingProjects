/** Card.java
*
*This is a simple Card class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 3 - Crazy Eights
* @version 1.0
*/

/** This Card class provides appropriate constructors and accessors in order to create a certain type of card given the suit and rank.
*/

public class Card{
  /** The name of the Card */
  private String m_suit;
  /** The type of suit of the card */
  private String m_rank;
  /** The type of rank(value) of the card */


/** The default constructor - sets both of the Strings for m_suit and m_rank to null */
  public Card(){
      m_suit = null;
      m_rank = null;
  }

  /** The overloaded constructor - creates a card with a given suit and a rank.
   * @param suit String representing suit
   * @param cheeseToppings String reprsenting rank
   */

  public Card(String suit, String rank){
    m_suit = suit;
    m_rank = rank;
  }

  /** Returns the suit.
  * @return A String representing the suit of the Card
  */
  public String getSuit(){
    return m_suit;
  }
  /** Returns the rank.
  * @return A String representing the rank of the Card
  */
  public String getRank(){
    return m_rank;
  }
  /** Sets the String of suit.
  * @param cheeseToppings The type of suit that is on the Card
  */
  public void setSuit(String suit){
    m_suit = suit;
  }
  /** Sets the String of rank.
  * @param cheeseToppings The type of rank that is on the Card
  */
  public void setRank(String rank){
    m_rank = rank;
  }

}
