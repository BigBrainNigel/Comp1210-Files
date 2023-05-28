import java.io.FileNotFoundException;
/**
   Public class that reads a file name from the command line and creates a 
   list of baked item objects using the data from the file found using the
   file name. Then outputs all of the data in that file first unsorted, then
   sorted by class, then by price, then flavor, and then finally outputs all
   of the excluded items.
   
   Project 10
   @author Gregory Walker - Comp 1210
   @version 11/11/22
*/
public class BakeryPart2 {
   
   /**
      Main method that reads a file name from the command line and creates a 
      list of baked item objects using the data from the file found using the
      file name. Then outputs all of the data in that file first unsorted, then
      sorted by class, then by price, then flavor, and then finally outputs all
      of the excluded items.
      
      @param args - Used to read in command line argument for the name of the
      file.
      @throws FileNotFoundException - Exception thrown when the file is not
      found using the input file name.
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      if (args.length == 0) {
      
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      
      }
      else {
      
         String fileName = args[0];
         BakedItemList itemList = new BakedItemList();
         itemList.readItemFile(fileName);
         
         System.out.println(itemList.generateReport());
         System.out.println(itemList.generateReportByClass());
         System.out.println(itemList.generateReportByPrice());
         System.out.println(itemList.generateReportByFlavor());
         System.out.println(itemList.generateExcludedRecordsReport());
      
      }
   
   }

}