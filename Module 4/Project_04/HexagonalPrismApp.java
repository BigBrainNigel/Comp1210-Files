import java.util.Scanner;
/**
   Program that finds the edge, height, base area, lateral surface
   area, surface area, and volume of the prism.
   
   @author Gregory Walker - Comp 1210
   @version 9/14/22
*/
public class HexagonalPrismApp {
   /**
      Takes input for the label of the prism, the edge, and the height, and
      then uses a toString method to find the base area, lateral surface
      area, surface area, and volume of the prism.
      
      @param args - not used
   */
   public static void main(String[] args) {
      
      //Initializing variables and scanner object
      Scanner userInput = new Scanner(System.in); 
      String label = ("");
      double edge = 0, height = 0;
      
      //Prompts user for label, edge, and heigh input
      System.out.println("Enter label, edge, and height"
         + " for a hexagonal prism.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      
      //Prompts user for edge input and checks if the edge is > 0
      System.out.print("\tedge: ");
      edge = Double.parseDouble(userInput.nextLine());
      if (edge <= 0) {
      
         System.out.println("Error: edge must be greater than zero.");
      
      }
      else {
         
         //Prompts user for height input and checks if the edge is > 0
         System.out.print("\theight: ");
         height = Double.parseDouble(userInput.nextLine());
         if (height <= 0) {
         
            System.out.println("Error: height must be greater than zero.");
         
         }
         else {
            
            //Initializes a hexagonal prism object and uses a toString method
            //to get other information about the prism.
            HexagonalPrism hexPrism = new HexagonalPrism(label, edge, height);
            System.out.println("\n" + hexPrism.toString());
         
         }
      
      }
   
   }

}