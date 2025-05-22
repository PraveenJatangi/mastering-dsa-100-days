import java.util.*;

public class insertionSort{

    public static void insertionSorting(int[] arr){
        int len= arr.length;
        for(int i=1;i<len;i++ ){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
             System.out.println("after sorting:"+ Arrays.toString(arr));
        }
    }
    public static void main(String[] args){
    
         int[] arr={2,5,3,1,4};
        insertionSorting(arr);
         System.out.println("after sorting:"+ Arrays.toString(arr));
    }
}
