/** Associate.java
*
*This is a simple Associate class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Associate class is created and extends the Faculty class using inheritance and is a class containing the same varaibles with the addition of years since tenure
*/


import java.util.Scanner;

public class Associate extends Faculty{
  protected int m_yearsSinceTenure;
  /** The amount of years since tenure for the Associate Professor in Faculty*/

/** The default constructor - super allows this class to have access to variables from other classes and sets years since tenure to zero*/

  public Associate(){
    super();
    m_yearsSinceTenure = 0;
  }

  /** The overloaded constructor - creates an affiliate for Associate within Faculty
   * @param yearsSinceTenure int representing the amount of years the Associate has since tenure
   */
  public Associate(String address, int age, String department, int id, String name, int numberOfPapers, String phoneNumber,  int yearJoinedChapman,  int yearlySalary,  int yearsSinceTenure){
    super(address, age, department, id, name, numberOfPapers, phoneNumber, yearJoinedChapman,  yearlySalary );
    m_yearsSinceTenure = yearsSinceTenure;
  }

  /** Returns years since tenure.
  * @return An int representing the years since tenure
  */
  public int getYearsSinceTenure(){
    return m_yearsSinceTenure;
  }

  /** Sets the years since tenure
  * @param yearsSinceTenure the years since the Assocaite Faculty member had tenure
  */
  public void setYearsSinceTenure(int yearsSinceTenure){
    m_yearsSinceTenure = yearsSinceTenure;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for associate faculty members
   */
  public String toString(){
    String s = "Associate Professor"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Department: " + m_department+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Number of Papers: " + m_numberOfPapers+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman+ ", ";
    s += "Yearly Salary of Faculty: " + m_yearlySalary+ ", ";
    s += "Years Since Tenure: " + m_yearsSinceTenure;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the associate faculty members that will print onto the output file
   */
  public String toString2(){
    String s = "Associate Professor"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s +=  m_department+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_numberOfPapers+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman+ ", ";
    s += m_yearlySalary+ ", ";
    s += m_yearsSinceTenure;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */
  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter years Since Tenure: ");
    m_yearsSinceTenure = scnr.nextInt();
    System.out.println("\n");

  }
}
