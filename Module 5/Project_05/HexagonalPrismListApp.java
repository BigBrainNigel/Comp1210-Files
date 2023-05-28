import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
   Program that reads data from a file by taking the file name as input and
   then reading the data from the file. It then creates and array list of
   HexagonalPrism objects and prints out the information for each of them
   and a summary of their data including total surface area, total volume,
   average surface area, averag volume, and number of prisms.
   
   @author Gregory Walker - Comp 1210
   @version 9/22/22
*/
public class HexagonalPrismListApp {
   /**
      Method that reads input from a file and gathers information about
      hexagonal prism objects. Then displays the information and summary
      of those objects.
      
      @param args - not used
      @throws FileNotFoundException - Throws exception if exception is found
   */
   public static void main(String[] args) throws FileNotFoundException {
      
      String fileName = "", label = "", listName = "";
      double edge = 0, height = 0;
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      fileName = userInput.nextLine();
      System.out.println("");
      
      Scanner fileInput = new Scanner(new File(fileName));
      listName = fileInput.nextLine();
      
      ArrayList<HexagonalPrism> hexPrismArrayList = 
         new ArrayList<HexagonalPrism>();
      
      while (fileInput.hasNext()) {
      
         label = fileInput.nextLine();
         edge = Double.parseDouble(fileInput.nextLine());
         height = Double.parseDouble(fileInput.nextLine());
         
         HexagonalPrism hexPrism = new HexagonalPrism(label, edge, height);
         hexPrismArrayList.add(hexPrism);
         
      
      }
      
      HexagonalPrismList hexPrismList = new HexagonalPrismList(listName, 
         hexPrismArrayList);
         
      System.out.println(hexPrismList.toString());
      System.out.println("");
      System.out.println(hexPrismList.summaryInfo());
   
   }

}