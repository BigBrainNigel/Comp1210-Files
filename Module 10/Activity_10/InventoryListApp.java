/**
   Public class that makes use of the ItemsList class to crate a list of
   different items and print them. Also calculates the total cost of all
   of the items in the list.
   
   @author Gregory Walker - Comp 1210
   @version 11/8/22
*/
public class InventoryListApp {
   
   /**
      Public main method that creates a new ItemList object, sets the base
      tax rate, and adds items to the item list. Then prints the items
      in order, and calcualtes the total cost of all items together.
      
      @param args - Not used
   */
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   
   }

}