/**
  Public class that creates a custom, user-made exception and extends the
  Exception class. Created exception is thrown when an incorrect catagory is
  input/read-in from a file.
  
  Project 11
  @author Gregory Walker - Comp 1210
  @version 11/17/22 
*/
public class InvalidCategoryException extends Exception {
   
   /**
      Public class that creates a new exception using the super constructor
      of the Exception class. New exception is used when unsupported catagory
      is input/read-in from a file.
      
      @param categoryIn - Accepts string input for the incorrect or unsopported
      catagory.
   */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + "\"" + categoryIn + "\"");
   
   }

}