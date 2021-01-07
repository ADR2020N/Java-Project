package projectcyuza;

public class MatchPattern {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3 };
		int len = a.length;
		int[] b = { 1, 2,3,9};
		int patternLen = b.length;

		int c = matchPattern(a, len, b, patternLen);

		System.out.println("Result:" + c);

	}

	static int matchPattern(int[] a, int len, int[] pattern, int patternLen){

		int i = 0;
		int k = 0;
		int matches = 0;

		for (i = 0; i < len; i++) {
			if (a[i] == pattern[k])
				matches++;
			else if (matches == 0 || k == patternLen - 1)
				return 0;
			else {
				k++;
				if (a[i] == pattern[k])
					matches++;
				else
					return 0;
			}
		}
		if (i == len && k == patternLen - 1)
			return 1;
		    else
			return 0;
	}
}
