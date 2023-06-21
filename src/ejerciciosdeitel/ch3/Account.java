/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeitel.ch3;

/**
 *
 * @author aguir
 */
public class Account {
    private final String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0) balance += amount;
    }
    
    public void withdraw(double amount){
        if (amount > balance) System.out.println("Withdrawal amount exceeds current account balance");
        else balance -= amount;
    }

    public void showStatus(){
        System.out.printf("Name: %s\t\tBalance: %.2f\n", name, balance);
    }
        

    
    
}
