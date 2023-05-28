/**
   Public child class that creates a cake item using the parent class
   BakedItem. Cake item has a name, flavor, quantity, number of layers, and
   a list of ingredients used to create the cake.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class Cake extends BakedItem {

   protected int layers;
   
   /**
      Public static final variable for the base rate for the price
      of a cake.
   */
   public static final double BASE_RATE = 8.0;
   
   /**
      Constructor that creates a cake object using the super constructor from
      the parent BakedItem class. Has a unique variable for the number of
      layers in the cake.
      
      @param nameIn - Accepts string input for the name of the cake.
      @param flavorIn - Accepts string input for the flavor of the cake.
      @param quantityIn - Accepts integer input for the quantity of cakes.
      @param layersIn - Accepts integer input for the number of layers in the
      cake.
      @param ingredientsIn - Accepts variable length string input for the
      ingredients used to create the pie.
   */
   public Cake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      
      layers = layersIn;
   
   }
   
   /**
      Public method that fetches and returns the number of layers in the cake.
      
      @return int - Returns an integer value for the number of layers in the 
      cake.
   */
   public int getLayers() {
   
      return layers;  
   
   }
   
   /**
      Public method that sets the number of layers in the cake to the input
      number.
      
      @param layersIn - Accepts integer value for the number of layers in the
      cake. 
   */
   public void setLayers(int layersIn) {
   
      layers = layersIn;
   
   }
   
   /**
      Public method that finds the price of the cake.
      
      @return double - Returns a double value for the price of the cake
      using the base rate, quantity of cakes, and number of layers in each
      cake.
   */
   public double price() {
   
      return ((BASE_RATE * layers) * quantity);
   
   }

}