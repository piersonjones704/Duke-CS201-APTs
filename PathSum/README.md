# PathSum APT

## Class

```java
public class PathSum {
    public int hasPath(int target, TreeNode tree) {
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

Write a method that returns `1` if there is a root-to-leaf path whose node values sum to `target`, and `0` if there is no such path.

For example, the tree in examples 3 and 4 below has exactly four root-to-leaf paths, with sums 27, 22, 26, and 18. So a target of 22 returns `1` and a target of 32 returns `0` for that tree.

Special cases:

- An empty tree always returns `0`, regardless of `target`.
- A tree with exactly one node returns `1` if `target` equals the value in that node, and `0` otherwise.

## Parameters

| Name | Type | Description |
|---|---|---|
| `target` | `int` | The sum to look for. |
| `tree` | `TreeNode` | The root of the binary tree (may be `null`). |

## Returns

`int` — `1` if some root-to-leaf path sums to `target`, otherwise `0`.

## Constraints

- The trees will have at most 1,024 nodes.
- The trees will have a height of at most 1,024.

## Examples

**1.** There is a path whose sum is `target`.

```
target = 5
tree   = {5, x, x}
returns 1
```

**2.** There is no path that sums to 4.

```
target = 4
tree   = {5, x, x}
returns 0
```

**3.** The path 5 -> 8 -> 4 -> 1 sums to 18. (The four root-to-leaf sums for this tree are 27, 22, 26, and 18.)

```
target = 18
tree   = {5, 4, 11, 7, x, x, 2, x, x, x, 8, 13, x, x, 4, x, 1, x, x}
returns 1
```

**4.** None of the four root-to-leaf sums (27, 22, 26, 18) equals 20.

```
target = 20
tree   = {5, 4, 11, 7, x, x, 2, x, x, x, 8, 13, x, x, 4, x, 1, x, x}
returns 0
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
