/**
   Public class that creates an online book object that can be returned as
   a string with the author included. Also includes a set author method. Uses
   the super constructor from the OnlineTextItem class.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public class OnlineBook extends OnlineTextItem {

   protected String author;
   
   /**
      Constructor that creates an online book object and initilizes the author
      variable to "Author Not Listed".
      
      @param nameIn - Accepts string input for the name of the item.
      @param priceIn - Accepts double input for the price of the item.
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      //Initalizes author variable to "Author Not Listed".
      author = "Author Not Listed";
   
   }
   
   /**
      Public method that transforms the information in the OnlineBook item into
      a string format.
      
      @return String - Returns a string value for the OnlineBook item. Inlcudes
      the author, name of the book, and the price.
   */
   public String toString() {
   
      return (name + " - " + author + ": $" + super.calculateCost());
   
   }
   
   /**
      Public class that sets the author variable to the input author.
      
      @param authorIn - Accepts string input for the author of the item.
   */
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   }

}