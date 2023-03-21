/** Full.java
*
*This is a simple Full class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Full class is created and extends the Faculty using inheritance and is a class containing the same varaibles with the years until retirement.
*/

import java.util.Scanner;

public class Full extends Faculty{
  protected int m_yearsUntilRetirement;
  /** The amount of years until retirement for the Full Professor in Faculty*/

/** The default constructor - super allows this class to have access to variables from other classes and sets years until retirement to zero*/
  public Full(){
    super();
    m_yearsUntilRetirement = 0;
  }

  /** The overloaded constructor - creates an affiliate for Full within Faculty
   * @param yearsUntilRetirement int representing the amount of years the Full Affiliate until retirement
   */
  public Full( String address, int age, String department, int id, String name, int numberOfPapers, String phoneNumber,  int yearJoinedChapman, int yearlySalary,  int yearsUntilRetirement){
    super(address, age, department, id, name,  numberOfPapers, phoneNumber, yearJoinedChapman, yearlySalary);
    m_yearsUntilRetirement = yearsUntilRetirement;
  }

  /** Returns years until retirement.
  * @return An int representing the years until retirement
  */
  public int getYearsUntilRetirement(){
    return m_yearsUntilRetirement;
  }

  /** Sets the years until retirement.
  * @param yearsUntilRetirement the years until the Full Faculty member can retire
  */
  public void setYearsUntilRetirement(int yearsUntilRetirement){
    m_yearsUntilRetirement = yearsUntilRetirement;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for full faculty members
   */

  public String toString(){
    String s = "Full Professor"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Department: " + m_department+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Number of Papers: " + m_numberOfPapers+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman+ ", ";
    s += "Yearly Salary of Faculty: " + m_yearlySalary+ ", ";
    s += "Years Until Retirement: " + m_yearsUntilRetirement;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the full faculty members that will print onto the output file
   */

  public String toString2(){
    String s = "Full Professor"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s +=  m_department+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_numberOfPapers+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman+ ", ";
    s += m_yearlySalary+ ", ";
    s += m_yearsUntilRetirement;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */
  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter years Until retirment: ");
    m_yearsUntilRetirement = scnr.nextInt();
    System.out.println("\n");
  }
}
