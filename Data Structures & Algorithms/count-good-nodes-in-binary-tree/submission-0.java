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
    public int dfs(TreeNode root, int value) {
        if(root == null) {
            return 0;
        }
        int result = root.val >= value ? 1 : 0;
        value = Math.max(value, root.val);
        result = result + dfs(root.left, value);
        result = result + dfs(root.right, value);
        return result;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}
