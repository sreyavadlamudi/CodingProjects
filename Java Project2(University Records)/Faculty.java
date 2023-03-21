/** Faculty.java
*
*This is a simple Faculty class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Faculty class is created  using inheritance and is a class containing the same varaibles and extends from the Affiliate class which is the basis for the rest of the classes
*/



import java.util.Scanner;

public abstract class Faculty extends Affiliate{
  protected String m_department;
  /** The department of the faculty*/
  protected int m_yearlySalary;
  /** The amount of Salary the faculty gets*/
  protected int m_numberOfPapers;
  /** The number of papers the faculty has*/

  /** The default constructor - super allows this class to have access to variables from other classes and sets department to null and salary and number of papers to zero*/

  public Faculty(){
    super();
    m_department = null;
    m_yearlySalary = 0;
    m_numberOfPapers = 0;
  }

  /** The overloaded constructor - creates an affiliate for Faculty
   * @param dedpartment String that represents the department of the faculty
   * @param yearlySalary int representing the salary yearly for the faculty
   * @param numberOfPapers int representing the amount of papers for the faculty
   */
  public Faculty(String address, int age, String department, int id, String name,  int numberOfPapers, String phoneNumber, int yearJoinedChapman, int yearlySalary){
    super(address, age,id, name, phoneNumber, yearJoinedChapman);
    m_department = department;
    m_yearlySalary = yearlySalary;
    m_numberOfPapers = numberOfPapers;
  }

  /** Returns department.
  * @return A String representing the department the faculty works in
  */
  public String getDepartment(){
    return m_department;
  }

  /** Returns yearly salary.
  * @return An int representing the salary by the year for the faculty
  */
  public int getYearlySalary(){
    return m_yearlySalary;
  }

  /** Returns number of papers.
  * @return An int representing the number of papers of the faculty
  */
  public int getNumberOfPaper(){
    return m_numberOfPapers;
  }

  /** Sets the department
  * @param department this is teh department of the faculty
  */
  public void setDepartment(String department){
    m_department = department;
  }

  /** Sets the yearly salary
  * @param yearlySalary amount of money faculty makes a year
  */
  public void setYearlySalary(int yearlySalary){
    m_yearlySalary = yearlySalary;
  }

  /** Sets the number of papers
  * @param numberOfPapers the amount of papers of the faculty
  */
  public void setNumberOfPapers(int numberOfPapers){
    m_numberOfPapers = numberOfPapers;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for faculty members
   */

  public String toString(){
    String s = "";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Department: " + m_department+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Number of Papers: " + m_numberOfPapers+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman+ ", ";
    s += "Yearly Salary of Faculty: " + m_yearlySalary;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the faculty members that will print onto the output file
   */

  public String toString2(){
    String s = "";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s +=  m_department+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_numberOfPapers+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman+ ", ";
    s += m_yearlySalary;
    return s;
  }
  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */

  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter department: ");
    m_department = scnr.next();
    System.out.println("Enter yearlySalary:");
    m_yearlySalary = scnr.nextInt();
    System.out.println("Enter number of Papers: ");
    m_numberOfPapers = scnr.nextInt();
  }
}
