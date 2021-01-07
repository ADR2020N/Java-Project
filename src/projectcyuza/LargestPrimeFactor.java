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
public class LargestPrimeFactor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10;
        int c = largestPrimeFactor(n);
        System.out.println("Result:" + c);

    }

    static int largestPrimeFactor(int n) {
        int largestpf = 0;
        int count = 0;

        if (n <= 1) {
            return 0;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                for (int j = 2; j <= n; j++) {
                    if (i % j == 0) {
                        count++;

                    }
                }
                if (count == 1) {
                    if (largestpf < i) {
                        largestpf = i;

                    }
                }
                count = 0;
            }
        }

        return largestpf;
    }

}
