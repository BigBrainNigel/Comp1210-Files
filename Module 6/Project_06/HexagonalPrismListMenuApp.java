import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
   Public class that provides a list of options to use with a 
   hexagonalPrismList, including reading in a file of objects,
   printing the entire list, printing a summary of the list, adding
   a hexagonalPrism object to the list, deleting a hexagonalPrism object
   from the list, finding a hexagonalPrism object in the list, editing
   a hexagonalPrism object, and quitting.
   
   @author Gregory Walker - Comp 1210
   @version 9/30/22
*/
public class HexagonalPrismListMenuApp {
   /**
    Public method that provides a list of options to use with a 
   hexagonalPrismList, including reading in a file of objects,
   printing the entire list, printing a summary of the list, adding
   a hexagonalPrism object to the list, deleting a hexagonalPrism object
   from the list, finding a hexagonalPrism object in the list, editing
   a hexagonalPrism object, and quitting.  
   
   @param args - not used
   @throws FileNotFoundException - throws exception if file is not found
   */
   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner userInput = new Scanner(System.in);
      char choice = 'Q';
      String hexListDefaultName = "*** no list name assigned ***";
      ArrayList<HexagonalPrism> hexPrismArrayList 
         = new ArrayList<HexagonalPrism>();
      HexagonalPrismList hexPrismList 
         = new HexagonalPrismList(hexListDefaultName, hexPrismArrayList);
      HexagonalPrism tempHexPrism = new HexagonalPrism("", 0, 0);
      
      System.out.println("HexagonalPrism List System Menu"
         + "\nR - Read File and Create HexagonalPrism List"
         + "\nP - Print HexagonalPrism List"
         + "\nS - Print Summary"
         + "\nA - Add HexagonalPrism"
         + "\nD - Delete HexagonalPrism"
         + "\nF - Find HexagonalPrism"
         + "\nE - Edit HexagonalPrism"
         + "\nQ - Quit");
      
      do {
         
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         
         switch (choice) {
         
            case 'R':
               String fileName = "", label = "", listName = "";
               double edge = 0, height = 0;
               
               System.out.print("\tFile name: ");
               fileName = userInput.nextLine();
               
               Scanner fileInput = new Scanner(new File(fileName));
               listName = fileInput.nextLine();
               
               while (fileInput.hasNext()) {
               
                  label = fileInput.nextLine();
                  edge = Double.parseDouble(fileInput.nextLine());
                  height = Double.parseDouble(fileInput.nextLine());
                  
                  HexagonalPrism hexPrism 
                     = new HexagonalPrism(label, edge, height);
                     
                  hexPrismArrayList.add(hexPrism);
                  
               }
                 
               hexPrismList 
                  = new HexagonalPrismList(listName, hexPrismArrayList);
                     
               System.out.println("\tFile read in and HexagonalPrism" 
                  + " List created\n");
               break;
               
            case 'P':  
               System.out.println("\n" + hexPrismList.toString());
               break;
               
            case 'S':
               System.out.println("\n" + hexPrismList.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               hexPrismList.addHexagonalPrism(label, edge, height);
               
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;
           
            case 'D':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (hexPrismList.findHexagonalPrism(label) != null) {
               
                  hexPrismList.deleteHexagonalPrism(label);
                  System.out.println("\t\"" + label + "\"" + " deleted\n");
               
               }
               else {
               
                  System.out.println("\t\"" + label + "\"" + " not found\n");
               
               }
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (hexPrismList.findHexagonalPrism(label) != null) {
               
                  tempHexPrism = hexPrismList.findHexagonalPrism(label);
                  System.out.println(tempHexPrism.toString());
               
               }
               else {
               
                  System.out.println("\t\"" + label + "\"" + " not found\n");
               
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               if (hexPrismList.findHexagonalPrism(label) != null) {
                  
                  tempHexPrism = hexPrismList.findHexagonalPrism(label);
                  
                  hexPrismList.editHexagonalPrism(label, edge, height);
                  
                  System.out.println("\t\"" + tempHexPrism.getLabel() 
                     + "\"" + " successfully edited\n");
               
               }
               else {
               
                  System.out.println("\t\"" + label + "\"" + " not found\n");
               
               }
               break;
               
            case 'Q':
               break;
            
            default:
               System.out.println("\t*** invalid code ***\n");
         }  
      } while (choice != 'Q');
   }
}