
package projectcyuza;

public class LargestAdjacentSum {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {18, -12, 9, -10};

		int  c = largestAdjacentSum (b);
		System.out.println("Result:" + c);
	}

	static int largestAdjacentSum(int[] a) {
		int res2 = 0;
		int res1 = 60;
		
		for (int i = 0; i < a.length-1; i++) {
			res1 = a[i]+a[i+1];	               
			if (res1 > res2) {
				res2 = res1;
			}
		
		}
		return res2;

	}
}
