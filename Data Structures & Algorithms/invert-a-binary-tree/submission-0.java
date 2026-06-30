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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        while(qu.isEmpty() == false) {
            TreeNode tree = qu.poll();
            TreeNode temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;
            if(tree.left != null) {
                qu.offer(tree.left);
            }
            if(tree.right != null) {
                qu.offer(tree.right);
            }
        }
        return root;
    }
}
