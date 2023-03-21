/** Staff.java
*
*This is a simple Staff class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Staff class is created using inheritance and is a class containing the same variables with the addition of title and building and extends the affiliate class which
*is a basis.
*/

import java.util.Scanner;

public abstract class Staff extends Affiliate{
  protected String m_title;
    /** The title of the affiliate who is a staff member*/
  protected String m_building;
    /** The building at which this staff member works */

    /** The default constructor - super allows this class to have access to variables from other classes and sets title and building strings to null*/

  public Staff(){
    super();
    m_title = null;
    m_building = null;
  }

  /** The overloaded constructor - creates an affiliate for Staff in general
   * @param title String representing the title of the staff member
   * @param building String representing the building
   */
  public Staff(  String address,  int age,String building, int id, String name, String phoneNumber, String title, int yearJoinedChapman){
    super(address,age, id, name, phoneNumber, yearJoinedChapman);
    m_title = title;
    m_building = building;
  }

  /** Returns the title.
  * @return An String representing the title of the staff member
  */
  public String getTitle(){
    return m_title;
  }

  /** Returns the building.
  * @return A String representing the building of the staff member
  */
  public String getBuilding(){
    return m_building;
  }

  /** Sets the title.
  * @param title the title of the staff member
  */
  public void setTitle(String title){
    m_title = title;
  }

  /** Sets the building
  * @param building the building of the staff member
  */
  public void setBuilding(String building){
    m_building = building;
  }

  /** Returns a string representation of all the information/data
   * @return A string representation of the data for  staff members
   */

  public String toString(){
    String s = "";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "Building: " + m_building+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Title: " + m_title+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }

    /** Returns a string representation of all the information/data
     * @return A string representation of the data for the staff members that will print onto the output file
     */

  public String toString2(){
    String s = "";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_building+ ", ";
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
    System.out.println("Enter title: ");
    m_title = scnr.next();
    System.out.println("Enter building name: ");
    m_building = scnr.next();
  }
}
