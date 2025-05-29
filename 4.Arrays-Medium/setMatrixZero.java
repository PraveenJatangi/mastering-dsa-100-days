
public class setMatrixZero {
    public static int[][] setZero(int[][]arr){   
        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i] || colZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    /*
 time and space
 Time: O(N × M) — One pass to mark, one pass to set.

Space: O(N + M) — Boolean arrays for rows and columns.
 */

   public static int[][] setZeroOptimal(int[][]arr){   
        int rows = arr.length;
        int cols = arr[0].length;

        boolean matrixRow=false;
        boolean matrixCol=false;

        for(int i=0;i<rows;i++){
            if(arr[0][i]==0) matrixRow=true;
        }
        for(int j=0;j<cols;j++){
            if(arr[j][0]==0) matrixCol=true;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (arr[i][0]==0 || arr[0][j]==0) {
                    arr[i][j] = 0;
                }
            }
        }
       for(int i=0;i<rows;i++){
            if(matrixRow) arr[0][i]=0;
        }
        for(int j=0;j<rows;j++){
            if(matrixCol) arr[j][0]=0;
        }
        
        return arr;
    }

    public static void main(String[] args){
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        setZeroOptimal(arr);
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                   System.out.println(arr[i][j]);
                  }
            }
        }
    }

