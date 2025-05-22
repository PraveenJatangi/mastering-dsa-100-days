import java.util.Arrays;

public class moveZerosToEnd{

    public static void moveZeros(int[] arr){
        // int temp[]=new int[arr.length];
          int j=0;
             for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[j]=arr[i];
                    j++;
                }
             }
             while(j<arr.length){
                arr[j]=0;
                j++;
             }
             System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args){
        int arr[]={1,0,2,0,3,0,4,0,5};
        moveZeros(arr);
       
    }
}