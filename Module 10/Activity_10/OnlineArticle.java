/**
   Public class that uses the OnlineTextItem class to create an article object.
   Also able to set the word count of the artcile.
   
   @author Gregory Walker - Comp 1210
   @version 11/1/22
*/
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
   
   /**
      Contructor that creates an online article item using the super
      constructor from the OnlineTextItem class.
      
      @param nameIn - Accepts string input for the name of the item.
      @param priceIn - Accepts double input for the price of the item.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      //Initializes word count of article to 0.
      wordCount = 0;
   
   }
   
   /**
      Public method that sets the word count of the article.
      
      @param wordCountIn - Accepts integer input for the word count of the
      article.
   */
   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   
   }

}