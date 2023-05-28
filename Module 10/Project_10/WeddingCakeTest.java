import org.junit.Assert;
import org.junit.Test;
/**
   Public test class that tests the WeddingCake class, which is a child class
   of the Cake class.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class WeddingCakeTest {
   
   /**
      Test method that tests the getTiers method and makes sure it returns the
      correct number of tiers on the cake.
   */
   @Test public void getTiersTest() {
      
      WeddingCake c1 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee", "eggs", "butter",
         "baking soda", "baking powder", "salt");
      
      Assert.assertEquals(c1.getTiers(), 3);
      
   }
   
   /**
      Test method that tests the setTiers method and makes sure it sets the
      tiers of the cake to the input number of tiers.
   */
   @Test public void setTiersTest() {
      
      WeddingCake c1 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee", "eggs", "butter",
         "baking soda", "baking powder", "salt");
      
      c1.setTiers(10);
      Assert.assertEquals(c1.getTiers(), 10);
      
   }
   
   /**
      Test method that tests the price method to make sure it calculates and
      returns the correct price the wedding cake(s).
   */
   @Test public void priceTest() {
      
      WeddingCake c1 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee", "eggs", "butter",
         "baking soda", "baking powder", "salt");
      
      Assert.assertEquals(c1.price(), 135.00, 0.0001);
   }
   
}
