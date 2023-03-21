
/** Student.java
*
*This is a simple Student class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Student class is created using inheritance and is a class containing the same variables and extends from the Affiliate class
*/


import java.util.Scanner;

public abstract class Student extends Affiliate{
  protected String m_major;
    /** The major the studen is taking*/
  protected String m_minor;
    /** The minor the student is taking*/
  protected int m_classStanding;
    /** The classStanding of the student*/

/** The default constructor - super allows this class to have access to variables from other classes and sets major and minor to null and class standing to zero*/
  public Student(){
    super();
    m_major = null;
    m_minor = null;
    m_classStanding = 0;
  }

  /** The overloaded constructor - creates an affiliate for Student
   * @param major String representing the major the student is taking
   * @param minor String representing the minor the student is taking
   * @param classStanding int representing the rank of the student
   */

  public Student(String address, int age, int classStanding, int id, String major, String minor, String name, String phoneNumber, int yearJoinedChapman){
    super(address, age, id, name, phoneNumber, yearJoinedChapman);
    m_major = major;
    m_minor = minor;
    m_classStanding = classStanding;
  }

  /** Returns major.
  * @return A String representing the major of the student
  */
  public String getMajor(){
    return m_major;
  }
  /** Returns minor.
  * @return A String representing the minor of the student
  */
  public String getMinor(){
    return m_minor;
  }
  /** Returns class standing.
  * @return An int representing the class standing of the student
  */
  public int getClassStanding(){
    return m_classStanding;
  }

  /** Sets the major
  * @param major major of the student
  */
  public void setMajor(String major){
    m_major = major;
  }

  /** Sets the minor
  * @param minor minor of the student
  */
  public void setMinor(String minor){
    m_minor = minor;
  }

  /** Sets the class standing
  * @param classStanding class standing of the student
  */
  public void setClassStanding(int classStanding){
    m_classStanding = classStanding;
  }
  /** Returns a string representation of all the information/data
   * @return A string representation of the data for all the students
   */

  public String toString(){
    String s = "";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Class Standing: " + m_classStanding+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Major: " + m_major+ ", ";
    s += "Minor: " + m_minor+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }
  /** Returns a string representation of all the information/data
   * @return A string representation of the data for all the students that will print onto the output file
   */
  public String toString2(){
    String s = "";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_major+ ", ";
    s += m_minor+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */
  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter major: ");
    m_major = scnr.next();
    System.out.println("Enter minor:");
    m_minor = scnr.next();
    System.out.println("Enter classStanding: ");
    m_classStanding = scnr.nextInt();
  }

}
