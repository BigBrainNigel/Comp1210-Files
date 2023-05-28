import org.junit.Assert;
import org.junit.Test;
/**
   Public test class that tests the Cake class, which is a child class of the
   BakedItem class.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class CakeTest {
   
   /**
      Test method that tests the getLayers class to make sure it returns
      the correct number of cake layers.
   */
   @Test public void getLayersTest() {
   
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, "flour", "sugar",
         "cocoa powder", "vanilla", "eggs", "butter", "baking soda",
         "baking powder", "salt");
   
      Assert.assertEquals(c1.getLayers(), 1);
      
   }
   
   /**
      Test method that tests the setLayers method and makes sure it corectly
      sets the number of cake layers to the input integer.
   */
   @Test public void setLayersTest() {
   
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, "flour", "sugar",
         "cocoa powder", "vanilla", "eggs", "butter", "baking soda",
         "baking powder", "salt");
      
      c1.setLayers(5);
      Assert.assertEquals(c1.getLayers(), 5);
      
   }
   
   /**
      Test method that tests the price method to make sure it calculates and
      returns the correct price for the quantity and layers of the cake(s).
   */
   @Test public void priceTest() {
   
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, "flour", "sugar",
         "cocoa powder", "vanilla", "eggs", "butter", "baking soda",
         "baking powder", "salt");
   
      Assert.assertEquals(c1.price(), 8.00, 0.0001);
      
   }
   
}
