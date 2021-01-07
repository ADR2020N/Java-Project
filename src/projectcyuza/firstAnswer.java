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
public class firstAnswer {
    public static void main(String[] args) {
        int[] b = { 2, 2,1, 2, 4 };

		int c = a1(b);
		System.out.println("Result:" + c);
    }
    static int a1(int a[]){
       if (a == null || a.length % 2 == 0)
			return 0;

		int midIndex = a.length / 2;
		System.out.println("midIndex:" + midIndex);
		int middleItem = a[midIndex];
		System.out.println("middleItem:" + middleItem);
		for (int i = 0; i < a.length; i++) {
			if (i != midIndex && middleItem >= a[i])
				return 0;
		}
		return 1;
          
    
        
    }
}
