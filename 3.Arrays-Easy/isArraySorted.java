public class isArraySorted {
    
    public static boolean isSorted(int[] arr){

        for(int i=1; i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args){
        int arr[]={1,2,5,3,6,4,7};
       boolean isItSorted=isSorted(arr);
       System.out.println(isItSorted);
    }
}
