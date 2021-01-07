/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcyuza;

/**
 *
 * @author N.Adrien
 */
public class isDigitSum {

    public static void main(String[] args) {
        int n = 21141;
        int m = 10;
        int rs = isDigitSum(n, m);
        System.out.println(rs);
    }

    static int isDigitSum(int n, int m) {
        int sum = 0, temp;
        if (n < 0) 
            return -1;
            while(n > 0) {
                temp = n % 10;
                sum = sum + temp;
                n = n / 10;
            }
        if (sum < m) {
            return 1;
        } else {
            return 0;
        }
    }
}
