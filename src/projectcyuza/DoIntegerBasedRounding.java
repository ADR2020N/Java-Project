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
public class DoIntegerBasedRounding {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5};
		int len = 100;
		

		int[] c = doIntegerBasedRounding(a,len);
		for (int i = 0; i < c.length; i++) {
                     
			System.out.print(c[i]+" ");
		}	
	}

	static int [] doIntegerBasedRounding(int[] values, int n)
	{
	    if (n > 0)
	    {
	        for (int i=0; i<values.length; i++)
	        {
	            if (values[i] > 0)
	            {
	                int rem = values[i]%n;
	                values[i] = values[i] - rem + (rem>=n/2 ? n : 0);
	            }
	        }
	    }
		return values;
	}
    
}
    