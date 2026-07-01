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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        List<Integer> li = new ArrayList<Integer>();
        qu.add(root);
        while(!qu.isEmpty()) {
            int n = qu.size();
            TreeNode right = null;
            for(int i=0; i<n; i++) {
                TreeNode temp = qu.poll();
                right = temp;
                if(temp.left != null) {
                    qu.add(temp.left);
                }
                if(temp.right != null) {
                    qu.add(temp.right);
                }
            }
            if(right != null) {
                li.add(right.val);
            }
        }
        return li;
    }
}
