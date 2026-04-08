/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int hgtLeft=height(root.left);
        int hgtRight=height(root.right);
        int bothHgt=hgtLeft+hgtRight;
        int leftDia=diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);

        return Math.max(bothHgt,Math.max(leftDia,rightDia));
        
        
        
    }
    public int height(TreeNode root){
        if (root==null)return 0;
        return 1+Math.max(height(root.left) , height(root.right));
    }
}
