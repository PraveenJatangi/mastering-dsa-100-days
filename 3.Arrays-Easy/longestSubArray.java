import java.util.*;
public class longestSubArray {
    
    public static int longestArray(int[] arr, int k){
           
        int [] copy = arr.clone();
            Arrays.sort(copy);
            int val=0;
            int count =0;
        for(int i=0;i<arr.length;i++){
            if(val+copy[i]<=k){
                val=val+copy[i];
                count++;
            }else{
               break;
            }   
        }
        return count;
    }

    //using two loops

     public static int getLongestSubarray(int []a, long k) {
        int n = a.length; 
        int len = 0;
        for (int i = 0; i < n; i++) { 
            long s = 0;
            for (int j = i; j < n; j++) { 
                s += a[j];
                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    //using hashmap and prefix 
     
    public static int maxSubArray(int nums[],int k){
            int maxLen=0;
            Long sum=0L;
            Map<Long, Integer> preFix= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];

                if(sum==k){
                   maxLen=Math.max(maxLen,i+1);
                } 
                Long rem = sum-k;
               if( preFix.containsKey(rem)){
                   
                  int len = i-preFix.get(rem);
                  maxLen= Math.max(maxLen,len);
               }
                if(!preFix.containsKey(sum)){
                    preFix.put(sum,i);
                }
            }

    System.out.println("max arr");
        return maxLen;
        
    }

    //two pointers approch
    
    public static int getLongestSubarray2(int []a, long k) {
        int n = a.length;

        int left = 0, right = 0; 
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            } 
            right++;
            if (right < n) sum += a[right];
        }
        return maxLen;
    }




    
    public static void main(String[] arrgs){
        int arr[]={-1,1,1};
        int k=1;
        System.out.println(maxSubArray(arr, k));
    }
}
