public class RemoveParanthesis {
    
    public static String removePara(String str){

        if(str==null || str.length()<2)return str;
        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
            int balance=0;
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)=='(') balance++;
                if(str.charAt(i)==')') balance--;
                if(balance==0 && i<str.length()-1)return str;
            }
            return str.substring(1, str.length()-1);     
        }
        return str;
    }

    public static void main(String[] args){
        String str= "(((a+b)))" ;
        System.out.println(removePara(str));
    }

}
