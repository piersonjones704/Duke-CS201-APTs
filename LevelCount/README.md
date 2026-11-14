# LevelCount APT

## Class

```java
public class LevelCount {
    public int count(TreeNode t, int level) {
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

Write method `count` that returns the number of nodes in the tree at the level given by `level`. The root is at level 0, the root's children are at level 1, and in general a node's level is one more than its parent's level.

Special cases:

- An empty tree has zero nodes at any level.
- When `level` is 0, there is always exactly one node at that level: the root (of a tree or a subtree).

Hint: you can find the number of nodes at some level below you by asking your children for the number of nodes at a level one closer to them.

## Parameters

| Name | Type | Description |
|---|---|---|
| `t` | `TreeNode` | The root of the binary tree (may be `null`). |
| `level` | `int` | The level to count nodes at (the root is level 0). |

## Returns

`int` — the number of nodes at the given level of the tree.

## Constraints

- The trees will have at most 1,024 nodes.
- The trees will have a height of at most 1,024.

## Examples

**1.** There are two nodes at level 1, the children of the root.

```
t     = {1, 2, x, x, 3, x, x}
level = 1
returns 2
```

**2.** There are no nodes in an empty tree, regardless of `level`.

```
t     = {x}
level = 4
returns 0
```

**3.** Nodes 3, 4, and 6 are at level 2 (the root is level 0).

```
t     = {1, 2, 3, x, x, 4, x, x, 5, x, 6, x, x}
level = 2
returns 3
```

**4.** This is a full binary tree of height 6, so there are 32 nodes at level 5.

```
t = {1, 2, 3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
              4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
           3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
              4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
        2, 3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
              4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
           3, 4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x,
              4, 5, 6, x, x, 7, x, x, 8, 9, x, x, 10, x, x}
level = 5
returns 32
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
