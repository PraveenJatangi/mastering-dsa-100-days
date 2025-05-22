
import java.util.*;
public class quickSort {
    
public static void swap(int[] arr, int index, int j){
     int temp = arr[index];
                arr[index]= arr[j];
                arr[j]=temp;
            }
 public static int partition(int[] arr, int start, int end){ 
         int index= start-1;
         int pivot= arr[end];
         for(int j=start;j<end;j++){
             if(arr[j]<=pivot){
                index++;
                swap ( arr,index,j); }   
         }
         index++;
        swap(arr,index,end);
        return index;
    }
    public static void quickSorting(int[] arr, int start, int end){
     if(start<end){
        int pivotIdx= partition( arr,start, end );
        quickSorting(arr, start, pivotIdx-1);
        quickSorting(arr, pivotIdx+1, end);
     }
    }
    public static void main(String[] args){
        int arr[]={2,3,4,5,1,6,9,8};
        quickSorting(arr, 0,arr.length-1 );
        System.out.println(Arrays.toString(arr));
    }
}
