/**
   Public class that creates an array of input items. Can add items after
   the initalization of the object using the addItem method, and can also
   calculate the total cost of all of the items, and display as a string.
   
   @author Gregory Walker - Comp 1210
   @version 11/8/22
*/
public class ItemsList {

   private InventoryItem[] inventory;
   private int count;
   
   /**
      Constructor that creates a blank array that is 20 elements long. Also
      initializes count to 0.
   */
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   
   }
   
   /**
      Public class that adds an item to the inventory array. Increments count
      by one afterwards.
      
      @param itemIn - Accepts InventoryItem object input to be added to the
      inventory array.
   */
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
   
   }
   
   /**
      Public method that calculates the total cost of the items in the array.
      
      @param electronicsSurcharge - Accepts double input for the surcharge 
      for electronic items.
      @return double - Returns a double value for the total cost of all of the
      items in the array.
   */
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
         
            total += inventory[i].calculateCost() + electronicsSurcharge;
         
         }
         else {
         
            total += inventory[i].calculateCost();
         
         }
      
      }
      
      return total;
   
   }
   
   /**
      Public method that outputs all of the items in the inventory array.
      
      @return String - Returns a string with all of the items in the inventory
      array listed.
   */
   public String toString() {
   
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
      
         output += inventory[i] + "\n";
      
      }
      
      return output;
   
   }

}