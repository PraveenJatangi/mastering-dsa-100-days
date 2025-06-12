import java.util.Arrays;
import java.util.*;
public class Anagram {
      public static void main(String[] args){
           String str1="care";
           String str2="race";

           str1=str1.toLowerCase();
           str2=str2.toLowerCase();
  
           if(str1.length()==str2.length()){
  
              char[] str1charArray=str1.toCharArray();
              char[] str2charArray= str2.toCharArray();
              
              Arrays.sort(str1charArray);
              Arrays.sort(str2charArray);
              
              boolean result=Arrays.equals(str1charArray,str2charArray);
              if(result){
                  System.out.println("yes given strings are anagrams");
              }
              else{
                  System.out.println("noo they are not anagrams");
              }
           }
           else{
              System.out.println("noo they are not anagrams");
           }
            
    }

    
    /*HashMap*/ 

     public static boolean isAnagram(String str1, String str2) {
        
        if (str1.length() != str2.length()) return false;  
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!freqMap.containsKey(c)) {
                return false; 
            }
            freqMap.put(c, freqMap.get(c) - 1);

            if (freqMap.get(c) < 0) {
                return false; 
            }
        }
        return true;
    }
}



   
   