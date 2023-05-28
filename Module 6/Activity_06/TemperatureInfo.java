import java.util.Scanner;
import java.util.ArrayList;
/**
   Public class that takes input for a list of temperatures and then takes
   input for what you want to do with the tmperatures in the list, including 
   finding the highest temp, the lowest temp, printing the information, and
   then ending.
   
   @author Gregory Walker - Comp 1210
   @version 9/27/22
*/
public class TemperatureInfo {
   /**
      Public main method that takes input for a list of temperatures and then
      takes input for what you want to do with those temperatures. You can 
      choose to find the highest temp, the lowest temp, printing all of the
      information, and ending your choices.
      
      @param args - not used
   */
   public static void main(String[] args) {
      
      //Initializing variables, arrays, and scanners.
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      
      //do-while loop used to enter temperatures.
      do {
      
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         
         if (!tempInput.equals("")) {
         
            tempsList.add(Integer.parseInt(tempInput));
         
         }
      
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
      //do-while loop used to choose what to do with inputted temperatures.
      char choice = 'E';
      do {
      
         System.out.print("Enter choice - [L]ow temp, " 
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
      
         switch (choice) {
      
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
         
            case 'P':
               System.out.println(temps);
               break;
            
            case 'E':
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid choice!");
            
         }
   
      } while (choice != 'E');
 
   }
   
}