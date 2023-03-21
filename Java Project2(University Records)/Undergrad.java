/** Undergrad.java
*
*This is a simple Undergrad class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Undergrad class is created using inheritance and is a class containing the same varaibles and extends from the Student class which gets the basic variables from the Affiliate class
*/


import java.util.Scanner;

public class Undergrad extends Student{
  protected int m_coursesTaken;
    /** The amount of coursesTaken by the undergraduate student*/
  protected int m_scholarship;
    /** The scholarship the student received*/

/** The default constructor - super allows this class to have access to variables from other classes and sets courses and scholarship amount to zero */
  public Undergrad(){
    super();
    m_coursesTaken = 0;
    m_scholarship = 0;
  }

  /** The overloaded constructor - creates an affiliate for Undergraduate student
   * @param coursesTaken int representing the amount of courses the undergrad student takes
   * @param scholarship int representing the amount of money the undergrad student received as a scholarship
   */
  public Undergrad(String address, int age, int classStanding, int coursesTaken, int id, String major, String minor, String name, String phoneNumber, int scholarship, int yearJoinedChapman){
    super(address, age, classStanding, id, major, minor, name, phoneNumber, yearJoinedChapman);
    m_coursesTaken = coursesTaken;
    m_scholarship = scholarship;
  }

  /** Returns courses that were taken.
  * @return A int representing the amount of courses that were taken by the undergrad student
  */
  public int getCoursesTaken(){
    return m_coursesTaken;
  }

  /** Returns scholarship.
  * @return A String representing the amount of money received for a scholarship by the undergrad student
  */
  public int getScholarship(){
    return m_scholarship;
  }

  /** Sets the courses taken
  * @param coursesTaken this is the amount of courses that were taken
  */
  public void setCoursesTaken(int coursesTaken){
    m_coursesTaken = coursesTaken;
  }

  /** Sets the scholarship
  * @param scholarship this is the amount of money
  */
  public void setScholarship(int scholarship){
    m_scholarship = scholarship;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for all the undergraduate students
   */

  public String toString(){
    String s = "Undergraduate Student"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Amount of Courses Taken: " + m_coursesTaken+ ", ";
    s += "Class Standing: " + m_classStanding+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Major: " + m_major+ ", ";
    s += "Minor: " + m_minor+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Scholarship Amount: " + m_scholarship+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the undergrad students that will print onto the output file
   */
  public String toString2(){
    String s = "Undergraduate Student"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s +=  m_coursesTaken+ ", ";
    s += m_classStanding+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_major+ ", ";
    s += m_minor+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_scholarship+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */
  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter coursesTaken: ");
    m_coursesTaken = scnr.nextInt();
    System.out.println("Enter scholarship: ");
    m_scholarship = scnr.nextInt();
    System.out.println("\n");

  }
}
