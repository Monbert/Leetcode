/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start

// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Solution solution = new Solution();
//         // Create a test case
//         int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         // Get the answer
//         List<Integer> answer = solution.spiralOrder(matrix);
//         // Print the answer
//         System.out.println("answer");
//         // for(int i=0;i<answer.length;i++){
//         //     System.out.println(answer[i]);
//         // }
//     }
// }


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<Integer>();

        if (matrix.length == 0){
            return res;
        }

        int rowBegin = 0, rowEnd = matrix.length-1, 
        colBegin = 0, colEnd = matrix[0].length-1;

        while (rowBegin<=rowEnd && colBegin<=colEnd) {
            for(int i = colBegin;i<=colEnd;i++) {
                // matrix[rowBegin][i] = curNum++;
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            for(int i = rowBegin;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for(int i = colEnd;colBegin<=i;i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for(int i = rowEnd;rowBegin<=i;i--){
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }

        return res;
    }
}
// @lc code=end

