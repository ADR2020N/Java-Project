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
public class IsBalancedMyTest {

    public static void main(String[] args) {
        int s[] = {3, -2, -4, 2,-3};
        int res = isBalanced(s);
        System.out.println(res);
    }

    static int isBalanced(int[] a) {
        boolean isBal = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i] * -1 == a[j]) {
                    isBal = true;
                }
            }
            if (!isBal) {
                return 0;
            }
        }
        return 1;
    }
    }
