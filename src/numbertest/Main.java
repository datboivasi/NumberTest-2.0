/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

/**
 *
 * @author vmaglov17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("fileName");
        
        nt.setOddEvenTester( );
        nt.setPrimeTester( );
        nt.setPalindromeTester( );
        
    }
    
}
