import java.util.ArrayList;
import java.util.Collections;

public class reArrangeArrayWithSign{
     public static ArrayList<Integer> reAranngeArray(int[] arr){
         int n = arr.length;
        ArrayList<Integer> newArr= new ArrayList<>(Collections.nCopies(n,0));  
               int pos=0,neg=1;
            for(int i=0;i<arr.length;i++){
                  if(arr[i]>0){
                     newArr.set(pos,arr[i]);
                     pos+=2;
                  }else{
                    newArr.set(neg,arr[i]);
                    neg+=2;
                  }
        }      
         return newArr;
     }
    public static void main(String[] args){
        int arr[]={1,2,3,-1,-2,-3};
 System.out.println(reAranngeArray(arr));
    }
}