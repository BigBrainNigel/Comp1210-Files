import java.io.FileNotFoundException;
/**
   Public class that reads a file name from the command line and creates a 
   list of baked item objects using the data from the file found using the
   file name. Then outputs all of the data in that file first unsorted, then
   sorted by class, then by price, then flavor, and then finally outputs all
   of the excluded items. Edited in project 11 to try and catch the 
   FileNotFoundException while the file name is being read in instead of
   throwing it in the method declaration and printing out the call stack.
   Instead of the call stack being printed, the filename is stated as not being
   found and the program is exited.
   
   Project 11
   @author Gregory Walker - Comp 1210
   @version 11/11/22
*/
public class BakeryPart3 {
   
   /**
      Main method that reads a file name from the command line and creates a 
      list of baked item objects using the data from the file found using the
      file name. Then outputs all of the data in that file first unsorted, then
      sorted by class, then by price, then flavor, and then finally outputs all
      of the excluded items. Edited in project 11 to try and catch the 
      FileNotFoundException while the file name is being read in and print out
      that the file name cannot be found instead of the call stack. Then exits
      the program.
      
      @param args - Used to read in command line argument for the name of the
      file.
   */

   public static void main(String[] args) {
   
      if (args.length == 0) {
      
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      
      }
      else {
      
         String fileName = args[0];
         BakedItemList itemList = new BakedItemList();
         
         try {
         
            itemList.readItemFile(fileName);
         
         }
         catch (FileNotFoundException e) {
         
            System.out.println("Attempted to read file: " + fileName
               + " (No such file or directory)");
            System.out.println("Program ending.");
            return;
            
         }
         
         System.out.println(itemList.generateReport());
         System.out.println(itemList.generateReportByClass());
         System.out.println(itemList.generateReportByPrice());
         System.out.println(itemList.generateReportByFlavor());
         System.out.println(itemList.generateExcludedRecordsReport());
      
      }
   
   }

}