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

    boolean ans = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        isSameTree1(p,q);
        return ans;
    }

    public void isSameTree1(TreeNode p, TreeNode q) {
        // BASE CASE
        if(p == null && q==null) return;

        if(p == null || q== null){// IT MEANS THAT ONLY ONE OF p OR q IS NULL
            ans = false;
            return;
        }

        if(p.val != q.val ){
            // IF VALUE OF NODES ARE UNEQUAL THEN ANS IS False
            ans = false;
            return;
        }

        //RECURSIVE CALL
        isSameTree( p.left,q.left);
        isSameTree( p.right,q.right);

    }
}