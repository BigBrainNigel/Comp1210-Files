/**
   Public class with methods used to gather user information and output it in a
   print statement.
   
   @author Gregory Walker - Comp 1210
   @version 9/12/22
*/
public class UserInfo {

   //instance variables
   private String firstName = ("");
   private String lastName = ("");
   private String location = ("");
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   //constructors
   /**
      Constructor for the UserInfo class. Initializes variables.
      
      @param firstNameIn - Input for users first name
      @param lastNameIn - Input for users last name
   */
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }
   
   //methods
   /**
      Gets an input for user location and sets it to location variable.
      
      @param locationIn - Input for users location 
   */
   public void setLocation(String locationIn) {
   
      location = locationIn;
   
   }
   
   /**
      Sets string format for output print statement. Also checks if 
      user status is set to online or offline.
      
      @return String - Returns "output" as a string
   */
   public String toString() {
   
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
      
         output += "Offline";
      
      }
      else {
      
         output += "Online";
      
      }
      
      return output;
   
   }
   
   /**
      Gather input for user age and checks if the age is > 0. 
      If so, age is set to the users input for age.
      
      @param ageIn - Input for users age
      @return boolean - returns a boolean value for isSet
   */
   public boolean setAge(int ageIn) {
   
      boolean isSet = false;
      if (ageIn > 0) {
      
         age = ageIn;
         isSet = true;
      
      }
      return isSet;
   
   }
   
   /**
      Fetches and returns user age.
      
      @return int - Returns age as an integer
   */
   public int getAge() {
   
      return age;
   
   }
   
   /**
      Fetches and returns user location.
      
      @return String - Returns location as a string
   */
   public String getLocation() {
   
      return location;
   
   }
   
   /**
      Sets user status to OFFLINE.
   */
   public void logOff() {
   
      status = OFFLINE;
   
   }
   
   /**
      Sets user status to ONLINE.
   */
   public void logOn() {
   
      status = ONLINE;
   
   }
}