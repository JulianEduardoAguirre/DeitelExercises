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
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a1 = new Account("Person 1", 500);
        Account a2 = new Account("Person 2", -10);
        
        a1.showStatus();
        a2.showStatus();
        
        a1.deposit(300);
        a2.deposit(280);
        
        a1.showStatus();
        a2.showStatus();
        
        a1.withdraw(900);
        a2.withdraw(30);
        
        a1.showStatus();
        a2.showStatus();
    }
    
}
