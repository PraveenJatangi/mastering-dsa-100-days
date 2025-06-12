public class LargestOdd {
    
    public static String largestOdd(String str){
        for(int i=str.length()-1; i>=0; i--){
           if(str.charAt(i)%2!=0) {
                return str.substring(0, i+1);
           }  
    }
        return "No odd digit found";
}  
    public static void main(String[] args) {
        String str = "1234567890";
        System.out.println(largestOdd(str));
    }
}
