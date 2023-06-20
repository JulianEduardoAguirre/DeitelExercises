/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeitel.ch2;


/**
 *
 * @author aguir
 */
public class IntegerValueOfAChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] charList = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1',
                            '2', '$', '*', '+', '/', ' '}; 
        
        for (int i = 0; i < charList.length; i++) {
            System.out.printf("The character %c has the value %d%n", charList[i], ((int) charList[i]));
            
        }

    }
    
}
