import java.util.Scanner;
/**
   Program that displays someone's name, age, and gender
   and their age in minutes and centuries as well as
   max heart rate based on their age and gender.
   
   Activity 2
   @author Gregory Walker - Comp 1210
   @version 8/29/22
*/
public class AgeStatistics {
   /**
      Asks user for input on their name, age, and gender, and outputs 
      their name, age, gender, age in minutes, age in centuries, and their max
      heartrate.
      
      @param args - not used
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //Convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //Prompt the user for their max heart rate and display it
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //Calculates female MHR
      
         maxHeartRate = 209 - (0.7 * ageInYears);
      
      }
      else { //Calculates male MHR
      
         maxHeartRate = 214 - (0.8 * ageInYears);
      
      }
      
      System.out.print(maxHeartRate + " beats per minute.");
   }

}