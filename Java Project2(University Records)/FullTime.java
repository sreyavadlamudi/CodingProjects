/** FullTime.java
*
*This is a simple FullTime class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The FullTime class is created and extends the Staff using inheritance and is a class containing the same varaibles with the addition of yearly Salary.
*/

import java.util.Scanner;
public class FullTime extends Staff{
  protected int m_yearlySalary2;
  /** The amount of salary PartTime staff will get every year. */

  /** The default constructor - super allows this class to have access to variables from other classes and sets yearly salary to 0.
   */

  public FullTime(){
    super();
    m_yearlySalary2 = 0;
  }

  /** The overloaded constructor - creates an affiliate for fullTime staff
   * @param hourlySalary the amount of salary by the year for fullTime Staff
   */
  public FullTime(String address, int age, String building,  int id, String name, String phoneNumber, String title, int yearJoinedChapman, int yearlySalary2){
    super(address, age, building, id, name, phoneNumber, title, yearJoinedChapman);
    m_yearlySalary2 = yearlySalary2;
  }

  /** Returns the yearly salary.
  * @return An int representing the yearly salary for the full time staff
  */

  public int getYearlySalary2(){
    return m_yearlySalary2;
  }

  /** Sets the amount of yearlySalary.
  * @param hourlySalary the amount of salary by the year
  */

  public void setYearlySalary2(int yearlySalary2){
    m_yearlySalary2 = yearlySalary2;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the full-time staff members
   */

  public String toString(){
    String s = "FullTime Staff"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Building: " + m_building+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Staff Yearly Salary: " + m_yearlySalary2+ ", ";
    s += "Title: " + m_title+", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the full-time staff members that will print onto the output file
   */
  public String toString2(){
    String s = "FullTime Staff"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_building+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearlySalary2+ ", ";
    s += m_title+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */

  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter yearlySalary:");
    m_yearlySalary2 = scnr.nextInt();
    System.out.println("\n");

  }
}
