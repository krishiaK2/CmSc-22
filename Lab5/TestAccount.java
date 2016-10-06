/*
 * A Test Driver for the Account class.
 *
 * krBello on 09/28/16
 *
 */

public class TestAccount {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account d1 = new Account(777, 70.00);
      System.out.println(d1);  // toString()

      Account d2 = new Account(222);
      System.out.println(d2);
      // Test Setters and Getters
      d1.setBalance(50.00);
      System.out.println(d1);  // run toString() to inspect the modified instance
      System.out.println("A/C is: " + d1.getAccountNumber());
      System.out.println("Balance is: " + d1.getBalance());
 
      // Test setDate()
      d1.credit(70.00);
      System.out.println("Balance is: " + d1.getBalance()); // update to 90.00
      d1.debit(30.00);
      System.out.println(d1);  // toString()
   }
}