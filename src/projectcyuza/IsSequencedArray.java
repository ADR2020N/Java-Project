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
public class IsSequencedArray {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
		int m = -5;
		int n = -2;

		int c = isSequencedArray(a, m, n);
		System.out.println("Result:" + c);
	}

	static int isSequencedArray(int[] a, int m, int n) {
		int isSequnced = 1;
		int current = 0;
		for (int i = 0; i < a.length && isSequnced == 1; i++) {
			current = a[i];
			if (i == 0)
				if (current != m)
					isSequnced = 0;
			if (i == a.length - 1)
				if (current != n)
					isSequnced = 0;
			if (current < m || current > n)
				isSequnced = 0;
			if (i > 0)
				if (current < a[i - 1])     
					isSequnced = 0;
			if (i < (a.length - 1))
				if (current != a[i + 1])
					if (a[i + 1] != current + 1)
						isSequnced = 0;
		}

		return isSequnced;
	}
    
}
