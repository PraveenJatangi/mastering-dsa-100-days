import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateByK {
    
    public static void rotateLeftRight(int arr[], int k){
        int len=arr.length;
        int[] array= new int[k];
        for(int i=0;i<k;i++){
            array[i]=arr[i];
        }
        for(int j=0;j<len-k;j++){
            arr[j]=arr[k+j];
        }      
        for(int remaining=len-k;remaining<len;remaining++){
              arr[remaining]=array[remaining-len+k];
        }      
    }
     public static void rotateRight(int arr[], int k){
        int len=arr.length;
         k=k%len;
        int[] array= new int[k];
        for(int i=0;i<k;i++){
            array[i]=arr[len-k+i];
        }
         for(int j=0;j<len-k;j++){
            arr[len-j-1]=arr[len-k-j-1];
         }        
         for(int first=0;first<k;first++){
            arr[first]=array[first];
         }
       
    }
    public static void main(String[] args){
        int[] arr={ 1,2,3,4,5,6,7};
        // rotateLeftRight(arr, 2);
        rotateRight(arr, 11);
        System.out.println(Arrays.toString(arr));

    }
}
