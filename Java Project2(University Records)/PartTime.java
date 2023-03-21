/** PartTime.java
*
*This is a simple PartTime class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The PartTime class is created and extends the Staff using inheritance and is a class containing the same varaibles with the addition of hourly Salary.
*/

import java.util.Scanner;

public class PartTime extends Staff{
  protected int m_hourlySalary;
    /** The amount of salary PartTime staff will get by the hour. */

    /** The default constructor - super allows this class to have access to variables from other classes and sets hourly salary to 0.
     */

  public PartTime(){
    super();
    m_hourlySalary = 0;
  }

  /** The overloaded constructor - creates an affiliate for partTime staff
   * @param hourlySalary the amount of salary by the hour for partTime Staff
   */

  public PartTime(String address,  int age, String building, int hourlySalary, int id, String name, String phoneNumber, String title, int yearJoinedChapman){
    super(address,age, building, id, name, phoneNumber, title, yearJoinedChapman);
    m_hourlySalary = hourlySalary;
  }

  /** Returns the hourly salary.
  * @return An int representing the hourly salary for the part time staff
  */

  public int getHourlySalary(){
    return m_hourlySalary;
  }

  /** Sets the amount of hourlySalary.
  * @param hourlySalary the amount og salary by the hour
  */

  public void setHourlySalary(int hourlySalary){
    m_hourlySalary = hourlySalary;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the part-time staff members
   */
  public String toString(){
    String s = "PartTime Staff"+ ", ";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Building: " + m_building+ ", ";
    s += "Staff Hourly Salary: " + m_hourlySalary+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Title: " + m_title+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }


  /** Returns a string representation of all the information/data
   * @return A string representation of the data for the part-time staff members that will print onto the output file
   */
  public String toString2(){
    String s = "PartTime Staff"+ ", ";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_building+ ", ";
    s += m_hourlySalary+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_title+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
   */

  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    super.createAffiliate();
    System.out.println("Enter hourlySalary:");
    m_hourlySalary = scnr.nextInt();
    System.out.println("\n");
  }

}
