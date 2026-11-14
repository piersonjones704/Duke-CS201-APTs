# TreeCount APT

## Class

```java
public class TreeCount {
    public int count(TreeNode tree) {
        // replace with working code
        return 0;
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

Write a method that returns the number of nodes in a binary tree.

## Parameters

| Name | Type | Description |
|---|---|---|
| `tree` | `TreeNode` | The root of the binary tree (may be `null`). |

## Returns

`int` — the number of nodes in the tree (0 for an empty tree).

## Constraints

- The trees will have at most 1,024 nodes.
- The trees will have a height of at most 1,024.

## Examples

**1.** There are 6 nodes in the tree.

```
tree = {8, 4, x, 6, x, x, 12, 10, x, x, 15, x, x}
returns 6
```

**2.**

```
tree = {1, x, x}
returns 1
```

**3.** An empty tree has no nodes.

```
tree = {x}
returns 0
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
