# HeightLabel APT

## Class

```java
public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        // replace with working code
        return null;
    }
}
```

The `TreeNode` class is provided when the method is tested:

```java
public class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { info = x; }
    TreeNode(int x, TreeNode lNode, TreeNode rNode) { info = x; left = lNode; right = rNode; }
}
```

**Tree notation in the examples:** a tree is written as its pre-order traversal, with each null child written as `x`. For example, the tree with root 8, left subtree rooted at 4 (whose right child is 6), and right subtree rooted at 12 (whose children are 10 and 15) is written `8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x`.

## Problem Statement

Write method `rewire` that returns a new tree with the same shape (isomorphic) as the tree parameter, but in which each node's `info` field is equal to that node's height in the tree.

The values in the tree passed in don't matter. Height is measured in nodes: it is the length of the longest path from that node down to a leaf, so a leaf has height 1.

The big-O complexity of your code doesn't matter.

## Parameters

| Name | Type | Description |
|---|---|---|
| `t` | `TreeNode` | The root of the original tree (never empty). |

## Returns

`TreeNode` — the root of a new tree with the same shape as `t`, where every node's `info` is that node's height.

## Constraints

- Tree `t` will not be empty; it has at least one node.
- The trees will have at most 1,024 nodes.
- The trees will have a height of at most 1,024.

## Examples

**1.** A single node has height 1; the original value (55) is ignored.

```
t = {55, x, x}
returns {1, x, x}
```

**2.** The root has height 4; the left subtree is a chain of height 2 and 1, and the right subtree has height 3.

```
t = {1, 2, 3, x, x, x, 4, 5, 6, x, x, 7, x, x, 8, x, x}
returns {4, 2, 1, x, x, x, 3, 2, 1, x, x, 1, x, x, 1, x, x}
```

**3.** The tree is already labeled with its heights, so it comes back unchanged.

```
t = {4, 2, 1, x, x, x, 3, 2, 1, x, x, 1, x, x, 1, x, x}
returns {4, 2, 1, x, x, x, 3, 2, 1, x, x, 1, x, x, 1, x, x}
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
