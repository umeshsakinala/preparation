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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> li = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int n = qu.size();
            for(int i=0; i<n; i++) {
                TreeNode temp = qu.poll();
                l.add(temp.val);
                if(temp.left != null) {
                    qu.add(temp.left);
                }
                if(temp.right != null) {
                    qu.add(temp.right);
                }
            }
            li.add(l);
        }
        return li;
    }
}