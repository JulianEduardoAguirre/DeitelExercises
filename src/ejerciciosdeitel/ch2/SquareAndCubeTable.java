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
public class SquareAndCubeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.printf("number\tsquare\tcube\t%n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d\t%n", i, i*i, i*i*i);
        }
    }
    
}
