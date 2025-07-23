class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow = false, firstcol = false;
        
        //setting firstrow and firstcol to 0 of that row and col if seen any zero in the matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstrow = true;
                    if(j==0) firstcol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //replace the matrix with 0 where firstrow or firstcol are 0
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //converting firstrow and col to 0 if 0 is there, if not the letting them the same
        if(firstrow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstcol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}