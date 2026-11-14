# LeafTrails APT

## Class

```java
public class LeafTrails {
    public String[] trails(TreeNode tree) {
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

Write method `trails` that returns an array of the binary-encoded root-to-leaf paths, one for each leaf of `tree`.

- A path is encoded by going left or right from the root: going left is `0` and going right is `1`. The path left, left, right is encoded as `"001"`.
- Values stored in leaf nodes are unique (no value appears in more than one leaf).
- The strings in the returned array must be sorted by the value stored in the leaf each path leads to, from smallest to largest.

For example, in the tree from example 1 below, the leaves hold 68, 85, 75, and 69, reached by the paths `"00"`, `"01"`, `"100"`, and `"101"` respectively. Sorted by leaf value (68, 69, 75, 85), the returned array is `["00", "101", "100", "01"]`.

## Parameters

| Name | Type | Description |
|---|---|---|
| `tree` | `TreeNode` | The root of the binary tree. |

## Returns

`String[]` — the root-to-leaf path encodings (`0` = left, `1` = right), one per leaf, ordered by the value stored in each leaf.

## Constraints

- Leaves will not store duplicate values.
- Values stored in leaves will be between 0 and 255, inclusive.
- The trees will have a height of at most 1,024 nodes.
- The tree will have more than one node.

## Examples

**1.** Leaves 68, 85, 75, 69 are at paths `"00"`, `"01"`, `"100"`, `"101"`; sorted by leaf value they give the result below.

```
tree = {3, 73, 68, x, x, 85, x, x, 8, 77, 75, x, x, 69, x, x, x}
returns ["00", "101", "100", "01"]
```

**2.** The only leaf is to the left of the root.

```
tree = {1, 2, x, x, x}
returns ["0"]
```

**3.** The only leaf is to the right of the root.

```
tree = {1, x, 2, x, x}
returns ["1"]
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
