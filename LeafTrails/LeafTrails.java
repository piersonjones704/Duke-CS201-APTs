import java.util.*;

public class LeafTrails {
    // key in map is a leaf int
    // associate value for each int is the path
    Map<Integer,String> myMap = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        doPaths(tree,"");
        return myMap.values().toArray(String[]::new);
        // String[] ret = new String[myMap.size()];
        // return ret;
    }
    // path is correct to tree
    private void doPaths(TreeNode tree, String path) {
        if (tree == null) return;
        // leaf node
        if (tree.left == null && tree.right == null) {
            myMap.put(tree.info,path);
        }
        doPaths(tree.left,path+"0");
        doPaths(tree.right,path+"1");
    }
}
