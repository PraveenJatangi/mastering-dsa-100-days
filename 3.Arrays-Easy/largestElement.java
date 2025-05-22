import java.util.Arrays;

public class largestElement {
    
    public static int largestEle(int[] arr){
             
        int max = arr[0];
        
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                max=arr[i];
             }
        }
        return max;
        // Arrays.sort(arr);
        // return arr[arr.length-1];
    }

    public static void main(String[] args){
        int [] arr={3,2,6,9,4,10};
       int largest= largestEle(arr);
        System.out.println(largest);
    }
}
