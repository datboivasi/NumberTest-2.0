/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertest;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vmaglov17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NumberTester nt = new NumberTester("fileName.txt");

        //ODD TESTER
        nt.setOddEvenTester((int number) -> number % 2 != 0);

        //PRIMES!!!
        nt.setPrimeTester((int number) -> {
            int i;
            int m = 0;
            int flag = 0;

            m = number / 2;

            if (number == 0 || number == 1) {
                return false;
            } else {
                for (i = 2; i <= m; i++) {
                    if (number % i == 0) {
                        flag = 1;
                        return false;
                    }
                }
                if (flag == 0) {
                    return true;
                }
            }
            return false;
        });

        //PALINDROME!!
        nt.setPalindromeTester((int number) -> {
            int rest;
            int sum = 0;
            int temp;

            temp = number;
            while (number > 0) {
                rest = number % 10;
                sum = (sum * 10) + rest;
                number = number / 10;
            }
            if (temp == sum) {
                return true;
            } else {
                return false;
            }
        });

        //PERFECT!!
        nt.setPerfectNumberTest((int number) -> {
            int i;
            int sum = 0;
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        });
        
        nt.setFriendNumberTester((int a,int b) -> {
            int temp1=0;
            for(int i = 1; i<a;i++){
                if(a%i==0){
                    temp1= temp1+i;
                }
            }
            int temp2=0;
            for(int i = 1; i<b;i++){
                if(b%i==0){
                    temp2= temp2 +i;
                }
            }
            return temp1==b && temp2==a; 
        });
        
        nt.testFile();
    }

}
