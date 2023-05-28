import java.util.Scanner;
/**
   This program takes an input message and, depending on the
   selection, transforms it to the specifications of each selection.
   
   @author Gregory Walker - Comp 1210
   @version 9/6/22
*/
public class MessageConverter {
   /**
      Recieves an input and transforms the message input based on the
      specifications of the number chosen. Ex: 0 = printed as is,
      1 = trimmed, etc.
      
      @param args - not used
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String message = ("");
      int outputType;
      String result = ("");
      
      //Prompts user for a message.
      System.out.print("Type in a message and press enter: \n\t> ");
      message = userInput.nextLine();
      
      //Prints available transformation options.
      System.out.println();
      System.out.print("Output types: "
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      //Allows user to input a number from above options and prints a skip line
      outputType = Integer.parseInt(userInput.nextLine());
      System.out.println();
      
      //Checks for selected option and transforms message accordingly
      if (outputType == 0) {
      
         result = message;
         System.out.println(result);
      
      }
      else if (outputType == 1) {
      
         result = message.trim();
         System.out.println(result);
      
      }
      else if (outputType == 2) {
      
         result = message.toLowerCase();
         System.out.println(result);
      
      }
      else if (outputType == 3) {
      
         result = message.toUpperCase();
         System.out.println(result);
      
      }
      else if (outputType == 4) {
      
         result = message.replace("a", "_");
         result = result.replace("e", "_");
         result = result.replace("i", "_");
         result = result.replace("o", "_");
         result = result.replace("u", "_");
         System.out.println(result);
      
      }
      else if (outputType == 5) {
      
         result = message.substring(1, message.length() - 1);
         System.out.println(result);
      
      }
      else {
      
         result = "Error: invalid choice input.";
         System.out.println(result);
      
      }
   }

}