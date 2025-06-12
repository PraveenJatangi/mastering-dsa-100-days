public class searchElement {
    
    static int searchElementBinary(int[] nums,int k){

        // binary search
        int start=0; int end=nums.length-1;
      
        while(start<=end){
            int  mid= (start+end)/2;
            if(nums[mid]==k)  return mid ;
            else if (nums[mid]<k) 
            start=mid+1;
            else{
                end=mid-1;
            }
        }
      return 0;
        
    }
    public static void main(String[] args){
        int[] arr ={-1,2,3,4,5,6,7,8,9};
        int find=5;
        System.out.println(searchElementBinary(arr,find));;
    }
}
