public class numberAppearsOnce {
    //bruteforce solution
    public static int findnum(int[ ] nums){
        for(int i=0; i<nums.length;i++){
                int num = i;
                int count=0;
            for(int j=0;j<nums.length;j++){
                 if(nums[j]==num){
                   count++;
                 }       
            } 
            if(count==1)return num;
        }
        return -1;
    }

//optimal solution
        public static int findnum2(int[] nums){
             int xorr=0;
            for(int i=0; i<nums.length;i++){
                xorr=xorr^nums[i];        
        }
        return xorr;
    }

    //using hashing 
     public static int getSingleElement(int []arr) {
       
        int n = arr.length;

        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

      
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }    
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,2,3,3,4};
         System.out.println(findnum2(arr));
    }
}
