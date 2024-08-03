class Solution {
    public void rotate(int[][] matrix) {
        // to rotate a matrix first we need to do transpose of the matrix
        // then reverse each row

        // transpose
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for(int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;
            while(left <= right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}