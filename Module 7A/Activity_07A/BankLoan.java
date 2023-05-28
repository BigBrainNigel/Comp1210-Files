/**
   Public class that allows users to take out bank loans, pay on their loans,
   get their balance, get, set, and charge interest, find out if an amount is
   valid, find if they are in debt, and get and reset the number of loans
   created.
   
   @author Gregory Walker - Comp 1210
   @version 10/11/22
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   /**
      Constructor method that sets up a bank loan with the customer name and
      the initial interest rate. Sets their balance to zero and increments the
      amount of loans created.
      
      @param customerNameIn - String input for the customers name.
      @param interestRateIn - Double input for the initial interest rate.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**
      Public method that allows customer to borrow a loan from the bank.
      
      @param amount - Input for the amount of dollars they want to borrow.
      @return boolean - Returns true or false depending on if a loan was 
      succesfully made.
   */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   /**
      Public method that allows users to pay the bank back on borrowed money.
      
      @param amountPaid - Input for the amount to be paid back to the bank.
      @return double - Returns a double value of the new balance of the user.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   /**
      Public method that gets the users balance.
      
      @return double - Returns double value of the users balance.
   */
   public double getBalance() {
      return balance;
   }
   /**
      Public method to set the interest rate on a bank loan.
      
      @param interestRateIn - Input value for the new interest rate.
      @return boolean - Returns true or false based on if the interest rate was 
      successfully set or not.
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
      Public method that gets the current interest rate of a loan.
      
      @return double - Returns double value of the users interest rate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   /**
      Public method that that charges the users balance with the test interest
      rate.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**
      Public method that returns the customer name, their interest rate, and
      the users balance.
      
      @return String - Returns output as a string.
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   /**
      Public method static that determines if the amount being entered is 
      valid.
      
      @param amount - Input for the amount of money.
      @return boolean - Returns true or false depending on if the amount is
      greater than zero or not.
   */
   public static boolean isAmountValid(double amount) {
   
      return amount >= 0;
   
   }
   /**
      Public static method that determines if the user is currently in debt or
      not.
      
      @param loan - Input for the loan as a BankLoan object.
      @return boolean - Returns true or false depending on if the loan has a
      balance greater than zero or not.
   */
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
      
         return true;
      
      }
      
      return false;
   
   }
   /**
      Public static method that returns the number of loans that have been 
      created.
      
      @return int - Returns an integer value for the number of loans created.
   */
   public static int getLoansCreated() {
   
      return loansCreated;
   
   }
   /**
      Public static method that resets the amount of loans created.
   */
   public static void resetLoansCreated() {
   
      loansCreated = 0;
   
   }

}
