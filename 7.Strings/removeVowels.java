public class removeVowels {
      public static void removeSpacesFromString( String one) {
          StringBuilder result = new StringBuilder();
          for(char ch:one.toCharArray()){
                  if(!isVowel(ch)&&ch!=' ') result.append(ch);
          }
        System.out.println(result.toString());
     }
    public static boolean isVowel(char ch){
      return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public static void main(String[] args) {
       String one="ba b ad";    
       removeSpacesFromString(one);

    }
}
