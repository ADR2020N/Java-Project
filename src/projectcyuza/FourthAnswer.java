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
public class FourthAnswer {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		int b = reveserNumbers(a);

		System.out.println("Result:" + b);
	}

	static int reveserNumbers(int n) {
		int sign = 1;
		if (n == 0)
			return 0;
		if (n < 0) {
			sign = -1;
			n = -n;
		}
		int reverse = 0;
		while (n != 0) {	
			reverse = (reverse * 10) + (n % 10);
			n /= 10;
		}
		return sign * reverse;
	}
}
