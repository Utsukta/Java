/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
class BankAccount {
    private double balance = 1000.0;

    // Synchronized method to update the balance
    public synchronized void updateBalance(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " Updated Balance: $" + balance);
    }
}

class Transaction implements Runnable {
    private BankAccount account;
    private double transactionAmount;

    Transaction(BankAccount account, double transactionAmount) {
        this.account = account;
        this.transactionAmount = transactionAmount;
    }

    public void run() {
        account.updateBalance(transactionAmount);
    }
}

public class RealTimeExample {
    public static void main(String[] args) {
        // Create a shared BankAccount instance
        BankAccount sharedAccount = new BankAccount();

        // Create two threads performing transactions on the same BankAccount
        Thread thread1 = new Thread(new Transaction(sharedAccount, 500.0), "Thread 1");
        Thread thread2 = new Thread(new Transaction(sharedAccount, -300.0), "Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
