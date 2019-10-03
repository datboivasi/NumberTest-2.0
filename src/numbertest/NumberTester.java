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
    private NumberTest perfectnumberTester;
    
    public interface NumberTest {
        boolean testNumber(int number);
    }
    public interface NumbersTest {
        boolean testNumber(int numberA,int numberB);
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
    
     public void setPerfectNumberTest(NumberTest perfectnumberTester) {
        this.perfectnumberTester = perfectnumberTester;
    }
     
    private NumbersTest friendNumberTester;
    public void setFriendNumberTester(NumbersTest friendNumberTest){
        this.friendNumberTester = friendNumberTest;
    }
    
    public void testFile() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        
        String alreadyReadLines = br.readLine();
        int ihatelife = Integer.parseInt(alreadyReadLines);
        
        for(int i =0; i < ihatelife; i++){
            alreadyReadLines = br.readLine();
            String[] parts = alreadyReadLines.split(" ");
            if(parts[0].equals("1")){
                int number = Integer.parseInt(parts[1]);
                boolean lambda = oddTester.testNumber(number);
                if(lambda == true){
                    System.out.println("ODD");
                }
                else{
                    System.out.println("EVBN");
                }
            }
            else if(parts[0].equals("2")){
                int number = Integer.parseInt(parts[1]);
                boolean lambda = primeTester.testNumber(number);
                if(lambda == true){
                    System.out.println("PRIME");
                }
                else{
                    System.out.println("NOT PRIME");
                }
            }
            else if(parts[0].equals("3")){
                int number = Integer.parseInt(parts[1]);
                boolean lambda = palindromeTester.testNumber(number);
                if(lambda == true){
                    System.out.println("PALINDROME");
                }
                else{
                    System.out.println("NOT PALINDROME");
                }
            }
            else if(parts[0].equals("4")){
                int number = Integer.parseInt(parts[1]);
                boolean lambda = perfectnumberTester.testNumber(number);
                if(lambda == true){
                    System.out.println("PERFECT");
                }
                else{
                    System.out.println("NOT PERFECT");
                }
            }
            else if(parts[0].equals("5")){
                if(friendNumberTester.testNumber(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]))){
                        System.out.println("FRIEND");
                    }
                    else{
                        System.out.println("ENEMY");
                    }
                    break; 
            }
        }
        
        
    }

    
    
    
}