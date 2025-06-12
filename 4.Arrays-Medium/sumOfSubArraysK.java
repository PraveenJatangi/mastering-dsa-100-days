import java.util.*;

public class sumOfSubArraysK {
    
    public static int sunOfSub(int [] arr, int k){
    int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                  sum+=arr[j];
                  if(sum==k){
                    count++;
                  }
            }
            }
            return count;
        }
        
    //prefix sum and hashmap
     
    public static int sunOfSubMap(int [] arr, int k){
    int count=0;
    int preFixSum = 0;
    Map<Integer,Integer> sum = new HashMap<>();

      sum.put(0,1);

        for(int i=0;i<arr.length;i++){
               preFixSum+=arr[i];

               int rem= preFixSum-k;

               count+=sum.getOrDefault(rem,0);
 
                sum.put(preFixSum,sum.getOrDefault(preFixSum,0)+1);

            }
            return count;
        }

    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        int k=5;
             System.out.println(sunOfSubMap(arr,k ));
    }
}
