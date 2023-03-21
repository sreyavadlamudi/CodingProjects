/** Gradaute.java
*
*This is a simple Graduate class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Graduate class is created using inheritance and is a class containing the same varaibles and extends from the Student class which gets the basic variables from the Affiliate class
*/


import java.util.Scanner;
public class Graduate extends Student{
  protected int m_papersPublished;
    /** The amount of papers published by the graduate student*/
  protected String m_thesisAdvisor;
    /** The name of the thesisAdvisor*/

/** The default constructor - super allows this class to have access to variables from other classes and sets the amount of papers published to zero and the thesis advisor string to null*/
  public Graduate(){
    super();
    m_papersPublished = 0;
    m_thesisAdvisor = null;
  }

  /** The overloaded constructor - creates an affiliate for Graduate Student
   * @param papersPublished int representing the amount of papers published by the graduate student
   * @param thesisAdvisor String of the thesis Advisor of the graduate student
   */

  public Graduate(String address, int age, int classStanding, int id, String major, String minor, String name, int papersPublished, String phoneNumber, String thesisAdvisor, int yearJoinedChapman){
    super(address, age, classStanding, id, major, minor, name, phoneNumber, yearJoinedChapman);
    m_papersPublished = papersPublished;
    m_thesisAdvisor = thesisAdvisor;
  }

  /** Returns papers published
  * @return An int representing the amount of papers that were published by the graduate student
  */
  public int getPapersPublished(){
    return m_papersPublished;
  }

  /** Returns thesis advisor
  * @return A String representing the name of the thesis advisor of the graduate student
  */
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /** Sets the papers published
  * @param papersPublished this is the amount of papers of the graduate student
  */
  public void setPapersPublished(int papersPublished){
    m_papersPublished = papersPublished;
  }

  /** Sets the thesis advisor
  * @param thesisAdvisor the advisor of the graduate student
  */
  public void setThesisAdvisor(String thesisAdvisor){
    m_thesisAdvisor = thesisAdvisor;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for all the gradaute students
   */
  public String toString(){
    String s = "Graduate Student"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Class Standing: " + m_classStanding+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Major: " + m_major+ ", ";
    s += "Minor: " + m_minor+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Amount of Papers Published: " + m_papersPublished+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Thesis Advisor: " + m_thesisAdvisor+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the graduate students that will print onto the output file
   */
  public String toString2(){
    String s = "Graduate Student"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_classStanding+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_major+ ", ";
    s += m_minor+ ", ";
    s +=  m_papersPublished+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_thesisAdvisor+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */
  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter number of papers Published: ");
    m_papersPublished = scnr.nextInt();
    System.out.println("Enter thesisAdvisor: ");
    m_thesisAdvisor = scnr.next();
    System.out.println("\n");
  }

}
