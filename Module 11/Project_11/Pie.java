/**
   Public child class of the parent class BakedItem. Creates a baked item
   object with the unique variable crustCost. Has methods to get and set
   the crust cost, as well as calculate the price.
   
   Project 11
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class Pie extends BakedItem {

   private double crustCost;
   
   /**
      Public static final variable for the base rate for the price
      of a pie.
   */
   public static final double BASE_RATE = 12.0;
   
   /**
      Constructor that creates a pie item with a name, flavor, quantity, crust
      cost, and list of ingredients to make the pie. Uses the super constructor
      from the parent class BakedItem.
      
      @param nameIn - Accepts string input for the name of the pie.
      @param flavorIn - Accepts string input for the flavor of the pie.
      @param quantityIn - Accepts integer input for the quantity of pies.
      @param crustCostIn - Accepts double input for the cost of the crust of
      the pie.
      @param ingredientsIn - Accepts variable length string input for the
      ingredients used to create the pie.
   */
   public Pie(String nameIn, String flavorIn, int quantityIn,
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      
      crustCost = crustCostIn;
   
   }
   
   /**
      Public method that finds the price of the pie(s).
      
      @return double - Returns the double value of the price of the pie(s).
   */
   public double price() {
   
      return ((BASE_RATE + crustCost) * quantity);
   
   }
   
   /**
      Public method that fetches and returns the cost of the crust for the 
      pie.
      
      @return double - Returns the double calue of the cost for the crust of
      the pie.
   */
   public double getCrustCost() {
   
      return crustCost;
   
   }
   
   /**
      Public method that sets the crust cost to the input number.
      
      @param crustCostIn - Accepts double input for the cost of the crust
      of the pie.
   */
   public void setCrustCost(double crustCostIn) {
   
      crustCost = crustCostIn;
   
   }

}