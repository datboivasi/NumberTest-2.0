/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author vmaglov17
 */
public class NumberTester {
   
    public final String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    
    
    public interface NumberTest {
        boolean testNumber(int number);
    }

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }


    
    public void setOddEvenTester(NumberTest oddTester) {
       this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        
        
    }

    
    
    
}