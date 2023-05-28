import java.util.Comparator;
/**
   Public class that compares the flavor of two baked items and returns a
   negative value if the first iem is less than the second, a positive
   value if the first item is greater than the second, and a zero if the
   first value is the same as the second.
   
   Project 10
   @author Gregory Walker - Comp 1210
   @version 11/11/22
*/
public class FlavorComparator implements Comparator<BakedItem> {
   
   /**
      Public method that compares the flavors of two baked item objects. Returns
      - value if item 1 < item 2, + value if item 1 > item 2, and zero if
      item 1 == item 2.
      
      @param b1 - Accepts baked item input for the first item that is to be
      compared.
      @param b2 - Accepts baked item input for the second item that is to be
      comapred.
      @return int - Returns an integer value depending on if item 1 < item 2,
      item 1 > item 2, or if item 1 == item 2.
   */
   public int compare(BakedItem b1, BakedItem b2) {
   
      if (b1.getFlavor().toLowerCase().compareTo(b2.getFlavor()
         .toLowerCase()) < 0) {
      
         return -1;
      
      }
      else if (b1.getFlavor().toLowerCase().compareTo(b2.getFlavor()
         .toLowerCase()) > 0) {
      
         return 1;
      
      }
      else {
      
         return 0;
      
      }
   
   }

}