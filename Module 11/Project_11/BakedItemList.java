import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
   Public class that creates a list of baked item objects. Includes methods to
   get the list name, set the list name, get the list of items, set the list of
   items, get the count of items, set the count of items, get the excluded
   records, set the excluded records, get the excluded count, set the excluded
   count, get the list count, reset the list count, read a file of items and
   create baked items and add them to a list from all of the data, generate
   a report of the data as the data is presented, generate a report sorted
   by the class, generate a report sorted by the price, generate a report
   sorted by the flavor, and finally generate a report of the excluded
   items. Edited in project 11 to try and catch the exceptions 
   InvalidCategoryException, NoSuchElemntException, and NumberFormatException
   in the readItemFile method.
   
   Project 11
   @author Gregory Walker - Comp 1210
   @version 11/11/22
*/
public class BakedItemList {

   private String listName;
   private BakedItem[] itemList;
   private int itemCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   
   /**
      Constructor that creates a list of baked item objects. Initializes the
      name to blank, sets the number of spaces in the list array to 100, sets
      the initial item count to 0, sets the number of spaces in the excluded
      records array to 30, and sets excluded count to 0. Also increments
      listCount by one.
   */
   public BakedItemList() {
   
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      
      listCount++;
   
   }
   /**
      Public method that fetches and returns the name of the list.
      
      @return String - Returns the name of the list as a string value.
   */
   public String getListName() {
   
      return listName;
   
   }
   
   /**
      Public method that sets the name of the list to the input value.
      
      @param nameIn - Accepts string input for the name you want to set the
      list to.
   */
   public void setListName(String nameIn) {
   
      listName = nameIn;
   
   }
   
   /**
      Public method that fetches and returns the item list.
      
      @return BakedItem[] - Returns a BakedItem[] value for the item list.
   */
   public BakedItem[] getItemList() {
   
      return itemList;
   
   }
   
   /**
      Public method that sets the value of the list to the input value.
      
      @param itemIn - Accepts BakedItem[] input for the array you want to set
      the item list to.
   */
   public void setItemList(BakedItem[] itemIn) {
   
      itemList = itemIn;
   
   }
   
   /**
      Public method that fetches and returns the item count.
      
      @return int - Returns an int value for the item count.
   */
   public int getItemCount() {
   
      return itemCount;
   
   }
   
   /**
      Public method that sets the value of the item count to the input number.
      
      @param countIn - Accepts integer input for the number you want to set
      the item count to.
   */
   public void setItemCount(int countIn) {
   
      itemCount = countIn;
   
   }
   
   /**
      Public method that fetches and returns the excluded records.
      
      @return String[] - Returns a String[] value for the excluded records.
   */
   public String[] getExcludedRecords() {
   
      return excludedRecords;
   
   }
   
   /**
      Public method that sets the excluded records to the input String[].
      
      @param excludedRecordsIn - Accepts String[] input for the value you want
      to set excluded records to. 
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
   
      excludedRecords = excludedRecordsIn;
   
   }
   
   /**
      Public method that fetches and returns the number of excluded records.
      
      @return int - Returns an integer value for the number of excluded 
      records.
   */
   public int getExcludedCount() {
   
      return excludedCount;
     
   }
   
   /**
      Public method that sets the excluded count to the input integer value.
      
      @param excludedCountIn - Accepts integer value for the number of
      exlcluded records.
   */
   public void setExcludedCount(int excludedCountIn) {
   
      excludedCount = excludedCountIn;
   
   }
   
   /**
      Public method that fetches and returns the number of lists created.
      
      @return int - Returns an integer value for the number of lists created.
   */
   public static int getListCount() {
   
      return listCount;
   
   }
   
   /**
      Public method that resets the list count back to zero.
   */
   public static void resetListCount() {
   
      listCount = 0;
   
   }
   
