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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        int depth = 0;
        while(qu.isEmpty() == false) {
            int size = qu.size();
            for(int i=0; i<size; i++) {
                TreeNode tree = qu.poll();
                if(tree.left != null) {
                    qu.offer(tree.left);
                }
                if(tree.right != null) {
                    qu.offer(tree.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
