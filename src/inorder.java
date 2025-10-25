{
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> tree = new ArrayList<>();

    if(root==null)
        return tree;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode temp = root;

    while (temp != null || !stack.isEmpty()) {
        while (temp != null) { // Push all left nodes
            stack.push(temp);
            temp = temp.left;
        }

        temp = stack.pop(); // Process the node
        tree.add(temp.val);
        temp = temp.right; // Move to the right node
    }return tree;
}
}