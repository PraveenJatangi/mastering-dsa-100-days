public class rotateMatrix {
    
    public static void rotateMatrix(int[][] nums){
          int row=nums.length;
          
          for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<row/2;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[i][row-1-j];
                nums[i][row-1-j]=temp;
            }
        }

        


    }
    public static void main(String[] args){
        int[][] arr={{1,2},{4,5},{7,8},{10,11}};
         rotateMatrix(arr);
           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                 System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