   /**
      Public method that reads an input file sets the list name, and then
      creates a baked item object for each line of data in the file, then
      adds each created object to a baked item list. If the object is not able
      to be created, it will flag that line as invalid and add it to the
      excluded records array, and increment the excluded records count by one.
      Edited in project 11 to try and catch the exceptions 
      InvalidCategoryException, NoSuchElemntException, and
      NumberFormatException.
      
      
      @param fileNameIn - Accepts string input for the name of the file that
      the baked item data is to be read from.
      @throws FileNotFoundException - Exception thrown if the file is not found
      in the current directory.
   */
   public void readItemFile(String fileNameIn) throws FileNotFoundException {
      String fileName = fileNameIn;
      String currentLine = "";
      Scanner fileScanner = new Scanner(new File(fileName));
      String[] tempIngredients = new String[50];
      String[] ingredients;
      BakedItem[] tempItemList = new BakedItem[100];
      
      if (fileScanner.hasNext()) {
         setListName(fileScanner.nextLine());
      }
      
      while (fileScanner.hasNext()) {
         try { 
            currentLine = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(currentLine);
            lineScanner.useDelimiter(",");
            String choice = lineScanner.next();
            String name = lineScanner.next();
            String flavor = lineScanner.next();
            int quantity = Integer.parseInt(lineScanner.next());
            int i = 0;
            double crustCost;
            int layers;
            int tiers;
            
            switch (choice) {
            
               case "C":
                  
                  while (lineScanner.hasNext()) {
                  
                     tempIngredients[i] = lineScanner.next();
                     
                     i++;
                  
                  }
                  
                  ingredients = Arrays.copyOf(tempIngredients, i);
                  
                  Cookie cookieObj = new Cookie(name, flavor,
                     quantity, ingredients);
                  
                  tempItemList = itemList;
                  tempItemList[itemCount] = cookieObj;
                  setItemList(tempItemList);
                  setItemCount(itemCount + 1);
                  
                  break;
                  
               case "P":
                  
                  crustCost = Double.parseDouble(lineScanner.next());
                  
                  while (lineScanner.hasNext()) {
                  
                     tempIngredients[i] = lineScanner.next();
                     
                     i++;
                  
                  }
                  
                  ingredients = Arrays.copyOf(tempIngredients, i);
                  
                  Pie pieObj = new Pie(name, flavor, quantity,
                     crustCost, ingredients);
                  
                  tempItemList = itemList;
                  tempItemList[itemCount] = pieObj;
                  setItemList(tempItemList);
                  setItemCount(itemCount + 1);
                  
                  break;
              
               case "K":
               
                  layers = Integer.parseInt(lineScanner.next());
                  
                  while (lineScanner.hasNext()) {
                  
                     tempIngredients[i] = lineScanner.next();
                     
                     i++;
                  
                  }
                  
                  ingredients = Arrays.copyOf(tempIngredients, i);
                  
                  Cake cakeObj = new Cake(name, flavor, quantity,
                     layers, ingredients);
                  
                  tempItemList = itemList;
                  tempItemList[itemCount] = cakeObj;
                  setItemList(tempItemList);
                  setItemCount(itemCount + 1);
                  
                  break;
                  
               case "W":
                  
                  layers = Integer.parseInt(lineScanner.next());
                  tiers = Integer.parseInt(lineScanner.next());
                  
                  while (lineScanner.hasNext()) {
                  
                     tempIngredients[i] = lineScanner.next();
                     
                     i++;
                  
                  }
                  
                  ingredients = Arrays.copyOf(tempIngredients, i);
                  
                  WeddingCake weddingCakeObj = new WeddingCake(name, flavor,
                     quantity, layers, tiers, ingredients);
                  
                  tempItemList = itemList;
                  tempItemList[itemCount] = weddingCakeObj;
                  setItemList(tempItemList);
                  setItemCount(itemCount + 1);
                  
                  break;
                  
               default:
                  
                  throw new InvalidCategoryException(choice);
         
            }
         
         }
         catch (InvalidCategoryException e) {
            excludedRecords[excludedCount] = 
               ("*** " + e + " in:\n" + currentLine);
            setExcludedCount(excludedCount + 1);
         }
         catch (NumberFormatException e) {
            excludedRecords[excludedCount] = 
               ("*** " + e + " in:\n" + currentLine);
            setExcludedCount(excludedCount + 1);
         }
         catch (NoSuchElementException e) {
            excludedRecords[excludedCount] = 
               ("*** " + e + " in:\n" + currentLine);    
            setExcludedCount(excludedCount + 1);
         }
      
      }
        
   }
   
   /**
      Public method that outputs the list name and all of the data contained
      within the item list unsorted and in the order originally input.
      
      @return String - Returns a string value for all of the data in the
      item list in the order originally input.
   */
   public String generateReport() {
      
      String output = ("\n---------------------------------------\n");
      output += ("Report for " + listName);
      output += ("\n---------------------------------------\n");
      BakedItem[] reportItemList;
      reportItemList = Arrays.copyOf(itemList, itemCount);
      
      for (BakedItem item : reportItemList) {
      
         output += "\n" + item.toString() + "\n";
      
      }
      
      return output;
      
   }
   
   /**
      Public method that outputs the list name and all of the data contained
      within the item list sorted by class name.
      
      @return String - Returns a string value for all of the data in the
      item list sorted by class name.
   */
   public String generateReportByClass() {
   
      String output = ("\n---------------------------------------\n");
      output += ("Report for " + listName + " (by Class)");
      output += ("\n---------------------------------------\n");
      BakedItem[] reportItemList;
      reportItemList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(reportItemList);
      
      for (BakedItem item : reportItemList) {
      
         output += "\n" + item.toString() + "\n";
      
      }
      
      return output;

   
   }
   
   /**
     Public method that outputs the list name and all of the data contained
      within the item list sorted by price.
      
      @return String - Returns a string value for all of the data in the
      item list sorted by price.
   */
   public String generateReportByPrice() {
   
      String output = ("\n---------------------------------------\n");
      output += ("Report for " + listName + " (by Price)");
      output += ("\n---------------------------------------\n");
      BakedItem[] reportItemList;
      reportItemList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(reportItemList, new PriceComparator());
      
      for (BakedItem item : reportItemList) {
      
         output += "\n" + item.toString() + "\n";
      
      }
      
      return output;
   
   }
   
   /**
      Public method that outputs the list name and all of the data contained
      within the item list sorted by flavor.
      
      @return String - Returns a string value for all of the data in the
      item list sorted by flavor.
   */
   public String generateReportByFlavor() {
   
      String output = ("\n---------------------------------------\n");
      output += ("Report for " + listName + " (by Flavor)");
      output += ("\n---------------------------------------\n");
      BakedItem[] reportItemList;
      reportItemList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(reportItemList, new FlavorComparator());
      
      for (BakedItem item : reportItemList) {
      
         output += "\n" + item.toString() + "\n";
      
      }
      
      return output;
   
   }
   
   /**
      Public method that outputs all of the excluded reports.
      
      @return String - Returns a string value for all of the excluded reports.
   */
   public String generateExcludedRecordsReport() {
   
      String output = ("\n---------------------------------------\n");
      output += ("Excluded Records Report");
      output += ("\n---------------------------------------\n");
      String[] reportExcludedRecords;
      reportExcludedRecords = Arrays.copyOf(excludedRecords, excludedCount);
      
      for (String item : reportExcludedRecords) {
      
         output += "\n" + item.toString();
      
      }
      
      return output;

   
   }
   
}