/**
   Public class that creates the bases for the online text items such as
   books and articles.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
      Constructor that serves as the foundation for online text items.
      Uses the super constructor from InventoryItem.
      
      @param nameIn - Accepts string input for the name of the item.
      @param priceIn - Accepts double input for the price of the item.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   
   }
   
   /**
      Public method that overrides the calculateCost method in InventoryItem
      and ElectronicsItem and just returns the base price of the item.
      
      @return double - Returns the double value of the price of the item.
   */
   public double calculateCost() {
   
      return price;
   
   }

}