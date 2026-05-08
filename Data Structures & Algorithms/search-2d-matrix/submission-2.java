class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int left=0;
        int right=rows*columns-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            int row = mid /  columns, col = mid % columns;
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
