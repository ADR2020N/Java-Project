
package projectcyuza;

public class IsSequencedArray2 {
    public static void main(String[] args) {
        int[] a = {-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};
		//int m = -5;
		//int n = -2;

		int c = isSequencedArray(a);
		System.out.println("Result:" + c);
    }
static int isSequencedArray (int[] a){
     int max=a[0];
     int min=a[0];
     int n=max;
     int m=min;
     boolean isSquenced;
     for(int i=0;i<a.length;i++){
         isSquenced=false;
         if(n<a[i]){
           int t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;
         }
     for(int j=m;j<=n;j++){
         System.out.println(m+" "+n);
       if(a[i]==a[j]){
          isSquenced=true;
          break;
       }
     }
     if(!isSquenced){
        return 0;
     }
     }
    
    
    return 1;
}

}