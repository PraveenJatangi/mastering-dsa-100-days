import java.util.*;
public class bubbleSort{

    public static void bubbleSorting(int[] arr){
       int len= arr.length;
    boolean swap ;
       for(int i=0;i<len;i++){
            swap=false;
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;       }      }
          
                    if(!swap){  break;   }   
            }
       System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void main(String[] args){
    
         int[] arr={2,5,3,1,4};
         bubbleSorting(arr);
    }
}
