/**
   Public class that creates an electronic item object with a weight and
   set shipping cost. Overrides parent classes calculateCost method to use
   its own.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public class ElectronicsItem extends InventoryItem {

   protected double weight;
   
   /**
      Constant variable that represents the shipping cost for an electronic
      item.
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
      Constructor that creates an electronic item object using the super
      constructor of the InventoryItem class.
      
      @param nameIn - Accepts string input for the name of the item.
      @param priceIn - Accepts double input for the price of the item.
      @param weightIn - Accepts double input for the weight of the item.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      
      weight = weightIn;
   
   }
   
   /**
      Public method that overrides and calculates the cost of the item.
      
      @return double - Returns a double value for the price of the electronic
      item.
   */
   public double calculateCost() {
   
      return (super.calculateCost() + (SHIPPING_COST * weight));
   
   }

}