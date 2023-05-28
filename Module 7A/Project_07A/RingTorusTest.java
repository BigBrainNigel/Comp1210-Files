import org.junit.Assert;
import org.junit.Test;

/**
   Public class that runs tests on the RingTorus class.
   
   @author Gregory Walker - Comp 1210
   @version 10/13/22
*/
public class RingTorusTest {
   
   /**
      Public test method that tests the getLabel method.
   */
   @Test public void getLabelTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.getLabel(), "Ring");
   
   }
   
   /**
      Public test method that tests the setLabel method.
   */
   @Test public void setLabelTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.setLabel("LabelTest"), true);
      Assert.assertEquals(newRing.setLabel(null), false);
   
   }
   
   /**
      Public test method that tests the getLargeRadius method.
   */
   @Test public void getLargeRadiusTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.getLargeRadius(), 8.0, 0.0001);
   
   }
   
   /**
      Public test method that tests the setLargeRadius method.
   */
   @Test public void setLargeRadiusTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.setLargeRadius(9.0), true);
      Assert.assertEquals(newRing.setLargeRadius(7.0), false);
   
   }
   
   /**
      Public test method that tests the getSmallRadius method. 
   */
   @Test public void getSmallRadiusTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.getSmallRadius(), 7.0, 0.0001);
   
   }
   
   /**
      Public test method that tests the setSmallRadius method.
   */
   @Test public void setSmallRadiusTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.setSmallRadius(6.0), true);
      Assert.assertEquals(newRing.setSmallRadius(8.0), false);
   
   }
   
   /**
      Public test method that tests the diameter method.
   */
   @Test public void diameterTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.diameter(), 30.0, 0.0001);
   
   }
   
   /**
      Public test method that tests the surfaceArea method.
   */
   @Test public void surfaceAreaTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.surfaceArea(), 2210.7913, 0.0001);
   
   }
   
   /**
      Public test method that tests the volume method.
   */
   @Test public void volumeTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.volume(), 7737.7698, 0.0001);
   
   }
   
   /**
      Public test method that tests the toString method.
   */
   @Test public void toStringTest() {
   
      RingTorus newRing = new RingTorus("RingyRingy", 8.0, 7.0);
      Assert.assertTrue(newRing.toString().contains("RingyRingy"));
   
   }
   
   /**
      Public test method that tests the getCount method.
   */
   @Test public void getCountTest() {
      
      RingTorus.resetCount();
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("Ring2", 8.0, 7.0);
      Assert.assertEquals(RingTorus.getCount(), 2);
   
   }
   
   /**
      Public test method that tests the resetCount method.
   */
   @Test public void resetCountTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      RingTorus.resetCount();
      Assert.assertEquals(RingTorus.getCount(), 0);
   
   }
   
   /**
      Public test method that tests the equals method.
   */
   @Test public void equalsTest() {
   
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("Ring", 8.0, 7.0);
      RingTorus newRing3 = new RingTorus("Ring3", 8.0, 7.0);
      Assert.assertEquals(newRing.equals(newRing2), true);
      Assert.assertEquals(newRing.equals(newRing3), false);
   
   }
   
   /**
      Public test method that tests the hashCode method.
   */
   @Test public void hashCodeTest() {
      
      RingTorus newRing = new RingTorus("Ring", 8.0, 7.0);
      Assert.assertEquals(newRing.hashCode(), 0);
   
   }
   
}
