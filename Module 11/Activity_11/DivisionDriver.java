import javax.swing.JOptionPane;
/**
   Public class that creates windows to enter a numerator and denominator,
   then uses those inputs to perform integer division and floating point
   division.
   
   Activity 11
   @author Gregory Walker - Comp 1210
   @version 11/14/22
*/
public class DivisionDriver {
   
   /**
      Public main method that creates two dialog windows for the input of
      a numerator and denominator. Then performs both integer divison and
      floating point division on the two numbers and outputs them to another
      window. Will catch a NumberFormatException if anything other than an
      integer is input, and will catch an IllegalArgumentException if a zero
      is input as the denominator.
      
      @param args - unused.
   */
   public static void main(String[] args) {
   
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");  
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
   
         String result = "Integer divison: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
   
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      
      }
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null,
            "Inavlid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      
      }
      catch (IllegalArgumentException e) {
      
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      
      }
   
   }
      
}