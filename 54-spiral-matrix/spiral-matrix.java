class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();
        while(colstart <= colend && rowstart <= rowend){
            //traversing right
            for(int j=colstart;j<=colend;j++){
                res.add(matrix[rowstart][j]);
            }
            rowstart++;
            //traverse down
            for(int i=rowstart;i<=rowend;i++){
                res.add(matrix[i][colend]);
            }
            colend--;
            //traverse left
            if(rowstart<=rowend){
                for(int j=colend;j>=colstart;j--){
                    res.add(matrix[rowend][j]);
                }
                rowend--;
            }
            //traverse up
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    res.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }
        return res;
    }
}