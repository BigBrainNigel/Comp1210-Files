import java.util.ArrayList;
/**
   Public class that takes input of temperatures as an array list, and can
   then fetch the lowest temp, the highest temp, the lower minimum temp, and
   the higher maxmimum temp, as well as output these in a to string method.
   
   @author Gregory Walker - Comp 1210
   @version 9/27/22
*/
public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**
      Constructor that sets the array list temperatures to the input array
      list.
      
      @param temperaturesIn - Array list input for the temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   
   }
   /**
      Public method that finds the lowest temperature in the input list.
      
      @return int - Returns an integer value for the variable low. Returns 0
      if the list is empty, and returns lowest the temp otherwise.
   */
   public int getLowTemp() {
      
      if (temperatures.isEmpty()) {
      
         return 0;
      
      }
         
      int low = temperatures.get(0);
         
      for (int i = 0; i < temperatures.size(); i++) {
         
         if (temperatures.get(i) < low) {
            
            low = temperatures.get(i);
            
         }
         
      }
   
      return low;
      
   }
   /**
      Public method that finds the highest temp in an input list.
      
      @return int - Returns and integer value for the variable high. Returns 0
      if the input list is empty, and the highest temperature value otherwise.
   */
   public int getHighTemp() {
      
      int i = 0;
      
      if (temperatures.isEmpty()) {
      
         return 0;
      
      }
         
      int high = temperatures.get(0);
         
      for (Integer temp : temperatures) {
         
         if (temperatures.get(i) > high) {
            
            high = temperatures.get(i);
               
         }
         
         i++;
         
      }
      
      return high;
   
   }
   /**
      Public method that determines the lowest temp value between
      two values.
      
      @param lowIn - Takes input for a temperature value.
      @return int - Returns an integer value for based on if the input
      temperature is lower, or the lowest temp from the input list is lower.
   */
   public int lowerMinimum(int lowIn) {
      
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   
   }
   /**
      Public method that determines the highest temp value between two values.
   
      @param highIn - Takes an input for a temperature value.
      @return int - Returns an integer value based on if the input temperature 
      is higher, or the highest temp from the input list is higher.
   */
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   
   }
   /**
      Public method that returns the lowest temperature in the list and the 
      highest temperature in the list as well as all of the temperatures.
      
      @return String - Returns a string with the temps, the lowest temp, and
      the highest temp in the list.
   */
   public String toString() {
   
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   
   }

}