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
    int dim=0;
    public int Check(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Check(root.left);
        int right=Check(root.right);
        dim=Math.max(dim,right+left);
        return 1+Math.max(left,right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        Check(root);
        return dim;
    }
}