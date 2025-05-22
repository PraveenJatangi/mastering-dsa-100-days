import java.util.Arrays;

public class moveArrayToOneStep {

    public static void moveArray(int[] arr ){
        int key = arr[0];
        int arrLen=arr.length;
        for(int i=1; i<arrLen;i++){
              arr[i-1]=arr[i];
        }
        arr[arrLen-1]=key;

    }
    public static void main(String[] args){
           int arr[]={1,2,3,4,5,6,7,8,9};
           moveArray(arr);
           System.out.println(Arrays.toString(arr));

    }
}
