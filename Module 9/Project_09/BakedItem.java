import java.text.DecimalFormat;
/**
   Public abstract calss that serves as the super class for all baked goods.
   Provides a super constructor, get and set name, get and set flavor, get
   and set quantity, get and set ingredients, get and reset count, a toString
   method, and a price for the item.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public abstract class BakedItem {

   protected String name, flavor;
   protected int quantity;
   protected String[] ingredients;
   protected static int count = 0;
   
   /**
      Constructor that serves as the super constructor for all baked goods.
      
      @param nameIn - Accepts string input for the name of the baked item.
      @param flavorIn - Accepts string input for the flavor the baked item.
      @param quantityIn - Accepts integer input for the quantity of baked
      items.
      @param ingredientsIn - Accepts string input and is a variable length
      parameter for the ingredients to make the baked item.
   */
   public BakedItem(String nameIn, String flavorIn,
      int quantityIn, String...ingredientsIn) {
   
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;
   
   }
   
   /**
      Public method that fetches and returns the name of the baked item.
      
      @return String - Returns a string value for the name of the baked item.
   */
   public String getName() {
   
      return name;
   
   }
   
   /**
      Public method that sets the name of the baked item to the input name.
      
      @param nameIn - Accepts string input for the name of the baked item.
   */
   public void setName(String nameIn) {
   
      name = nameIn;
   
   }
   
   /**
      Public method that fetches and returns the flavor of the baked item.
      
      @return String - Returns a string value for the flavor of the baked item.
   */
   public String getFlavor() {
   
      return flavor;
   
   }
   
   /**
      Public method that sets the flavor of the baked item to the inpot flavor.
      
      @param flavorIn - Accepts string input for the flavor of the baked item.
   */
   public void setFlavor(String flavorIn) {
   
      flavor = flavorIn;
   
   }
   
   /**
      Public method that fetches and returns the quantity of baked items.
      
      @return int - Returns and integer value for the quantity of baked items.
   */
   public int getQuantity() {
   
      return quantity;
   
   }
   
   /**
      Public method that sets the quantity of baked items to the input
      quantity.
      
      @param quantityIn - Accepts int input for the quantity of baked items.
   */
   public void setQuantity(int quantityIn) {
   
      quantity = quantityIn;
   
   }
   
   /**
      Public method that fetches and returns an array of the ingredients
      needed to make the baked item.
      
      @return String[] - Returns a string array value of the ingredients needed
      to make the baked item.
   */
   public String[] getIngredients() {
   
      return ingredients;
   
   }
   
   /**
      Public method that sets the ingredients needed to make the baked item.
      
      @param ingredientsIn - Accepts string input and is a variable length
      parameter for the ingredients to make the baked item. 
   */
   public void setIngredients(String...ingredientsIn) {
   
      ingredients = ingredientsIn;
   
   }
   
   /**
      Public method that fetches and returns the count of the baked items made.
      
      @return int - Returns and integer value for the number of baked items
      made.
   */
   public static int getCount() {
   
      return count;
   
   }
   
   /**
      Public method that resets the count of the number of baked items to zero.
   */
   public static void resetCount() {
   
      count = 0;
   
   }
   
   /**
      Public method that returns a string output of the class name, the name
      of the baked item, the flavor of the baked item, the quantity of the 
      baked item, the price of the baked item, and the ingredients used to
      make the baked item.
      
      @return String - Returns a string containing the name, flavor, quantity,
      price, and ingredients of the baked item.
   */
   public final String toString() {
      
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      String output = this.getClass().toString().substring(6) + ": ";
      output += name + " - " + flavor;
      output += "   Quantity: " + quantity;
      output += "   Price: " + df.format(price());
      output += "\n(Ingredients: ";
      
      for (int i = 0; i < ingredients.length; i++) {
         
         output += ingredients[i];
         
         if (i < ingredients.length - 1) {
         
            output += ", ";
         
         }
         
         if ((i < ingredients.length - 1) && (i > 0) && (i % 4 == 0)) {
            
            output += "\n";
            
         }
      
      }
      
      output += ")";
      
      return output;
   
   }
   
   /**
      Public abstract method serving as a placeholder for the price method
      of the baked item.
      
      @return double - Will return the double value of the price for the baked
      item in child classes.
   */
   public abstract double price();

}