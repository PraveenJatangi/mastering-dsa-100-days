public class Main{
 
     public static String LargestCommonPrefix(String[] str){
           if(str.length==0||str==null) return "";

           for(int i=0; i<str[0].length();i++){
            char c = str[0].charAt(i);

            for(int j=1;j<str.length;j++){
                 if(str[j].charAt(i)!=c||i>=str[j].length()){
                       return str[0].substring(0,i);
                 }
            }
           }
         
        return str[0];
     }
    
     public static void main(String[] args){
        String str[]={"flower","flow","fl"};
        System.out.println(LargestCommonPrefix(str));
     }
    }