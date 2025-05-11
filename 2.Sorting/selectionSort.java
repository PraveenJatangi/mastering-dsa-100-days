import java.util.*;

public class selectionSort{

    public static void selectionSorting(int[] arr){
        int len= arr.length;
        for (int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

            
            
        }
        
    }

    // public staic void 

   public static void main(String[] args){
    
         int[] arr={2,5,3,1,4};
         selectionSorting(arr);
         System.out.println("after sorting:"+ Arrays.toString(arr));
    }
}
