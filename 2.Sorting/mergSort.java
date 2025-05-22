import java.util.ArrayList;
import java.util.Arrays;

public class mergSort { 
    public static void mergSorting(int[] arr, int left , int right ){
        if(left<right){
            int mid = (left+right)/2;
          mergSorting(arr, left, mid);
          mergSorting(arr, mid+1, right);
          merge(arr,left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid,int right){       
        ArrayList<Integer> temp = new ArrayList<>();
        int i = left;     
        int j = mid + 1;   
        while (i <= mid && j <=right) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++; }
        while (j <= right) {
            temp.add(arr[j]);
            j++;}
        for (int k = left; k <= right; k++) {
            arr[k] = temp.get(k-left );
        }
    }


    public static void main(String[] args){
        int arr[]={8,6,4,2,1,5,3,9,7};
        mergSorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

