public class findMissingNumber {
    public static int missingNumber(int arr[]){
         for(int i=1; i<arr.length;i++){ 
            int falg=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    falg=1;
                    break;
                }
            }
            if(falg==0) return i;
         }
        return -1;
    }
    public static int missingNumberInEfficient(int arr[]){
        int N = arr.length+1;
         int hashArr[] =new int[N+1];

        for(int i=0; i<arr.length;i++){ 
            int num= arr[i];
             hashArr[num]++;
        }
             for(int j=1;j<=N;j++){
                if(hashArr[j]==0){
                   return j;
                }
            }
            
          return -1;
       
    }

    public static void main(String[] args){
        int arr[]={1,3,4};
        System.out.println(missingNumberInEfficient(arr));

    }
}
