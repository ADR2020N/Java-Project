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
public class IsEvens {
    public static void main(String[] args) {
        int i =2426;
        int res = isEvens(i);
        System.out.println(res);
    }

    static int isEvens(int n) {
        int c;
        int isEven = 1;
        while (n > 0) {
            c = n % 10;
            if (c % 2 == 0) {
                n = n / 10;
                //System.out.println(n);
                if (n == 0) {
                    isEven = 1;        
                }
            } else
                  return 0;
        }
        if (isEven == 1) 
            return 1;
       else 
            return 0;
        }
    }

