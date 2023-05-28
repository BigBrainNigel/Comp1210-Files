/**
   Public class that puts all of the classes and their inheritance to use.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public class InventoryApp {
   
   /**
      Public method that puts all of the projects classes and there inheritance
      to use. Creates an invetory item object, an electronic item object, an
      online article object, and an online book object and prints them one at
      a time.
      
      @param args - not used.
   */
   public static void main(String[] args) {
      
      //Setting tax rate for the inventory item.
      InventoryItem.setTaxRate(0.05);
      
      //Creating and printing the inventory item.
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      System.out.println(item1);
      
      //Creating and printing the electronics item.
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      System.out.println(item2);
      
      //Creating and printing the online artcile item.
      OnlineArticle item3 = new OnlineArticle("Java news", 8.50);
      item3.setWordCount(700);
      System.out.println(item3);
      
      //Creating and printing the online book item.
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L.G.Jones");
      System.out.println(item4);
   
   }

}