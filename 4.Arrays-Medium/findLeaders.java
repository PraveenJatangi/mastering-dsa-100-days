import java.util.ArrayList;
import java.util.Collections;

public class findLeaders {
    
    public static ArrayList<Integer> leader( int[] arr){
         
        ArrayList<Integer> leadArray= new ArrayList<>();   
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        leadArray.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leadArray.add(maxFromRight);
            }
        }
        Collections.reverse(leadArray);

        return leadArray;
    }

    
    public static void main(String[] args){
        int arr[]={5,1,2,3,1,2};
        System.out.println(leader(arr));
    
    }
}
