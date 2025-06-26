class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        List<Integer> res = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                res.add(matrix[top][j]);
            }
            for(int i=top+1;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            if(top<bottom && left<right){
                for(int j=right-1;j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
                for(int i=bottom-1;i>top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }
}