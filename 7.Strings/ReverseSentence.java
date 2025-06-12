public class ReverseSentence{
    public static String reverseString(String str){
       String ans="", temp=""; int left=0, right=str.length();

       while(left<right){
       char ch=str.charAt(left);
          if(ch !=' ') temp+=ch; 
          else {
            if(!ans.equals("")){    ans=temp +" " + ans;      }
            else{   ans=temp;      }
             temp="";
          }   
            left++;   
       }
       if(!temp.equals("")){
           if(!ans.equals("")){
            ans=temp+" "+ans;
           }
           else{
             ans=temp;
           }
       }
        return ans;
    }

    public static void main(String[] args){
        String str="My Name is nani";

        System.out.println(reverseString(str));
    }
}