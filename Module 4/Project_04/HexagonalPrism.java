import java.text.DecimalFormat;
/**
   Public class used to find set the label, edge, and height of a hexagonal
   prism. It can also set the label, edge, and height, as well as get and set
   the surface area, base area, lateral surface area, and volume.
   
   @author Gregory Walker - Comp 1210
   @version 9/14/22
*/
public class HexagonalPrism {
   
   //Initializing instance variables.
   private String label = ("");
   private double edge = 0.0, height = 0.0;
   /**
      Constructor that sets the label, edge length, and height for a 
      hexagonal prism.
      
      @param labelIn - Takes string input for label
      @param edgeIn - Takes double input for edge length
      @param heightIn - Takes double input for height 
   */
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
   
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   
   }
   /**
      Fetches and returns value for label.
      
      @return String - Returns label as a string value
   */
   public String getLabel() {
   
      return label;
   
   }
   /**
      Sets label variable with input value and evaluates to true if
       the length of the input is greater than zero. Evalutates to false
       and does not set label to input otherwise.
       
       @param labelIn - Takes string input for the label of the hexagon prism
       @return boolean - Returns true if length of input is > 0, returns false
       otherwise
   */
   public boolean setLabel(String labelIn) {
      
      boolean isSet;
      
      if (labelIn == null) {
         
         isSet = false;
      
      } 
      else {
      
         label = labelIn.trim();
         isSet = true;
      
      }
      
      return isSet;
   
   }
   /**
      Fetches and returns value for edge.
      
      @return double - Returns edge as a double 
   */
   public double getEdge() {
   
      return edge;
   
   }
   /**
      Sets edge variable with an input value and sets isSet to true if
      edgeIn > 0. Otherwise, does nothing and returns isSet.
      
      @param edgeIn - Takes double input for edge value
      @return boolean - Returns true if edgeIn > 0 and false otherwise
   */
   public boolean setEdge(double edgeIn) {
      
      boolean isSet = false;
      
      if (edgeIn > 0) {
      
         edge = edgeIn;
         isSet = true;
      
      }
      
      return isSet;
   
   }
   /**
      Fetches and returns value for height.
      
      @return double - Returns height as a double 
   */
   public double getHeight() {
   
      return height;
   
   }
   /**
      Sets height variable with an input value and sets isSet to true if
      heighteIn > 0. Otherwise, does nothing and returns isSet.
      
      @param heightIn - Takes double input for height value
      @return boolean - Returns true if heightIn > 0 and false otherwise
   */
   public boolean setHeight(double heightIn) {
   
      boolean isSet = false;
      
      if (heightIn > 0) {
      
         height = heightIn;
         isSet = true;
      
      }
      
      return isSet;
      
   }
   /**
      Sets the double areaValue to the surface area of a hexagonal prism using
      the input edge and height values in an equation.
      
      @return double - Returns the areaValue of the hexagonal prism as a double
   */
   public double surfaceArea() {
   
      double areaValue;
      
      areaValue = (6 * edge * height) + (3 * Math.sqrt(3) * Math.pow(edge, 2));
      
      return areaValue;
   
   }
   /**
      Sets the double lateralSurfaceArea to the lateral surface area of a 
      hexagonal prism using the input edge and height values in an equation.
      
      @return double - Returns the lateralAreaVaule of the hexagonal 
      prism as a double
   */
   public double lateralSurfaceArea() {
   
      double lateralAreaValue;
      
      lateralAreaValue = (6 * edge * height);
      
      return lateralAreaValue;
   
   }
   /**
      Sets the double baseAreaValue to the area of the base of a 
      hexagonal prism using the input edge value in an equation.
      
      @return double - Returns the baseAreaValue of the hexagonal 
      prism as a double
   */
   public double baseArea() {
   
      double baseAreaValue;
      
      baseAreaValue = ((3 * Math.sqrt(3)) * ((Math.pow(edge, 2)) / 2));
      
      return baseAreaValue;
   
   }
   /**
      Sets the double hexVolume to the volume of a hexagonal prism using
      the input edge value in an equation.
      
      @return double - Returns the hexVolume of the hexagonal prism as
      a double
   */
   public double volume() {
   
      double hexVolume;
      
      hexVolume = (((3 * Math.sqrt(3)) / 2) * (Math.pow(edge, 2) * height));
      
      return hexVolume;
   
   }
   /**
      Method that allows input to be converted to a formatted string,
      including the label of the prism, the faces, edges, and vertices,
      the edge length, the height, the lateral surface area, the base
      area, the sruface area, and the volume, all formatted using df.format.
      
      @return String - Returns output as a string.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = ("HexagonalPrism " + "\"" + label + "\"" + " has "
         + "8 faces, 18 edges, and 12 vertices." + "\n\t");
      output += "edge = " + df.format(edge) + " units" + "\n\t";
      output += "height = " + df.format(height) + " units" + "\n\t";
      output += "lateral surface area = " + df.format(lateralSurfaceArea()) 
         + " square units" + "\n\t";
      output += "base area = " + df.format(baseArea()) + " square units" 
         + "\n\t";
      output += "surface area = " + df.format(surfaceArea()) + " square units" 
         + "\n\t";
      output += "volume = " + df.format(volume()) + " cubic units" + "\n\t";
      
      return output;
   
   }

}