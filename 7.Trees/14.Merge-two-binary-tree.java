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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null){

            return null;
        }

        int val1 = root1 != null? root1.val:0;
        int val2 = root2 != null? root2.val:0;


        TreeNode root = new TreeNode(val1 + val2);


        //merge left side 

        root.left = mergeTrees((root1 != null && root1.left != null ) ? root1.left:null,
                                (root2 != null && root2.left != null) ? root2.left:null);


       //merge right side if there is no null

        root.right = mergeTrees((root1 != null && root1.right != null) ? root1.right: null,
                                (root2 != null && root2.right != null) ? root2.right: null);

        
        return root;
                
    }
}