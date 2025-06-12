public class SearchElementinRotatedSortedArray {
   
    public int searchElement(int[] nums, int target) {
         int start=0; int end=nums.length-1;
        while(start<=end){
            int  mid= (start+end)/2;
            if(nums[mid]==target) 
             return mid ;

             //edge case for duplicate values 
            //  if(nums[start]==nums[mid] && nums[mid]==nums[end]){
            //     start=start+1;
            //     end=end-1;
            //     continue;
            //  }

            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } 
            else{
                   if(nums[mid]<=target && target<=nums[end]){
                     start=mid+1;
                }else{
                    
                    end=mid-1;
                }

            }
            
        }
      return -1;
    }

    public static void main(String[] args){
        int[] arr={7,8,1,2,3,3,4,4,5,6};
   SearchElementinRotatedSortedArray search = new SearchElementinRotatedSortedArray();

        System.out.println(search.searchElement(arr,4));
    }
}

