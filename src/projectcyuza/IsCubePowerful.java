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
public class IsCubePowerful {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 407;

        int c = isCubePowerful(n);
        System.out.println("Result:" + c);
    }

    static int isCubePowerful(int n) {
        int originalNumber, remainder, result = 0;
        if (n <= 0) {
            return 0;
        }
        originalNumber = n;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
