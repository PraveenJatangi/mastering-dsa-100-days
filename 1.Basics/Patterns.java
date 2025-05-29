 public class Patterns{
//    1
//   212
//  32123
// 4321234
    public static void main(String[] args){
         int n=4;
        for(int i=1;i<=n;i++){

            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
             System.out.println("");
        }
        
    }
}
