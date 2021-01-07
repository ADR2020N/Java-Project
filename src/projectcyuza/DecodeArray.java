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
public class DecodeArray {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {111, 115, 118, 127, 125};

		int c = decodeArray(b);
		System.out.println("Result:" + c);
	}

	static int decodeArray(int[] a) {
		int res2 = 0;
		int res1 = 0;

		for (int i = 0; i < a.length - 1; i++) {

			res1 = Math.abs(a[i] -a[i + 1]);

			res2 = res2 * 10 +res1;
		}
		if(a[0]<0)
		return res2*-1;
		else
			return res2;
	}
    
}
