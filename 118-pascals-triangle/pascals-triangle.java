class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        res.add(firstrow);

        if(numRows == 1) return res;

        for(int i=1;i<numRows;i++){
            List<Integer> prevrow = res.get(i-1);
            
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevrow.get(j-1) + prevrow.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}