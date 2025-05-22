public class secondLargestWithoutSorting {

     public static int secondLargest(int[] arr){
         if(arr.length<=2)
        return -1;
    
        int larger= Integer.MIN_VALUE;
        int second_large= Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
             if(arr[i]>larger){
                second_large=larger;
                larger=arr[i];
             }		
             else if (arr[i] > second_large && arr[i] != larger){
			second_large = arr[i];
            }
        }
        return second_large;
    }
    public static void main(String[] args){
        int [] arr={3,2,1};
       int largest= secondLargest(arr);
        System.out.println(largest);
    }
}
