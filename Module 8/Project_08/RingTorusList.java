import java.text.DecimalFormat;
/**
   Public class that creates allows modifcations and actions to be performed 
   on an array list of RingTorus objects, including getting the name, getting
   the number of objects in the list, getting the total diamter, getting the 
   total surface area, getting the total volume, getting the average diameter,
   getting the average surface area, getting the average volume, putting all
   this information into a string format, returning the array of objects,
   adding a new RingTorus to the list, finding a RingTorus in the list,
   deleting a RingTorus from the list, editing a RingTorus, and finding the
   RingTorus with the largest voume.
   
   @author Gregory Walker - Comp 1210
   @version 10/28/22
*/
public class RingTorusList {

   private String listName = "";
   private RingTorus[] ringArray;
   private int numTorus = 0;
   
   /**
      Constructor that creates a list of RingTorus objects.
      
      @param listNameIn - Takes string input for the name of the list of ring
      torus objects.
      @param ringArrayIn - Takes the input of an array of RingTorus objects.
      @param numTorusIn - Takes integer input for the number of RingTorus
      objects in the list.
   */
   public RingTorusList(String listNameIn,
      RingTorus[] ringArrayIn, int numTorusIn) {
   
      listName = listNameIn;
      ringArray = ringArrayIn;
      numTorus = numTorusIn;
   
   }
   
   /**
      Public method that returns the name of the array of RingTorus objects.
      
      @return String - Returns a string of the name of the array of RingTorus
      objects.
   */
   public String getName() {
   
      return listName;
   
   }
   
   /**
      Public method that returns the number of RingTorus objects in the array.
      
      @return int - Returns an integer value of the numer of RingTorus
      objects in the array.
   */
   public int numberOfRingToruses() {
   
      return numTorus;
   
   }
   
