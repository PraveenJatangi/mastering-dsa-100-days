public class maxSubArraySum {
    
    public static void maxSubArray(int nums[]){

          int maxSum=Integer.MIN_VALUE;

          for(int i=0;i<nums.length;i++){  
                 int count=0;
            for(int j=i;j<nums.length;j++){        
                    count+=nums[j];   
                  maxSum=Math.max(maxSum,count);    
                }
            }
          System.out.println(maxSum);
    }

    //Kadanes ALg
     public static void kadasnesAlg(int nums[]){

          int maxSum=Integer.MIN_VALUE;
          int count=0;
          int tempStart=0;
          int start=0;
          int end=0;
          for(int i=0;i<nums.length;i++){  
                count+=nums[i];
               // maxSum=Math.max(maxSum, count);
               if(count>maxSum){
                  maxSum=count;
                  start=tempStart;
                  end=i;
               }
                if(count<0) {
                    count=0; 
                    tempStart=i+1;
                } 
            }
          System.out.println(maxSum+" start: "+start+" end: "+end );
    }

    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        kadasnesAlg(arr);
    }
}
