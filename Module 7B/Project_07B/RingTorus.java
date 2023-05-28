import java.text.DecimalFormat;

/**
   Public class that creates a ring torus object and can get the label, set
   the label, get and set the large radius, get and set the small radius,
   find the diameter, find the surface area, find the volume, and convert to
   a string.
   
   @author Gregory Walker - Comp 1210
   @version 10/13/22
*/
public class RingTorus implements Comparable<RingTorus> {

   private String label = "";
   private double largeRadius = 0, smallRadius = 0;
   private static int count = 0;
   
   /**
      Constructor that creates a ring torus object.
      
      @param labelIn - Accepts input for the label of the ring torus as a
      string.
      @param largeRadiusIn - Accepts input for the large radius of the ring
      torus as a double value.
      @param smallRadiusIn - Accepts input for the small radius of the ring 
      torus as a double value.
   */
   public RingTorus(String labelIn, double largeRadiusIn,
      double smallRadiusIn) {
   
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      
      count++;
   
   }
   
   /**
      Public method that fetches the label of a ring torus object.
      
      @return String - Returns the label of the ring torus object as a string.
   */
   public String getLabel() {
   
      return label;
   
   }
   
   /**
      Public method that sets the label of the ring torus.
      
      @param labelIn - Accepts a string input for the label and sets that
      input as the label.
      @return boolean - Returns true or false depending on if the label was
      successfully set or not.
   */
   public boolean setLabel(String labelIn) {
      
      boolean labelIsSet = false;
      
      if (labelIn != null) {
      
         label = labelIn.trim();
         
         labelIsSet = true;
      
      }
      
      return labelIsSet;
   
   }
   
   /**
      Public method that fetches the value of the largeRadius of a ring torus
      object.
      
      @return double - Returns the double value of the large radius of a ring
      torus object.
   */
   public double getLargeRadius() {
   
      return largeRadius;
   
   }
   
   /**
      Public method that sets the large radius of a ring torus object if the
      input number is greater than zero and is greater than the small radius.
      
      @param largeRadiusIn - Takes a double input for the large radius of a 
      ring torus object.
      
      @return boolean - Returns true or false depending on if the large radius
      was successfully set or not.
   */
   public boolean setLargeRadius(double largeRadiusIn) {
      
      boolean largeRadiusIsSet = false;
      
      if ((largeRadiusIn > 0) && (largeRadiusIn > smallRadius)) {
      
         largeRadius = largeRadiusIn;
         
         largeRadiusIsSet = true;
      
      }
      
      return largeRadiusIsSet;
   
   }
   
   /**
      Fetches the small radius of a ring torus object.
      
      @return double - Returns a double value of the small radius of a ring
      torus object.
   */
   public double getSmallRadius() {
   
      return smallRadius;
   
   }
   
   /**
      Public method that sets the small radius of a ring torus object if the
      input number is greater than zero and is less than the large radius.
      
      @param smallRadiusIn - Takes a double input for the small radius of a 
      ring torus object.
      
      @return boolean - Returns true or false depending on if the small radius
      was successfully set or not.
   */
   public boolean setSmallRadius(double smallRadiusIn) {
   
      boolean smallRadiusIsSet = false;
   
      if ((smallRadiusIn > 0) && (smallRadiusIn < largeRadius)) {
      
         smallRadius = smallRadiusIn;
         
         smallRadiusIsSet = true;
      
      }
      
      return smallRadiusIsSet;
   
   }
   
   /**
      Public method that finds the diameter of a ring torus object.
      
      @return double - Returns the double value of the diameter ring torus 
      object.
   */
   public double diameter() {
   
      double ringDiameter = 2 * (largeRadius + smallRadius);
      
      return ringDiameter;
      
   }
   
   /**
      Public method that finds the surface area of a ring torus object.
      
      @return double - Returns the double value of the diameter a ring torus
      object.
   */
   public double surfaceArea() {
   
      double ringSurfaceArea = (2 * Math.PI * largeRadius)
         * (2 * Math.PI * smallRadius);
         
      return ringSurfaceArea;
   
   }
   
   /**
      Public method that finds the volume of a ring torus object.
      
      @return double - Returns the double value of the diameter of a ring 
      torus object.
   */
   public double volume() {
   
      double volume = (2 * Math.PI * largeRadius)
         * (Math.PI * Math.pow(smallRadius, 2));
      
      return volume;
      
   }
   
   /**
      Public method that returns the name, the large radius, the small 
      radius, the diameter, the surface area, and the volume of a
      ring torus object all as a string.
      
      @return String - Returns the value of output as a string.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      
      output += ("RingTorus " + "\"" + label + "\"");
      output += ("\n\tlarge radius = " + df.format(getLargeRadius())
         + " units");
      output += ("\n\tsmall radius = " + df.format(getSmallRadius())
         + " units");
      output += ("\n\tdiameter = " + df.format(diameter()) + " units");
      output += ("\n\tsurface area = " + df.format(surfaceArea())
         + " square units");
      output += ("\n\tvolume = " + df.format(volume()) + " cubic units");
      
      return output;
      
   }
   
   /**
      Public method that fetches the count (number) of ring torus objects that
      have been created.
      
      @return int - Returns the integer value of the number of ring torus
      objects that have been created.
   */
   public static int getCount() {
   
      return count;
   
   }
   
   /**
      Public method that resets the count variable to 0.
   */
   public static void resetCount() {
   
      count = 0;
   
   }
   
   /**
      Public method that returns false if input object is not a ring torus
      object. Otherwise, when it is a ring torus, if it has the same 
      field values as the RingTorus upon which the method 
      was called, it returns true. Otherwise, it returns false.
      
      @param obj - Accepts input for object.
      @return boolean - Returns true or false based on if the input objects is
      a ring torus object or not.
   */
   public boolean equals(Object obj) { 
    
      if (!(obj instanceof RingTorus)) { 
         return false; 
      } 
      else {  
         RingTorus rt = (RingTorus) obj;        
         return (label.equalsIgnoreCase(rt.getLabel()) 
            && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001) 
            && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001)); 
      }  
   }
   
   /**
      Public method that returns hashCode as 0.
      
      @return int - Returns 0.
   */
   public int hashCode() {
   
      return 0;
   
   }
   
   /**
      Public method that compares two ring torus objects and returns
      -1, 0, or 1 depending on if one os less than the other, greater than
      the other, or equal to each other respectfully.
      
      @param obj - Accepts input fora ring torus object to be compared.
      @return int - Returns an integer value depending on if the two compared
      values are greater than, less than, or equal to each other.
   */
   public int compareTo(RingTorus obj) {
   
      if (this.volume() < obj.volume()) {
      
         return -1;
      
      }
      else if (this.volume() > obj.volume()) {
      
         return 1;
      
      }
      else {
      
         return 0;
      
      }
   
   }
   
}