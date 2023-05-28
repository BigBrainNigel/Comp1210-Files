/**
   Public child class of the BakeItem parent class. Creates a cookie baked item
   with a name, flavor, quantity, and ingredients list. Also finds the price of
   the cookies.
   
   Project 11
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class Cookie extends BakedItem {
   
   /**
      Public static final variable for the base rate for the price
      of cookies.
   */
   public static final double BASE_RATE = 0.35;
   
   /**
      Constructor that creates a cookie item with a name, flavor, quantity, and
      list of ingredients to create it. Uses the super constructor from the
      parent class BakedItem.
      
      @param nameIn - Accepts string input for the name of the cookie.
      @param flavorIn - Accepts string input for the flavor of the cookie.
      @param quantityIn - Accepts integer input for the quantity of cookies.
      @param ingredientsIn - Accepts string variable length input for the 
      ingredients needed to make the cookie(s).
   */
   public Cookie(String nameIn, String flavorIn,
      int quantityIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   
   }
   
   /**
      Public method that finds the price of the cookies.
      
      @return double - Returns the double value of the price of the cookies.
   */
   public double price() {
   
      return (BASE_RATE * quantity);
   
   }

}