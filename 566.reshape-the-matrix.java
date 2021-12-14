import jdk.javadoc.internal.doclets.toolkit.taglets.ReturnTaglet;

/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[r][c];
        //Flatten:                  x = (i,j)-->i * n + j
                                    //  i=x / n
                                    //  j=x % n
        if (m * n != r * c) {
            return mat;
        }
        for (int x = 0; x < n * m; x++) {
            ans[x / c][x % c] = mat[x / n][x % n];
        }
        return ans;
    }
}
// @lc code=end

