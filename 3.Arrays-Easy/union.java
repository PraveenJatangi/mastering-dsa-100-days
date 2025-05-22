import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class union {
    
    public static void unionArray(int[] arr1, int[]arr2){
         
        Set<Integer> set = new HashSet<>();
           for(int i:arr1){
              set.add(i);
           }
           for(int j : arr2){
            set.add(j);
           }
           List<Integer> union= new ArrayList<>(set);
           Collections.sort(union);
           System.out.println(union);
    }

    public static void main(String[] args){
       int[] arr1 = {11, 2, 17, 8, 6};
       int[] arr2 = {3, 5, 12, 1};


        unionArray(arr1, arr2);
    }
}
