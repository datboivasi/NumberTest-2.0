/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public void testFile() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        
        String iwannadie = br.readLine();
        int ihatelife = Integer.parseInt(iwannadie);
        
        for(int i =0; i < ihatelife; i++){
            iwannadie = br.readLine();
            String[] parts = iwannadie.split(" ");
            if(parts[0].equals("1")){
                int number = Integer.parseInt(parts[1]);
                boolean wowthisisgay = oddTester.testNumber(number);
                if(wowthisisgay == true){
                    System.out.println("Wow it's an odd number cunt");
                }
                else{
                    System.out.println("wow it's an even number");
                }
            }
            else if(parts[0].equals("2")){
                int number = Integer.parseInt(parts[1]);
                boolean wowthisisgay = primeTester.testNumber(number);
                if(wowthisisgay == true){
                    System.out.println("Wow it's a prime number cunt");
                }
                else{
                    System.out.println("wow it's not an prime number faggot");
                }
            }
            else if(parts[0].equals("3")){
                int number = Integer.parseInt(parts[1]);
                boolean wowthisisgay = palindromeTester.testNumber(number);
                if(wowthisisgay == true){
                    System.out.println("Wow it's an palindrome cunt");
                }
                else{
                    System.out.println("wow it's not an palindrome");
                }
            }
            
            
        }
        
        
    }

    
    
    
}