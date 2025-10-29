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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ltrLogic = -1; // 1 = Left→Right, -1 = Right→Left

        while (!queue.isEmpty()) {
            ltrLogic *= -1;   // Flip traversal direction
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode polled = queue.poll();
                if (polled.left != null) queue.add(polled.left);
                if (polled.right != null) queue.add(polled.right);
                list.add(polled.val);
            }

            if (ltrLogic == -1)
                Collections.reverse(list); // Reverse for Right→Left levels

            ans.add(list);
        }

        return ans;
    }
}