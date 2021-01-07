package projectcyuza;

public class MagicArray {

    public static void main(String[] args) {
        int n[] = {39,3,5,7, 9, 11,13, 4, 6};
        int res = isMagicArray(n);
        System.out.println(res);
    }

    static int isMagicArray(int[] a) {
        int sum = 0;
        int ismagic = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > 1) {
                if (a[i] % 2 != 0 && a[i] % 3 != 0 || a[i] == 3) {
                    sum =(sum+a[i]);
                  
                }
            
            }
        }
                if (sum == a[0]) {
                    ismagic = 1;
                    
                } else {
                    ismagic = 0;
                }
        if (ismagic == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
