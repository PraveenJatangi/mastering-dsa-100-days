import java.util.*;
public class Isomorphic {
     public static boolean isomorphic( String one, String two) {
        
        if(one.length()!=two.length()) return false;
        Map<Character,Character> mapOne= new HashMap<>();
        Map<Character,Character> mapTwo= new HashMap<>();

        for(int i=0;i<one.length();i++){
          char oneCh=one.charAt(i );
          char twoCh=two.charAt(i);
          if(mapOne.containsKey(oneCh)){
              if(mapOne.get(oneCh)!=twoCh) return false;
          }
          else{
            mapOne.put(oneCh,twoCh);
          }
          if(mapTwo.containsKey(twoCh)){
            if(mapTwo.get(twoCh)!=oneCh)return false;
          }
          else{
            mapTwo.put(twoCh,oneCh);
          } 
        }
         return true;

     }
    
    public static void main(String[] args) {
       String one="erg";
       String two="ada";
       System.out.println(isomorphic(one,two));

    }
}
 
//time cpmx : O(n)
// space cmpx : O(1)
