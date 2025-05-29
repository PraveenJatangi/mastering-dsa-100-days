import java.util.HashMap;
import java.util.*;;
public class twoSum{
     public static void twoSum1(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                  if(nums[i]+nums[j]==k){
                    System.out.println("yes");
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    return;
                  }
                  
             }
             
        }
       System.out.println("No valid pair found");
        
     }
     //Hashmap
     
     public static void twoSum2(int[] nums, int k){
       
       HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num= nums[i];
            int rem= k-num;
              if(mapp.containsKey(rem)){
                  System.out.println("yes");
                  System.out.println(mapp.get(rem));
                  System.out.println(i);
                  return;
             }
             mapp.put(num,i);
             
        }
       System.out.println("no");
        
     }
     
   

    public static void main(String[] args){
       int arr[]={1,2,3,4,5};
       int sum=7;
       twoSum2(arr, sum);
    }
}