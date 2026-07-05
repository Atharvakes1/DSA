class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        // If the total number of elements doesn't match, the reshape is illegal
        if (m * n != r * c) {
            return mat;
        }
        
        int[][] reshapedMat = new int[r][c];
        
        // Map elements from the old matrix to the new one
        for (int i = 0; i < m * n; i++) {
            reshapedMat[i / c][i % c] = mat[i / n][i % n];
        }
        
        return reshapedMat;
    }
}