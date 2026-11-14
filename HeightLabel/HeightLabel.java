public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null; 
        TreeNode root = new TreeNode(0);
        if ((t.left == null) && (t.right == null)) {
            root.info = 1;
            return root;
        }
        root.left = rewire(t.left);
        root.right = rewire(t.right);
        if (root.left == null) {
            root.info = 1 + root.right.info;
            return root;
        }
        if (root.right == null) {
            root.info = 1 + root.left.info;
            return root;
        }
        root.info = 1 + Math.max(root.left.info, root.right.info);
        return root;
    }
}