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
    public boolean isSubTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }
        if(root == null || subRoot == null) {
            return false;
        }
        if(root.val != subRoot.val) {
            return false;
        }
        return isSubTree(root.left, subRoot.left) && isSubTree(root.right, subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(qu.isEmpty() == false) {
            TreeNode temp = qu.poll();
            if(isSubTree(temp, subRoot)) {
                return true;
            }
            if(temp.left != null) {
                qu.add(temp.left);
            }
            if(temp.right != null) {
                qu.add(temp.right);
            }
        }
        return false;
    }
}
