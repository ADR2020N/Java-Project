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
public class SecondAnswer {
    public static void main(String[] args) {
        int[] b = { 2, 2,1, 2, 4 };

		int c = a2(b);
		System.out.println("Result:" + c);
    }
    static int a2(int[] a) {
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				sumEven += a[i];
			else
				sumOdd += a[i];
		}
		return sumOdd - sumEven;
	}

    
}
