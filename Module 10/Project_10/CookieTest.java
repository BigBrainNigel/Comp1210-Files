import org.junit.Assert;
import org.junit.Test;

/**
   Public class that tests the BakedItem super class as well as the Cookie
   child class.
   
   @author Gregory Walker - Comp 1210
   @version 11/4/22
*/
public class CookieTest {
   
   /**
      Test method that tests to make sure the correct name is fetched using
      the getName method.
   */
   @Test public void getNameTest() {
      
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertEquals(c1.getName(), "Chips Delight");
   }
   
   /**
      Test method that tests the setName method and makes sure it returns
      sets the name variable to the correct input value.
   */
   @Test public void setNameTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
         
      c1.setName("Chips Undelight");
      Assert.assertEquals(c1.getName(), "Chips Undelight");
   
   }
   
   /**
      Test method that tests to make sure that the getFlavor method correctly
      fetches the correct flavor.
   */
   @Test public void getFlavorTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertEquals(c1.getFlavor(), "Chocolate Chip");
   
   }
   
   /**
      Test method that tests to make sure that the setFlavor method correctly
      sets the flavor to the input string.
   */
   @Test public void setFlavorTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      c1.setFlavor("Chocolate BLOCK");
      Assert.assertEquals(c1.getFlavor(), "Chocolate BLOCK");
   
   }
   
   /**
      Test method that tests to make sure the getQuantity method fetches the
      correct value for the quantity.
   */
   @Test public void getQuantityTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertEquals(c1.getQuantity(), 12);
   
   }
   
   /**
      Test method that tests to make sure the setQuantity method correctly
      sets the quantity to the input value.
   */
   @Test public void setQuantityTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      c1.setQuantity(15);
      Assert.assertEquals(c1.getQuantity(), 15);
   
   }
   
   /**
      Test class that tests to make sure the getIngredients method returns the
      correct values for the list of ingredients.
   */
   @Test public void getIngredientsTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      String[] ingredientsList = {"flour", "sugar", "dark chocolate chips",
         "butter", "baking soda", "salt"};
      
      Assert.assertEquals(c1.getIngredients(), ingredientsList);
   
   }
   
   /**
      Test method that tests to make sure the setIngredients method correctly
      sets the ingredients to the input values.
   */
   @Test public void setIngredientsTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      String[] ingredientsList = {"trash", "peeled banana"};
      
      c1.setIngredients("trash", "peeled banana");
      Assert.assertEquals(c1.getIngredients(), ingredientsList);
   
   }
   
   /**
      Test method that tests to make sure the getCount method correctly returns
      the count of baked items created.
   */
   @Test public void getCountTest() {
      
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
         
      c1.resetCount();
      
      Cookie c2 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertEquals(c2.getCount(), 1);
   
   }
   
   /**
      Test method that tests the resetCount method to make sure it correctly
      resets the count of baked items created to 0.
   */
   @Test public void resetCountTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      c1.resetCount();
      Assert.assertEquals(c1.getCount(), 0);
   
   }
   
   /**
      Test method that tests the toString method to see if it contains part of
      what was input in the constructor, and if it is output correctly.
   */
   @Test public void toStringTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertTrue(c1.toString().contains("Chips Delight"));
   
   }
   
   /**
      Test method that tests the price method to make sure it returns the
      correct price for the quantity of cookies input.
   */
   @Test public void priceTest() {
   
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips", "butter",
         "baking soda", "salt");
      
      Assert.assertEquals(c1.price(), 4.20, 0.0001);
   
   }
   
}
