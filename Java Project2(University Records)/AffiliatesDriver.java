/** AffiliatesDriver.java
*
*This is a simple AffiliatesDriver class
* @author Sreya Vadlamudi
* @author Student ID: 2371434
* @author vadlamudi@chapman.edu
* CPSC 231-02 - Prof. Stevens
* Assignment 4 - University Database
* @version 1.0
*/

/** The AffiliatesDriver class carries out the purpose of this program which is to create a database of the different affiliates and give the user options such as creating an affilaite,
* deleting the affiliate, printing the information out, deleting the affiliate, and saving or restorting the info from a file.
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class AffiliatesDriver implements Printable{
  private static HashMap<Integer, Affiliate>map = new HashMap<Integer, Affiliate>();

  /** This is the print method that is implemented through the Printable interface with no return value but prints out the affiliates.
  */


  public void print(){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the id of the affiliate you want to print: ");
    int id2 = scnr.nextInt();
    System.out.println(map.get(id2));
  }

  /** This class is the main method. Calls to the methods of the other classes and exercises the functionality of these classes.
   * @param args command-line arguments (not used)
   */

  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    int id;
    System.out.println("Pick the number of the affiliate you want to create: 1) Undergradute, 2) Graduate, 3) Assistant, 4) Associate, 5) Full, 6) Full Time, 7) Part Time");
    int number2 = scnr.nextInt();
    if(number2 == 1){
      Affiliate affiliatesInfo = new Undergrad();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 2){
      Affiliate affiliatesInfo = new Graduate();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 3){
      Affiliate affiliatesInfo = new Assistant();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 4){
      Affiliate affiliatesInfo = new Associate();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 5){
      Affiliate affiliatesInfo = new Full();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 6){
      Affiliate affiliatesInfo = new FullTime();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }
    else if(number2 == 7){
      Affiliate affiliatesInfo = new PartTime();
      affiliatesInfo.createAffiliate();
      id = affiliatesInfo.getId();
      map.put(id, affiliatesInfo);
    }


    while(true){
      System.out.println("\n");
      System.out.println("Type the number of the option you want:" + "\n" + "1) Create an affiliate record" + "\n" +
      "2) Print information for an Affliate given the id" + "\n" + "3) List all affiliates in order of seniority" + "\n" + "4) Delete a record given the id"
      + "\n" + "5) Save your database to a file" + "\n" + "6) Restore database" + "\n" + "7) Exit ");
      System.out.println("");
      int number = scnr.nextInt();
      if (number == 1){
        System.out.println("Pick the number of the affiliate you want to create: 1) Undergradute, 2) Graduate, 3) Assistant, 4) Associate, 5) Full, 6) Full Time, 7) Part Time");
        System.out.println("");
        number2 = scnr.nextInt();
        if(number2 == 1){
          Affiliate affiliatesInfo = new Undergrad();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 2){
          Affiliate affiliatesInfo = new Graduate();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 3){
          Affiliate affiliatesInfo = new Assistant();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 4){
          Affiliate affiliatesInfo = new Associate();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 5){
          Affiliate affiliatesInfo = new Full();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 6){
          Affiliate affiliatesInfo = new FullTime();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
        else if(number2 == 7){
          Affiliate affiliatesInfo = new PartTime();
          affiliatesInfo.createAffiliate();
          id = affiliatesInfo.getId();
          map.put(id, affiliatesInfo);
        }
      }
      else if(number == 2){
        AffiliatesDriver ad = new AffiliatesDriver();
        ad.print();
      }
      else if(number == 3){
        Affiliate[] seniority = new Affiliate[map.size()];
        int counter = 0;
        for(Affiliate a: map.values()){
          seniority[counter] = a;
          counter = counter + 1;
        }
        for(int j = 0; j<seniority.length-1; ++j){
          for(int k = 0; k<seniority.length-1; ++k){
            if(seniority[j].compareTo(seniority[j+1])==1){
              Affiliate item = seniority[j];
              seniority[j]  = seniority[j+1];
              seniority[j+1] = item;
            }
          }
        }
        for(int i = 0; i<seniority.length;++i){
          System.out.println(map.get(seniority[i].getId()));
        }
      }
      else if(number == 4){
        System.out.println("Enter the id of the affiliate that you want to delete: ");
        int id3 = scnr.nextInt();
        map.remove(id3);
      }
      else if (number == 5){
        PrintWriter printRecord = null;
        try{
          System.out.println("What is the desired output file name: ");
          String fileName = scnr.next();
          printRecord = new PrintWriter(new FileWriter(fileName));

          for(Affiliate value: map.values()){
            printRecord.write(value.toString2()+"\n");
          }


        }catch(FileNotFoundException e){
          System.err.println("File not found!");
          System.err.println(e.getMessage());
        }catch(IOException e){
          System.err.println("Error");
          System.err.println(e.getMessage());
        }finally{
          if(printRecord != null){
            printRecord.close();
          }
        }
      }
      else if(number == 6){

        try{
          System.out.println("What is the desired input file name: ");
          String fileName2 = scnr.next();
          BufferedReader br = new BufferedReader(new FileReader(fileName2));

          String currentLine = br.readLine();

          while(currentLine != null){
            String[] inputArray = currentLine.split(", ");
            String person = inputArray[0];

            if(person.equals("Undergraduate Student")){
              Undergrad value1 = new Undergrad(inputArray[1],Integer.parseInt(inputArray[2]),Integer.parseInt(inputArray[3]),Integer.parseInt(inputArray[4]),Integer.parseInt(inputArray[5]),
              (inputArray[6]),inputArray[7],inputArray[8],(inputArray[9]),Integer.parseInt(inputArray[10]),Integer.parseInt(inputArray[11]));
              map.put(value1.getId(),value1);
            }

            else if(person.equals("Graduate Student")){
              Graduate value2 = new Graduate(inputArray[1],Integer.parseInt(inputArray[2]),Integer.parseInt(inputArray[3]),Integer.parseInt(inputArray[4]),(inputArray[5]),
              (inputArray[6]),inputArray[7],Integer.parseInt(inputArray[8]),(inputArray[9]),(inputArray[10]),Integer.parseInt(inputArray[11]));
              map.put(value2.getId(), value2);
            }
            else if(person.equals("Assistant Professor")){
              Assistant value3 = new Assistant(inputArray[1],Integer.parseInt(inputArray[2]),inputArray[3],Integer.parseInt(inputArray[4]),(inputArray[5]),
              Integer.parseInt(inputArray[6]),inputArray[7],Integer.parseInt(inputArray[8]),Integer.parseInt(inputArray[9]),Integer.parseInt(inputArray[10]));
              map.put(value3.getId(), value3);
            }
            else if(person.equals("Associate Professor")){
              Associate value4 = new Associate(inputArray[1],Integer.parseInt(inputArray[2]),inputArray[3],Integer.parseInt(inputArray[4]),(inputArray[5]),
              Integer.parseInt(inputArray[6]),inputArray[7],Integer.parseInt(inputArray[8]),Integer.parseInt(inputArray[9]),Integer.parseInt(inputArray[10]));
              map.put(value4.getId(), value4);
            }
            else if(person.equals("Full Professor")){
              Full value5 = new Full(inputArray[1],Integer.parseInt(inputArray[2]),inputArray[3],Integer.parseInt(inputArray[4]),(inputArray[5]),
              Integer.parseInt(inputArray[6]),inputArray[7],Integer.parseInt(inputArray[8]),Integer.parseInt(inputArray[9]),Integer.parseInt(inputArray[10]));
              map.put(value5.getId(), value5);
            }
            else if(person.equals("FullTime Staff")){
              FullTime value6 = new FullTime(inputArray[1],Integer.parseInt(inputArray[2]),inputArray[3],Integer.parseInt(inputArray[4]),(inputArray[5]),
              (inputArray[6]),inputArray[7],Integer.parseInt(inputArray[8]),Integer.parseInt(inputArray[9]));
              map.put(value6.getId(), value6);
            }
            else if(person.equals("PartTime Staff")){
              PartTime value7 = new PartTime(inputArray[1],Integer.parseInt(inputArray[2]),inputArray[3],Integer.parseInt(inputArray[4]),Integer.parseInt(inputArray[5]),
             (inputArray[6]),inputArray[7],inputArray[8],Integer.parseInt(inputArray[9]));
              map.put(value7.getId(), value7);
            }
            currentLine = br.readLine();
          }
        }
        catch (IOException e){
          System.err.println("Error");
          System.err.println(e.getMessage());
        }
      }
      else if(number == 7){
        System.out.println("You have exited.");
        break;
      }
    }
  }
}
