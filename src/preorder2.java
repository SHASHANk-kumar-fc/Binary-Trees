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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return tree;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            tree.add(temp.val);
            if(temp.right!=null){
                stack.add(temp.right);}
            if(temp.left!=null){
                stack.add(temp.left);
            }



        } return tree;
    }
}