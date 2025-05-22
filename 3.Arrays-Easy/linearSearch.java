import java.util.Arrays;

public class linearSearch {
        public static int searchLinearly(int[] arr, int num){
          
            for(int i=0;i<arr.length;i++){
                 if(arr[i]==num){
                    return i;
                 }
            }
     return -1;
    }
    public static void main(String[] args){
        int arr[]={1,0,2,0,3,0,4,0,5};
       System.out.println( searchLinearly(arr,5));
       
    }
}
