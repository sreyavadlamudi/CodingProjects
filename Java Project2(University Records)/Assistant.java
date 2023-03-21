/** Assistant.java
*
*This is a simple Assistant class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Assistant class is created and extends the Faculty class using inheritance and is a class containing the same varaibles with the addition of years until tenure
*/


import java.util.Scanner;
public class Assistant extends Faculty{
  protected int m_yearsUntilTenure;
  /** The amount of years until tenure for the Assistant Professor in Faculty*/

/** The default constructor - super allows this class to have access to variables from other classes and sets years until tenure to zero*/

  public Assistant(){
    super();
    m_yearsUntilTenure = 0;
  }
  /** The overloaded constructor - creates an affiliate for Assistant within Faculty
   * @param yearsSinceTenure int representing the amount of years the Associate has until tenure
   */
  public Assistant(String address, int age, String department, int id, String name, int numberOfPapers, String phoneNumber, int yearJoinedChapman,  int yearlySalary,  int yearsUntilTenure){
    super(address, age, department, id, name, numberOfPapers, phoneNumber, yearJoinedChapman, yearlySalary);
    m_yearsUntilTenure = yearsUntilTenure;
  }

  /** Returns years until tenure.
  * @return An int representing the years until tenure
  */
  public int getYearsUntilTenure(){
    return m_yearsUntilTenure;
  }

  /** Sets the years until tenure
  * @param yearsUntilTenure the years until the Assitant Faculty member has tenure
  */
  public void setYearsUntilTenure(int yearsUntilTenure){
    m_yearsUntilTenure = yearsUntilTenure;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for assistant faculty members
   */

  public String toString(){
    String s = "Assistant Professor"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Department: " + m_department+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Number of Papers: " + m_numberOfPapers+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman+ ", ";
    s += "Yearly Salary of Faculty: " + m_yearlySalary+ ", ";
    s += "Years Until Tenure: " + m_yearsUntilTenure;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the assistant faculty members that will print onto the output file
   */

  public String toString2(){
    String s = "Assistant Professor"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s +=  m_department+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_numberOfPapers+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman+ ", ";
    s += m_yearlySalary+ ", ";
    s += m_yearsUntilTenure;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */

  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter years Until Tenure: ");
    m_yearsUntilTenure = scnr.nextInt();
    System.out.println("\n");
  }

}
