/**
 * ?? BANK ACCOUNT MANAGEMENT SYSTEM
 * 
 * ?? DESCRIPTION:
 * Create a complete bank account system that demonstrates encapsulation, 
 * validation, and basic banking operations.
 * 
 * ?? LEARNING OBJECTIVES:
 * - Understand encapsulation with private fields
 * - Implement input validation
 * - Practice method design and error handling
 * - Learn to maintain object state consistency
 * 
 * ?? REQUIREMENTS:
 * 
 * BankAccount Class:
 * ? Private fields:
 *    - accountNumber (String): unique identifier
 *    - accountHolder (String): customer name
 *    - balance (double): current account balance
 *    - accountType (String): \"SAVINGS\" or \"CHECKING\"
 * 
 * ? Constructor:
 *    - BankAccount(accountNumber, accountHolder, initialBalance, accountType)
 *    - Validate: initialBalance >= 0, accountType must be valid
 * 
 * ? Public Methods:
 *    - deposit(amount): Add money to account
 *      ? Validate: amount must be positive
 *      ? Return: success/failure message
 *    
 *    - withdraw(amount): Remove money from account
 *      ? Validate: amount must be positive AND <= balance
 *      ? Return: success/failure message
 *    
 *    - transfer(targetAccount, amount): Send money to another account
 *      ? Validate: amount must be positive AND <= balance
 *      ? Update both accounts
 *    
 *    - getAccountInfo(): Return formatted account details
 *    - getBalance(): Return current balance
 * 
 * ? Validation Rules:
 *    - No negative balances allowed
 *    - No negative transaction amounts
 *    - Account type must be valid
 * 
 * ?? EXTRA CHALLENGE:
 * - Add transaction history with timestamps
 * - Implement interest calculation for savings accounts
 * - Add overdraft protection for checking accounts
 * 
 * ?? IMPLEMENTATION TIPS:
 * 1. Start by defining the class with private fields
 * 2. Implement constructor with validation
 * 3. Create getter methods first
 * 4. Implement deposit() with validation
 * 5. Implement withdraw() with balance check
 * 6. Add transfer() method last
 * 7. Test each method thoroughly
 */

public class HowToDo {
    // This file contains the exercise description and requirements
    // Use this as a guide to implement your solution
    
    public static void main(String[] args) {
        System.out.println("Implement the exercise requirements here!");
        // Test your implementation in this main method
    }
}
