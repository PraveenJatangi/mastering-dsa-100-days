import java.util.*;


public class spiralMatrix {
   
    
    public static List<Integer> printSpiralMatrix(int[][] matrix){
          int row=matrix.length;
          int col= matrix[0].length;
          List<Integer> spiralValues= new ArrayList<>();

          int top=0,left=0,right=col-1,bottom=row-1;

          while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                 spiralValues.add(matrix[top][i]);
        }
        top++;
       
        for(int i=top;i<=bottom;i++){
                 spiralValues.add(matrix[i][right]);
        }
        right--;
       
        if(top<=bottom){
         for(int i=right;i>=left;i--){
                 spiralValues.add(matrix[bottom][i]);
        }
        bottom--;
       }
         if(left<=right){
            for(int i=bottom;i>=top;i--){
                 spiralValues.add(matrix[i][left]);
        }
        left++;
         }
          }
    
        return spiralValues;
    }
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printSpiralMatrix(arr)); 
          
    }
    }



