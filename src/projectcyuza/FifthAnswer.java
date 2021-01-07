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
public class FifthAnswer {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,3, 9};
		int[] b = {7, 1};
		int[] c = a5(b, a);
		for (int i = 0; i < c.length; i++) {
			System.out.println("Result:" + c[i]);
		}
	}

	static int[] a5(int[] first, int[] second) {
		if (first == null || second == null) 
		{
			return null;
			}
		if (first.length == 0 || second.length == 0) 
		{
			return new int[0];
			}
		int min = (first.length < second.length) ? first.length : second.length;
		int[] a, b;
		if (min == first.length) {
			a = first;
			b = second;
		} 
		else {
			a = second;
			b = first;
		}
		int[] c = new int[min];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) 
				{
					c[k] = a[i];
					k++;
				}
			}}
		int[] retArray = new int[k];
			
		for (int t = 0; t < retArray.length; t++) 
		{
			retArray[t] = c[t];
		}
		return retArray;
	}
    
}
