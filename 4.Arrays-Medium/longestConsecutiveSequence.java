import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    
// brute force 

     public static boolean linearSearch(int[] arr,int x){
          for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
          }
          return false;
     }
    public static int longestSequence(int[] arr){
               
          int longest=1;
          for(int i=0;i<arr.length;i++){
               int x= arr[i];
               int count=1;
               while(linearSearch(arr,x+1)==true){
                   x+=1;
                   count+=1;   
               }
               longest=Math.max(longest,count);    
          }
          return longest;
    }

    // optimal using set 

    public static int longestSequenceSet(int[] arr){

        int longest=0;
        
        Set<Integer> newArr= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            newArr.add(arr[i]);
        }
        for( int val:newArr){
              if(!newArr.contains(val-1)){
                 int x=val;
                 int count=1;
                 while(newArr.contains(x+1)){
                    x+=1;
                    count+=1;
                 }
                 longest=Math.max(count, longest);
              }
        }
           return longest;
    }
    public static void main(String[] args){
        int arr[]={100,200,1,3,2,4};
        System.out.println(longestSequenceSet(arr));
    }
}
