import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
   Class that can create and modify a list of Hexagonal Prisms using the
   HexagonalPrism class. Can also find the name of the list of prisms, the
   number in the list, the total surface area, the total volume, the average
   surface area, the average volume, return a string of the information, and 
   a summary of all of the information.
   
   @author Gregory Walker - Comp 1210
   @version 9/22/22
*/
public class HexagonalPrismList {
   
   //Setting instance variables
   private String nameList = "";
   private ArrayList<HexagonalPrism> hexPrismList;
   
   /**
      Constructor for the class HexagonalPrismList.
      
      @param nameOfList - Takes a string input for the name of the list of 
      prisms.
      @param prismListIn - takes an ArrayList input of generic type 
      HexagonalPrism to input into list.
   */
   public HexagonalPrismList(String nameOfList, 
      ArrayList<HexagonalPrism> prismListIn) {
   
      nameList = nameOfList;
      hexPrismList = prismListIn;
   
   }
   /**
      Public method that fetches the name of the list.
      
      @return String - Returns the name of the list as a string.
   */
   public String getName() {
   
      return nameList;
   
   }
   /**
      Public method that returns the number of prisms in the list.
      
      @return int - Returns and integer of the number of prisms in the list.
   */
   public int numberOfHexagonalPrisms() {
   
      int hexPrismListLen = 0;
      
      hexPrismListLen = hexPrismList.size();
     
      return hexPrismListLen;
   
   }
   /**
      Public method that finds the total surface area of all of the 
      prisms in the list.
      
      @return double - Returns a double value for the total surface area of 
      all of the prisms in the list.
   */
   public double totalSurfaceArea() {
   
      double totalArea = 0;
      int i = 0;
      HexagonalPrism tempPrism = new HexagonalPrism("", 0, 0);
   
      if (hexPrismList.size() > 0) {
      
         while (i < hexPrismList.size()) {
            
            tempPrism = hexPrismList.get(i);
            totalArea += tempPrism.surfaceArea();
            i++;
         
         }
         
      }
   
      return totalArea;
   }
   /**
      Public method that finds the total volume of all of the hexagonal
      prisms in the list.
      
      @return double - Returns a double value for the total volume of all of
      the prisms in the list.
   */
   public double totalVolume() {
   
      double totalVol = 0;
      int i = 0;
      HexagonalPrism tempPrism = new HexagonalPrism("", 0, 0);
      
      if (hexPrismList.size() > 0) {
      
         while (i < hexPrismList.size()) {
         
            tempPrism = hexPrismList.get(i);
            totalVol += tempPrism.volume();
            i++;
         
         }
      
      }
      
      return totalVol;
   
   }
   /**
     Public method that finds the average surface area of all of the prisms
     in the list.
     
     @return double - Returns the value of the average surface area of all
     of the prisms in the list.
   */
   public double averageSurfaceArea() {
      
      double averageSA = 0;
      HexagonalPrismList tempHexPrismList = 
         new HexagonalPrismList("", hexPrismList);
      
      if (hexPrismList.size() > 0) {
      
         averageSA = (tempHexPrismList.totalSurfaceArea() 
            / hexPrismList.size());
      
      }
      
      return averageSA;
   
   }
   /**
      Public method that finds the average volume of all of the prisms in the
      list.
      
      @return double - Returns the value of the average volume of all of the 
      prisms in the list.
   */
   public double averageVolume() {
      
      double averageVol = 0;
      HexagonalPrismList tempHexPrismList = 
         new HexagonalPrismList("", hexPrismList);
      
      if (hexPrismList.size() > 0) {
      
         averageVol = (tempHexPrismList.totalVolume() / hexPrismList.size());
      
      }
      
      return averageVol;
   }
   /**
      Public method that converts information found about HexagonalPrism 
      objects to a string.
      
      @return String - Returns value of variable output as a string.
   */
   public String toString() {
   
      String output = "";
      int i = 0;
      HexagonalPrism tempPrism = new HexagonalPrism("", 0, 0);
      
      output = ("----- " + nameList + " -----\n");
      while (i < hexPrismList.size()) {
      
         tempPrism = hexPrismList.get(i);
         output += "\n" + tempPrism.toString();
         
         i++;
         
      }
      
      return output;
   
   }
   /**
      Public method that returns summary of information found in this class
      such as the name of the list, the number of prisms, the total surface
      area of the prisms, the total volume, the average surface area, and
      the average volume.
      
      @return Returns value of the variable output as a string.
   */
   public String summaryInfo() {
        
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      int i = 0;
      HexagonalPrism tempPrism = new HexagonalPrism("", 0, 0);
      
      String output = ("----- Summary for " + nameList + " -----\n");
      output += ("Number of HexagonalPrisms: " 
         + numberOfHexagonalPrisms() + "\n");
      output += ("Total Surface Area: " 
         + df.format(totalSurfaceArea()) + " square units\n");
      output += ("Total Volume: " 
         + df.format(totalVolume()) + " cubic units\n");
      output += ("Average Surface Area: " 
         + df.format(averageSurfaceArea()) + " square units\n");
      output += ("Average Volume: " 
         + df.format(averageVolume()) + " cubic units\n");
      
      return output;
     
   }
   /**
      Public method that fetches the list of hexagonalprisms.
      
      @return ArrayList - returns an array list of hexagonalprism objects.
   */
   public ArrayList<HexagonalPrism> getList() {
   
      return hexPrismList;
   
   }
   /**
      Public method that reads in a file and uses information to create a list
      of hexagonalPrism objects.
      
      @param fileNameIn - Takes input for the name of the file as a string.
      @return HexagonalPrismList - Returns a hexagonalPrismList with all of the
      hexagonalPrism objects read in from the input file.
      @throws FileNotFoundException - throws exception if file is not found 
   */
   public HexagonalPrismList readFile(String fileNameIn) 
      throws FileNotFoundException {
   
      String listName = "", label = "";
      double edge = 0, height = 0;
      
      ArrayList<HexagonalPrism> tempHexPrismArrayList 
         = new ArrayList<HexagonalPrism>();
      
      Scanner fileInput = new Scanner(new File(fileNameIn));
      listName = fileInput.nextLine();
      
      while (fileInput.hasNext()) {
      
         label = fileInput.nextLine();
         edge = Double.parseDouble(fileInput.nextLine());
         height = Double.parseDouble(fileInput.nextLine());
         
         HexagonalPrism hexPrism = new HexagonalPrism(label, edge, height);
         tempHexPrismArrayList.add(hexPrism);
      
      }
      
      HexagonalPrismList hexList 
         = new HexagonalPrismList(listName, tempHexPrismArrayList);
         
      return hexList;
      
   }
   /**
      Public method that creats a hexagonalPrism object and adds it to
      the existing hexagonalPrismList.
      
      @param label - Takes input for the label of the object as a string.
      @param edge - Takes input for the edge length of the object as a double.
      @param height - Takes input for the height length of the object 
      as a double.
   */
   public void addHexagonalPrism(String label, double edge, double height) {
      
      HexagonalPrism tempHexPrism = new HexagonalPrism(label, edge, height);
      
      hexPrismList.add(tempHexPrism);
   
   }
   /**
      Public method that finds a hexagonalPrism in a string of hexagonalPrism
      objects.
      
      @param hexPrismLabel - Takes input for the label of the hexagonalPrism
      that you want to find as a string.
      @return HexagonalPrism - Returns a hexagonalPrism if it is found in the
      list.
   */
   public HexagonalPrism findHexagonalPrism(String hexPrismLabel) {
   
      HexagonalPrism tempHexPrism = new HexagonalPrism("", 0, 0);
      String tempHexLabel = "";
      
      for (int i = 0; i < hexPrismList.size(); i++) {
         
         tempHexPrism = hexPrismList.get(i);
         tempHexLabel = tempHexPrism.getLabel();
         
         if (tempHexLabel.equalsIgnoreCase(hexPrismLabel)) {
         
            return hexPrismList.get(i);
         
         }
      
      }
   
      return null;
   
   }
   /**
      Public method that deletes a hexagonalPrism from a list of
      hexagonalPrisms.
      
      @param hexPrismLabel - Takes input for the name of the hexagonalprism
      that is wanted to be deleted as a string.
      @return HexagonalPrism - Returns the hexagonalPrism that was deleted if
      found and deleted.
   */
   public HexagonalPrism deleteHexagonalPrism(String hexPrismLabel) {
   
      HexagonalPrism tempHexPrism = new HexagonalPrism("", 0, 0);
      String tempHexLabel = "";
      
      for (int i = 0; i < hexPrismList.size(); i++) {
         
         tempHexPrism = hexPrismList.get(i);
         tempHexLabel = tempHexPrism.getLabel();
         
         
         if (tempHexLabel.equalsIgnoreCase(hexPrismLabel)) {
         
            hexPrismList.remove(i);
         
            return tempHexPrism;
            
            
         }
      
      }
   
      return null;
   
   }
   /**
      Public method that edits existing hexagonalPrism objects in a
      hexPrismList.
      
      @param label - Takes input for the label of the object as a string.
      @param edge - Takes input for the edge length of the object as a double.
      @param height - Takes input for the height length of the object 
      as a double.
      @return boolean - Returns true if hexagonalPrism is succesfully edited,
      returns false otherwise.
   */
   public boolean editHexagonalPrism(String label, double edge, double height) {
   
      HexagonalPrism tempHexPrism = new HexagonalPrism("", 0, 0);
      String tempHexLabel = "";
      
      for (int i = 0; i < hexPrismList.size(); i++) {
         
         tempHexPrism = hexPrismList.get(i);
         tempHexLabel = tempHexPrism.getLabel();
         
         
         if (tempHexLabel.equalsIgnoreCase(label)) {
         
            tempHexPrism.setEdge(edge);
            tempHexPrism.setHeight(height);
         
            return true;
            
            
         }
      
      }
   
      return false;
   
   }
   
}