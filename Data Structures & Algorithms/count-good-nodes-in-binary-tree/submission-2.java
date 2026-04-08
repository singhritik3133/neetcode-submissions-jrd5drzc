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
    public int goodNodes(TreeNode root) {
        if(root==null)return 0;

        int count=0;
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root, root.val));

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){

                Pair p=queue.poll();
                TreeNode node = p.node;
                int maxSoFar = p.max;
                if(node.val >= maxSoFar) count++;
                int newMax = Math.max(maxSoFar, node.val);

                if (node.left != null) queue.offer(new Pair(node.left,newMax));
                if (node.right != null) queue.offer(new Pair(node.right,newMax));
            
            }
            
        }
        return count;
        

    }

}
class Pair {
    TreeNode node;
    int max;

    Pair(TreeNode node, int max){
        this.node = node;
        this.max = max;
    }
}
