/**
   Public class that serves as the parent class for the rest of the classes in
   the project file. Contains a method to get the name, calculate the cost, set
   the tax rate, and output as a string with a toString method.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
      Constructor that serves as the basic constructor for an item and
      also as the super constructor for all of the classes in the project
      file.
      
      @param nameIn - Accepts string input for the name of the item.
      @param priceIn - Accepts double input for the price of the item.
   */
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   
   }
   
   /**
      Public method that fetches and returns the name of the item.
      
      @return String - Returns that name of the item as a string.
   */
   public String getName() {
   
      return name;
   
   }
   
   /**
      Public method that uses the set price and tax rate to calculate the
      cost of the item.
      
      @return double - Returns the price of the item as a double.
   */
   public double calculateCost() {
   
      return (price * (1 + taxRate));
   
   }
   
   /**
      Public method that sets the tax rate to the input double value.
      
      @param taxRateIn - Accepts double input for the tax rate the items
      price will be calculated at.
   */
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   
   }
   
   /**
      Public class that returns the name and price of the item in a string
      format.
      
      @return String - Returns the name and price of the item as a string.
   */
   public String toString() {
   
      return (name + ": $" + calculateCost());
   
   }

}