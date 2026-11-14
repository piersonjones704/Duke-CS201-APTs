import java.util.*;

public class PathSum {
    public int hasPath(int target, TreeNode tree){
        // replace with working code
        if (tree == null) return 0;
        if (tree.left == null && tree.right == null) {
            return tree.info == target ? 1 : 0;
            // if tree.info == target return 1 else 0
        }
        int lval = hasPath(target-tree.info,tree.left);
        int rval = hasPath(target-tree.info,tree.right);
        return (lval == 1 || rval == 1) ? 1 : 0;
    }
}