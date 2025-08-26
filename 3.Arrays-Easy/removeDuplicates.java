
import java.util.HashSet;
public class removeDuplicates {
    
      public static int removeDup(int[] arr){
        
         HashSet<Integer> set= new HashSet<Integer>();
         
         for(int i=0;i<arr.length;i++){
                 set.add(arr[i]);
         }
         int k = set.size();
         int j=0;
         for(int x: set){
            arr[j]=x;
            j++;
         }
         return k;
    
    }

    public static void main(String[] args){
        int [] arr={3,2,6,6,6,9,4,10};
        

      
    }
}
