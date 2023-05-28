import org.junit.Assert;
import org.junit.Test;

/**
   Public test class that tests the Pie class, which is a child class of the 
   BakedItems class.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class PieTest {
   
   /**
      Test method that tests the getCrustCost method to make sure the 
      correct crust cost is returned.
   */
   @Test public void getCrustCostTest() {
      
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, "flour", "sugar",
         "apples", "cinnamon", "butter", "baking soda", "salt");
      
      Assert.assertEquals(p1.getCrustCost(), 0, 0.0001);
      
   }
   
   /**
      Test method that tests the setCrustCost method to make sure that it sets
      the crust cost to the input value.
   */
   @Test public void setCrustCostTest() {
   
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, "flour", "sugar",
         "apples", "cinnamon", "butter", "baking soda", "salt");
      
      p1.setCrustCost(2.0);
      Assert.assertEquals(p1.getCrustCost(), 2.0, 0.0001);
   
   }
   
   /**
      Test method that tests to make sure the price calculated by the 
      price method is correct.
   */
   @Test public void priceTest() {
   
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, "flour", "sugar",
         "apples", "cinnamon", "butter", "baking soda", "salt");
      
      Assert.assertEquals(p1.price(), 12.00, 0.0001);
   
   }
   
}
