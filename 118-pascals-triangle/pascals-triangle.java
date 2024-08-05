class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int rowNo = 1; rowNo <= numRows; rowNo++) {
            List<Integer> row = new ArrayList<>();
            int rowElement = 1;
            row.add(rowElement);
            for(int i = 1; i < rowNo; i++) {
                rowElement = rowElement * (rowNo - i);
                rowElement = rowElement / i;
                row.add(rowElement);
            }
            result.add(row);
        }

        return result;
    }
}