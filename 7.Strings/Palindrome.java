public class Palindrome {
    
    public static boolean isPalindrome(String str){

        int left=0;
        int right=str.length()-1;
       
        while(left<str.length()/2){
            if(str.charAt(left)!=str.charAt(right)){
               return false;
            }   
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String str="HEEEEEEH";
       System.out.println( isPalindrome(str));
    }
}
