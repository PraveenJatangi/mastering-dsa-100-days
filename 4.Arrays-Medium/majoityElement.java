import java.util.HashMap;
import java.util.Map;

public class majoityElement {
    
    public static int majorityElement(int[] nums){       
          int halfArr= nums.length/2;
           for(int i=0;i<nums.length;i++){
                    int count=0;
                    for(int j=i;j<nums.length;j++){
                         if(nums[i]==nums[j]){
                            count++;
                         }
                    } 
                    if(count>halfArr){
                        return nums[i];
                    }
           }
            
        return -1;
    }
    // using HashMap
       public static int majorityElementMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    // mooies voting algoritham
    
    public static int mooresMajorityAlg(int arr[]){
        
        int count=0;
        int element=0;
        for( int num :arr){
            if(count==0){
                element=num;
            }
            count+=(num==element)?1:-1;
        }
         count=0;
        for(int num :arr){
          if(num==element){
            count++;
          }
        }
        return count>arr.length/2?element:-1;

    } 

    public static void main(String[] args){
       int arr[]= {1,2,2,2,2,2,4,1};
       System.out.println(mooiesMajorityAlg(arr));
    }
}
