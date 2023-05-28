
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
   Program that returns information for a party based on input order code.
   
   @author Gregory Walker - Comp 1210
   @version 9/7/22
*/
public class BoxLunch {
   /**
      Takes input order code and finds the name of the order, number and price
      of adult meals, number and price of child meals, order total price, the 
      theme of the party, and generates a random lucky prize number.
      
      @param args - not used
   */
   public static void main(String[] args) {
   
      //Initializing objects and variables
      Scanner userInput = new Scanner(System.in);
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat luckyNumFormat = new DecimalFormat("0000");
      Random generator = new Random();
      String name = ("");
      String theme = ("");
      String orderCode = ("");
      int numChildMeals, numAdultMeals, luckyNum, partyTheme;
      double priceAdultMeal, priceChildMeal, priceTotal;
      
      //Prompts user for order code and trims and white space from the 
      //beginning and end
      System.out.print("Enter order code: ");
      orderCode = userInput.nextLine();
      orderCode = orderCode.trim();
      System.out.println();
      
      //Determines if length of order code is long enough
      if (orderCode.length() < 13) {
      
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      
      }
      else {
         
         //Gets name from order code and prints it
         name = orderCode.substring(13, orderCode.length());
         System.out.println("Name: " + name);
         
         //Gets number and price of adult meals and prints them
         numAdultMeals = Integer.parseInt(orderCode.substring(1, 3));
         priceAdultMeal = (Double.parseDouble(orderCode.substring(3, 7))) / 100;
         System.out.println("Adult meals: " + numAdultMeals + " at " 
            + priceFormat.format(priceAdultMeal));
         
         //Gets number and price of child meals and prints them
         numChildMeals = Integer.parseInt(orderCode.substring(7, 9));
         priceChildMeal = (Double.parseDouble(orderCode.substring(9, 13)));
         priceChildMeal = (priceChildMeal / 100);
         System.out.println("Child meals: " + numChildMeals + " at " 
            + priceFormat.format(priceChildMeal));
         
         //Calculates and outputs total price
         priceTotal = (numAdultMeals * priceAdultMeal) 
            + (numChildMeals * priceChildMeal);
         System.out.println("Total: " + priceFormat.format(priceTotal));
         
         //Determines themne of party based on first number of input 
         //order number and prints it
         partyTheme = Integer.parseInt(orderCode.substring(0, 1));
         if (partyTheme == 0) {
         
            System.out.println("Theme: Birthday");
         
         }
         else if (partyTheme == 1) {
         
            System.out.println("Theme: Graduation");
         
         }
         else {
         
            System.out.println("Theme: Holiday");
         
         }
         
         luckyNum = generator.nextInt(10000);
         System.out.println("Lucky Number: " + luckyNumFormat.format(luckyNum));
      
      }
   }

}