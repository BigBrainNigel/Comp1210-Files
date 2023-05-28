import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
   Public test class to test the methods of the RingTorusList class.
*/
public class RingTorusListTest {
   
   /**
      Test method that tests the getName method in the RingTorusList class.
      Tests to see if the name is correctly fetched.
   */
   @Test public void getNameTest() {
      
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertEquals(newList.getName(), "listtest1");
      
   }
   
   /**
      Test method that tests the numberOfRingToruses method in the
      RingTorusList class. Tests to see if the number of ring toruses found
      is correct.
   */
   @Test public void numberOfRingTorusesTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertEquals(newList.numberOfRingToruses(), 2);
   
   }
   
   /**
      Test method that tests the totalDiameter method in the RingTorusList
      class. Tests if the length of the array is greater than 0, and tests
      if the total diameter is correct.
   */
   @Test public void totalDiameterTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      
      Assert.assertEquals(newList.totalDiameter(), 60.0, 0.0001);
      Assert.assertEquals(newList2.totalDiameter(), 0, 0.0001);
   
   }
   
   /**
      Test method that tests the totalSurfaceArea method in the
      RingTorusList class. Tests if the length of the array is 
      greater than 0, and tests if the total surface area is correct.
   */
   @Test public void totalSurfaceAreaTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      
      Assert.assertEquals(newList.totalSurfaceArea(), 4342.6259, 0.0001);
      Assert.assertEquals(newList2.totalSurfaceArea(), 0, 0.0001);
   
   }
   
   /**
      Test method that tests the totalVolume method in the RingTorusList class.
      Tests if the length of the array is greater than 0, and tests if the
      total volume found is correct.
   */
   @Test public void totalVolumeTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      
      Assert.assertEquals(newList.totalVolume(), 14133.2735, 0.0001);
      Assert.assertEquals(newList2.totalVolume(), 0, 0.0001);
   
   }
   
   /**
      Test method that tests the averageDiameter method in the RingTorusList
      class. Tests if the length of the array is greater than zero, and tests
      to see if the average diameter is correct.
   */
   @Test public void averageDiameterTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      
      Assert.assertEquals(newList.averageDiameter(), 30.0, 0.0001);
      Assert.assertEquals(newList2.averageDiameter(), 0.0, 0.0001);
   
   }
   
   /**
      Test method that tests the averageSurfaceArea method in the
      RingTorusList class. Tests if the array list is greater than 0.
      Also tests to see if the average surface area calculation is correct.
   */
   @Test public void averageSurfaceAreaTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
            
      Assert.assertEquals(newList.averageSurfaceArea(), 2171.3129, 0.0001);
      Assert.assertEquals(newList2.averageSurfaceArea(), 0.0, 0.0001);
      
   }
   
   /**
      Test method that tests the averageVolume method in the RingTorusList
      class. Tests for the array length being greater than 0. Also tests to
      see if the average volume calculation is correct.
   */
   @Test public void averageVolumeTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      
      Assert.assertEquals(newList.averageVolume(), 7066.6367, 0.0001);
      Assert.assertEquals(newList2.averageVolume(), 0.0, 0.0001);
   
   }
   
   /**
      Test method that tests the toString method in the RingTorusList class.
      Tests to see if the name of the list is included in the output of the
      toString method.
   */
   @Test public void toStringTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertTrue(newList.toString().contains("listtest1"));
   
   }
   
   /**
      Test method that tests the getList method in the RingTorusList class.
      Tests to see if the fetched list correctly corresponds to the actual
      list.
   */
   @Test public void getListTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertEquals(newList.getList(), ringListTest);
   
   }
   
   /**
      Test method that tests the addRingTorus method in the RingTorusList
      class. Tests if a new RingTorus object was successfully added to the
      array by seeing if the number of objects in the list has been
      incremented correctly.
   */
   @Test public void addRingTorusTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = new RingTorus[3];
      ringListTest[0] = newRing;
      ringListTest[1] = newRing2;
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      newList.addRingTorus("test3", 10.0, 5.0); 
      Assert.assertTrue(newList.numberOfRingToruses() == 3);
   
   }
   
   /**
      Test method that tests the findRingtorus method in the RingTorusList
      class. Tests to see if the object was succesfully found if included in
      the array, and also checks to see if null is returned if the object is
      not included the array.
   */
   @Test public void findRingTorusTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertEquals(newList.findRingTorus("test1"), newRing);
      Assert.assertEquals(newList.findRingTorus("test5"), null);
   
   }
   
   /**
      Test method that tests the deleteRingTorus method in the RingTorusList
      class. Tests to see if the ring that is returned when deleted is equal
      to the ring object that was deleted.
   */
   @Test public void deleteRingTorusTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertEquals(newList.deleteRingTorus("test2"), newRing2);
   
   }
   
   /**
      Test method that tests the editRingTorus method in the RingTorusList
      class. Tests that a RingTorus object will be succesfully edited if it
      is included in the array, and that no object will be edited if it is
      not.
   */
   @Test public void editRingTorusTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 6.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      
      Assert.assertTrue(newList.editRingTorus("test1", 9.0, 8.0));
      Assert.assertFalse(newList.editRingTorus("test3", 9.0, 8.0));
   
   }
   
   /**
      Test method that tests the findRingTorusWithLargestVolume method in the
      RingTorusList class. Tests if the array length is greater than zero,
      and tests that the largest volume is correctly output.
   */
   @Test public void findRingTorusWithLargestVolumeTest() {
   
      RingTorus newRing = new RingTorus("test1", 8.0, 7.0);
      RingTorus newRing2 = new RingTorus("test2", 9.0, 8.0);
      RingTorus newRing3 = new RingTorus("", 1.0, 0.0);
      RingTorus[] ringListTest = {newRing, newRing2};
      RingTorus[] ringListTest2 = new RingTorus[0];
      RingTorus[] ringListTest3 = {newRing3};
      RingTorusList newList = new RingTorusList("listtest1", ringListTest, 2);
      RingTorusList newList2 = new RingTorusList("listtest2", ringListTest2, 0);
      RingTorusList newList3 = new RingTorusList("listtest3", ringListTest3, 0);
      
      Assert.assertEquals(newList.findRingTorusWithLargestVolume(), newRing2);
      Assert.assertEquals(newList3.findRingTorusWithLargestVolume(), newRing3);
      Assert.assertEquals(newList2.findRingTorusWithLargestVolume(), newRing3);
   
   }
   
}
