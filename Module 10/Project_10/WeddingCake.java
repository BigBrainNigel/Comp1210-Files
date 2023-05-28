/**
   Public class that is a child of the Cake class. Has a name, falvor,
   quantity of cakes, number of layers, number of tiers, and a list of
   ingredients to make the cake. Includes methods to get the number of
   tiers, set the number of tiers, and calculate the price of the cake(s).
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class WeddingCake extends Cake {

   private int tiers;
   
   /**
      Public static final variable for the base rate for the price
      of a wedding cake.
   */
   public static final double BASE_RATE = 15.0;
   
   /**
      Constructor that creates a wedding cake object using the super
      constructor from the parent Cake class. Has a unique variable for 
      the number of tiers in the cake.
      
      @param nameIn - Accepts string input for the name of the cake.
      @param flavorIn - Accepts string input for the flavor of the cake.
      @param quantityIn - Accepts integer input for the quantity of cakes.
      @param layersIn - Accepts integer input for the number of layers in the
      cake.
      @param tiersIn - Accepts integer input for the number of tiers the cake
      has.
      @param ingredientsIn - Accepts variable length string input for the
      ingredients used to create the pie.
   */
   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
   
      tiers = tiersIn;
   
   }
   
   /**
      Public method that fetches and returns the number of tiers that the cake
      has.
      
      @return int - Returns an integer value for the number of tiers the cake
      has.
   */
   public int getTiers() {
   
      return tiers;
   
   }
   
   /**
     Public method that sets the number of tiers on the cake to the input
     number of tiers on the cake.
     
     @param tiersIn - Accepts integer value for the number of tiers on the
     cake. 
   */
   public void setTiers(int tiersIn) {
   
      tiers = tiersIn;
   
   }
   
   /**
      Public method that calculates and returns the price of the cake(s).
      Uses the base rate of the cakes, the number of layers, the number of
      tiers, and the quantity of cakes to find the price.
      
      @return double - Returns a double value for the price of the cake(s).
   */
   public double price() {
   
      return ((BASE_RATE * layers * tiers) * quantity); 
   
   }
   
}