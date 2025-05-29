import java.util.Arrays;

public class nextPermutation {
    
    public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
       }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
       }
    public static void nextPermutation1(int[] nums){
  
    //step 1: find the pivot 
     int pivot=-1;
     for(int i=nums.length-2;i>=0;i-- ){
             if(nums[i]<nums[i+1]){
                pivot=i;
                break;
             } }
      if(pivot==-1){
           reverse(nums,0,nums.length-1);
           return;
         }
      // step 2: swap the pivot and last value if it is greater thn pivot
     for(int j=nums.length-1;j>pivot;j--){
            if(nums[j]>nums[pivot]){
                swap(nums,pivot,j);
                break;
            }
     }
     //step 3: Reverse the remaining elements to make next lesser combination
     reverse(nums, pivot+1, nums.length-1);

   }
    public static void main(String[] args){
        int arr[]={1,2,5,4,3};
       nextPermutation1(arr);
       System.out.println(Arrays.toString(arr));
    }
}
