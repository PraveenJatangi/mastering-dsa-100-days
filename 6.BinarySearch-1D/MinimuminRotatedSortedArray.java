public class MinimuminRotatedSortedArray {
    public static int minimumNum(int[ ] nums){
           int start=0; int end=nums.length-1;
           int MinTarget=Integer.MAX_VALUE;
        while(start<=end){
            int  mid= (start+end)/2;
            

            if(nums[start]<=nums[mid]){
               MinTarget=Math.min(MinTarget,nums[start]);
               start=mid+1;
            } 
            else{
                  MinTarget=Math.min(MinTarget,nums[mid]);
                    end=mid-1;
                }

            }
            return MinTarget;
            
        }
         public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8,9};
        
        System.out.println(minimumNum(arr));;
    }
    }


