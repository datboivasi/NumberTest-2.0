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

        nt.setOddEvenTester((int number) -> number % 2 != 0);
        
        nt.setPrimeTester((int number) -> {
            int i, m = 0, flag = 0;
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
            return null;
        });
         
        //nt.setPalindromeTester();

    }

}
