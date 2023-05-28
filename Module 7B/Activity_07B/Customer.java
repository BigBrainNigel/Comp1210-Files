/**
   Public class that creates a customer object with their name, location, and
   balance as values. Can then set their location, change their balance, get
   their location, get their balance, set their location, and output the 
   information as a string.
   
   @author Gregory Walker - Comp 1210
   @version 10/18/22
*/
public class Customer implements Comparable<Customer> {

   private String customerName, customerLocation;
   private double customerBalance;
   
   /**
      Constructor that creates a customer object with the values of their
      name, location, and balance.
      
      @param nameIn - Takes string input for the name of the customer.
   */
   public Customer(String nameIn) {
   
      customerName = nameIn;
      customerLocation = "";
      customerBalance = 0;
   
   }
   
   /**
      Public method that sets the customers location.
      
      @param locationIn - Takes string input for the location of the customer.
   */
   public void setLocation(String locationIn) {
   
      customerLocation = locationIn;
   
   }
   
   /**
      Public method that changes the customers balance by the input amount.
      
      @param amount - Takes double input for the amount to change the 
      customer's balance by.
   */
   public void changeBalance(double amount) {
   
      customerBalance += amount;
   
   }
   
   /**
      Public method that gets the customers location.
      
      @return String - Returns the customers location as a string.
   */
   public String getLocation() {
   
      return customerLocation;
   
   }
   
   /**
      Public method that gets the customers balance.
      
      @return double - Returns the customers balance as a double.
   */
   public double getBalance() {
   
      return customerBalance;
   
   }
   
   /**
      Public method that sets the customers location.
      
      @param city - Takes string input for the name of the city the customer is
      located in.
      @param state - Takes string input for the name of the state the customer
      is located in.
   */
   public void setLocation(String city, String state) {
   
      customerLocation = city + ", " + state;
   
   }
   
   /**
      Public method that returns the customers name, location, and balance as
      a string.
      
      @return String - Returns the customers name, location, and balance as
      a string.
   */
   public String toString() {
   
      String output = customerName;
      output += ("\n" + customerLocation);
      output += ("\n$" + customerBalance);
      
      return output;
   
   }
   
   /**
      Public method that compares one customer object to another.
      
      @param obj - Takes input as a customer object to compare another
      customer object to.
      @return int - Returns 0, -1, or 1 depending on if the two objects are
      equal, one is less than the other, or one is greater than the other
      respectively.
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.customerBalance - obj.getBalance()) < 0.000001) {
      
         return 0;
      
      }
      else if (this.customerBalance < obj.getBalance()) {
      
         return -1;
      
      }
      else {
      
         return 1;
      
      }
      
   }

}