public class RemoveSpaces {
     public static void removeSpacesFromString( String one) {
          StringBuilder result = new StringBuilder();
          for(char ch:one.toCharArray()){
                  if(ch!=' ') result.append(ch);
          }
        System.out.println(result.toString());
     }
    
    public static void main(String[] args) {
       String one="ba b ad";    
       removeSpacesFromString(one);

    }
}