   /**
      Public method that finds the total diameter of all RingTorus objects
      in the array.
      
      @return double - Returns a double value for the total diameter of all
      RingTorus obects in the array.
   */
   public double totalDiameter() {
      
      double totalD = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            totalD += ringArray[i].diameter();
      
         }
      
      }
      
      return totalD;
   
   }
   
   /**
      Public method that finds the total surface area of all of the RingTorus
      objects in the array.
      
      @return double - Returns the double value of the total surface area of 
      all Ringtorus objects in the array.
   */
   public double totalSurfaceArea() {
   
      double totalSA = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            totalSA += ringArray[i].surfaceArea();
      
         }
      
      }
      
      return totalSA;

   
   }
   
   /**
      Public method that finds the total volume of all RingTorus objects.
      
      @return double - Returns the double value for the volume of all
      RingTorus objects.
   */
   public double totalVolume() {
   
      double totalVol = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            totalVol += ringArray[i].volume();
      
         }
      
      }
      
      return totalVol;
   
   }
   
   /**
      Public method that finds the average diameter of all RingTorus objects.
      
      @return double - Returns the double value of the average diameter of
      all RingTorus objects.
   */
   public double averageDiameter() {
   
      double averageD = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            averageD += ringArray[i].diameter();
      
         }
         
         averageD = averageD / ringArray.length;
         
      }
      
      return averageD;
   
   }
   
   /**
      Public method that finds the average surface area of all RingTorus 
      objects.
      
      @return double - Returns the double value of the average surface 
      area of all RingTorus objects.
   */
   public double averageSurfaceArea() {
   
      double averageSA = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            averageSA += ringArray[i].surfaceArea();
      
         }
         
         averageSA = averageSA / ringArray.length;
      
      }
      
      return averageSA;

   
   }
   
   /**
      Public method that finds the average volume of all RingTorus objects.
      
      @return double - Returns the double value of the average volume of
      all RingTorus objects.
   */
   public double averageVolume() {
   
      double averageVol = 0;
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
         
            averageVol += ringArray[i].volume();
      
         }
         
         averageVol = averageVol / ringArray.length;
      
      }
      
      return averageVol;
   
   }
   
   /**
      Public method that converts the array list of RingTorus objects to a
      string format.
      
      @return String - Returns contents of array list as a string output.
   */
   public String toString() {
      
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = ("----- Summary for " + listName + " -----");
      output += ("\nNumber of RingToruses: " + numberOfRingToruses());
      output += ("\nTotal Diameter: " + df.format(totalDiameter()));
      output += ("\nTotal Surface Area: " + df.format(totalSurfaceArea()));
      output += ("\nTotal Volume: " + df.format(totalVolume()));
      output += ("\nAverage Diameter: " + df.format(averageDiameter()));
      output += ("\nAverage Surface Area: " + df.format(averageSurfaceArea()));
      output += ("\nAverage Volume: " + df.format(averageVolume()));
      
      return output;
      
   }
   
   /**
      Pulic method that returns the object address for the ring torus array.
      
      @return RingTorus[] - Returns a RingTorus[] object for the array.
   */
   public RingTorus[] getList() {
      
      return ringArray;
   
   }
   
   /**
      Public method that adds a RingTorus object to the existing array of
      RingTrus objects and increments the number of ring torus objects in
      the array.
      
      @param labelIn - String input for the label of the RingTorus
      @param largeRadiusIn - Double input for the value of the large radius
      of the RingTorus
      @param smallRadiusIn - Double input for the value of the samll radius
      of the RingTorus.
   */
   public void addRingTorus(String labelIn,
      double largeRadiusIn, double smallRadiusIn) {
      
      RingTorus newRingTorus 
         = new RingTorus(labelIn, largeRadiusIn, smallRadiusIn);
      ringArray[numTorus] = newRingTorus;
      numTorus++;
   
   }
   
   /**
      Public method that finds a ring torus in the array if it exists.
      
      @param labelIn - Takes string input for the label of the RingTorus
      object that you want to find.
      @return RingTorus - Returns a RingTorus object if one is found. If one
      is not found, null is returned.
   */
   public RingTorus findRingTorus(String labelIn) {
      
      RingTorus tempRing = new RingTorus("", 1.0, 0.0);
      String tempTorusLabel = "";
      
      for (int i = 0; i < ringArray.length; i++) {
      
         tempRing = ringArray[i];
         tempTorusLabel = tempRing.getLabel();
         
         if (tempTorusLabel.equalsIgnoreCase(labelIn)) {
         
            return ringArray[i];
         
         }
      
      }
      
      return null;
   
   }
   
   /**
      Public method that finds the wanted RingTorus object and delete's it from
      the array.
      
      @param labelIn - Takes string input for the label of the RingTorus object
      that you want to delete from the array.
      @return RingTorus - Returns the deleted RingTorus object if found and
      deleted and returns null if not.
   */
   public RingTorus deleteRingTorus(String labelIn) {
      
      RingTorus resultTorus = null;
      
      RingTorus tempRing = new RingTorus("", 1.0, 0.0);
      String tempTorusLabel = "";
      
      for (int i = 0; i < numTorus; i++) {
      
         tempRing = ringArray[i];
         tempTorusLabel = tempRing.getLabel();
         
         if (tempTorusLabel.equalsIgnoreCase(labelIn)) {
            
            for (int j = i; j < numTorus - 1; j++) {
            
               ringArray[j] = ringArray[j + 1];
            
            }
            
            resultTorus = ringArray[i];
            ringArray[numTorus - 1] = null;
            numTorus--;
            break;
         
         }
      
      }
      
      return resultTorus;
      
   }
   
   /**
      Public method that edits a ring torus object if it is found in the array.
      
      @param labelIn - Takes tring input for the label of the RingTorus
      object that you want to edit.
      @param largeRadiusIn - Takes double input for what you want to change the
      large radius of the RingTorus object to.
      @param smallRadiusIn - Takes double input for what you want to change the
      small radius of the RingTorus object to.
      @return boolean - Returns true if ring torus is successfully edited and
      returns false otherwise.
   */
   public boolean editRingTorus(String labelIn,
      double largeRadiusIn, double smallRadiusIn) {
      
      boolean ringReturn = false;
      RingTorus tempRing = new RingTorus("", 1.0, 0.0);
      String tempTorusLabel = "";
      
      for (int i = 0; i < numTorus; i++) {
      
         tempRing = ringArray[i];
         tempTorusLabel = tempRing.getLabel();
         
         if (tempTorusLabel.equalsIgnoreCase(labelIn)) {
         
            ringArray[i].setLargeRadius(largeRadiusIn);
            ringArray[i].setSmallRadius(smallRadiusIn);
            ringReturn = true;
         
         }
         
      }
      
      return ringReturn;
      
   }
   
   /**
      Public method that finds the ring torus that has the largest volume
      in the array.
      
      @return RingTorus - Returns the ring torus object wit the largest
      volume in the array.
   */
   public RingTorus findRingTorusWithLargestVolume() {
      
      RingTorus largestVol = new RingTorus("", 1.0, 0);
      
      if (ringArray.length > 0) {
      
         for (int i = 0; i < ringArray.length; i++) {
      
            if (ringArray[i].volume() > largestVol.volume()) {
         
               largestVol = ringArray[i];
         
            }
      
         }
   
      }
      
      return largestVol;
   
   }
}