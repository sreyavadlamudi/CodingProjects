/** Affiliate.java
*
*This is a simple Affiliate class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The Affiliate class creates the variables that will provide a base description for all of the members in the university database.
*/


import java.util.Scanner;

public abstract class Affiliate{
  /** The name of the affiliate. */
  protected String m_name;
  /** The name of the affiliate. */
  protected int m_age;
  /** The age of the affiliate. */
  protected String m_address;
  /** The address of the affiliate. */
  protected String m_phoneNumber;
  /** The phone number of the affiliate. */
  protected int m_id;
  /** The id of the index of the affiliate. */
  protected int m_yearJoinedChapman;
  /** The  year that the affiliate joined Chapman University. */

  /** The default constructor - sets the name, address, and phone number to empty strings
   * and age, id, and year they joined chapman to 0.
   */

  public Affiliate(){
    m_name = null;
    m_age = 0;
    m_address = null;
    m_phoneNumber = null;
    m_id = 0;
    m_yearJoinedChapman = 0;
  }

  /** The overloaded constructor - creates an affiliate which each specific detail from the variables
   * @param address String representing the address of the affiliate
   * @param age int representing the age of the affiliate
   * @param id int representing id of the affiliate
   * @param name String representing the name of the affiliate
   * @param ohoneNumber String representing the number of the affiliate
   * @param yearJoinedChapman int representing year affiliate joined Chapman
   */

  public Affiliate(String address, int age, int id, String name, String phoneNumber, int yearJoinedChapman){
    m_name = name;
    m_age = age;
    m_address = address;
    m_phoneNumber = phoneNumber;
    m_id = id;
    m_yearJoinedChapman = yearJoinedChapman;
  }


  // public Affiliate(Affiliate a){
  //   m_name = a.m_name;
  //   m_age = a.m_age;
  //   m_address = a.m_address;
  //   m_phoneNumber = a.m_phoneNumber;
  //   m_id = a.m_id;
  //   m_yearJoinedChapman = a.m_yearJoinedChapman;
  // }

  /** Returns the name.
  * @return A String representing the name of the affiliate
  */
  public String getName(){
    return m_name;
  }
  /** Returns the age.
  * @return An int representing the age of the affiliate
  */
  public int getAge(){
    return m_age;
  }

  /** Returns the address.
  * @return A String representing the address of the affiliate
  */
  public String getAddress(){
    return m_address;
  }

  /** Returns the phone number.
  * @return A String representing phone number of the affiliate
  */
  public String getPhoneNumber(){
    return m_phoneNumber;
  }

  /** Returns the id.
  * @return A String representing id of the affiliate
  */
  public int getId(){
    return m_id;
  }

  /** Returns the year.
  * @return An int representing the year affiliate joined Chapman
  */
  public int getYearJoinedChapman(){
    return m_yearJoinedChapman;
  }

  /** Sets the name of affiliate.
  * @param name the name of affiliate
  */
  public void setName(String name){
    m_name = name;
  }

  /** Sets the age
  * @param age the age of the affiliate
  */
  public void setAge(int age){
    m_age = age;
  }

  /** Sets the address
  * @param address the address of the affiliate
  */
  public void setAddress(String address){
    m_address = address;
  }

  /** Sets the ohone number
  * @param phoneNumber the phone number of the affiliate
  */
  public void setPhoneNumber(String phoneNumber){
    m_phoneNumber = phoneNumber;
  }

  /** Sets the id
  * @param id the id of the affiliate
  */
  public void setId(int id){
    m_id = id;
  }

  /** Sets the year
  * @param yearJoinedChapman sets the year the affiliate joined Chapman
  */
  public void setYearJoinedChapman(int yearJoinedChapman){
    m_yearJoinedChapman = yearJoinedChapman;
  }

  /** Returns a string representation of the affiliate
   * @return A string representation of the affiliate object
   */


  public String toString(){
    String s = "";
    s += "Address: " + m_address+ ", ";
    s += "Age: " + m_age+ ", ";
    s += "ID Number: " + m_id+ ", ";
    s += "Name: "+ m_name+ ", ";
    s += "Phone Number: " + m_phoneNumber+ ", ";
    s += "Year Joined Chapman: " + m_yearJoinedChapman;
    return s;
  }

  /** Returns a string representation of the affiliate printed onto the file
   * @return A string representation of the Affiliate object
   */


  public String toString2(){
    String s = "";
    s +=  m_address+ ", ";
    s +=  m_age+ ", ";
    s += m_id+ ", ";
    s += m_name+ ", ";
    s += m_phoneNumber+ ", ";
    s += m_yearJoinedChapman;
    return s;
  }

  /**Compares between two different years of different affiliates in order to determine seniority
   * @return an integer of either -1 or 1
   */
  public int compareTo(Affiliate a){
    int ret = 0;
    if(getYearJoinedChapman()>a.getYearJoinedChapman()){
      ret = 1;
    }
    else if(getYearJoinedChapman()<a.getYearJoinedChapman()){
      ret = -1;
    }
    return ret;
    }

    /** Displays all the values of the affiliates and asks the user to input data and it is void with no return values
     */

  public void createAffiliate(){
    Scanner scnr = new Scanner(System.in);

    System.out.println("Enter name: ");
    m_name = scnr.next();
    System.out.println("Enter age: ");
    m_age = scnr.nextInt();
    System.out.println("Enter address: ");
    m_address = scnr.next();
    System.out.println("Enter phoneNumber: ");
    m_phoneNumber = scnr.next();
    System.out.println("Enter id number: ");
    m_id = scnr.nextInt();
    System.out.println("Enter yearJoinedChapman: ");
    m_yearJoinedChapman = scnr.nextInt();

  }
}
