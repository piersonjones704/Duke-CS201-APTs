# EvenCount APT

## Class

```java
public class ListParity {
    public int count(ListNode list) {
        // replace statement below with code you write
        return 0;
    }
}
```

The `ListNode` class is provided when the method is tested:

```java
public class ListNode {
    int info;
    ListNode next;
    ListNode(int x) { info = x; }
    ListNode(int x, ListNode node) { info = x; next = node; }
}
```

In the examples below, a linked list is written as a list of values, so `[1,4,9,12]` represents the list `1 -> 4 -> 9 -> 12`.

## Problem Statement

The first node of a linked list has index 0, the next has index 1, the next index 2, and so on. Write method `count` that returns the sum of the values stored in the nodes with even indexes (0, 2, 4, ...).

An empty (or `null`) list has no nodes, so `count` should return 0 for it.

## Parameters

| Name | Type | Description |
|---|---|---|
| `list` | `ListNode` | The first node of the linked list (may be `null`). |

## Returns

`int` — the sum of the values at even indexes of the list (0 for an empty list).

## Constraints

- `list` will contain between 0 and 50 nodes.
- All values in `list` will be between -1000 and 1000, inclusive.

## Examples

| `list` | Returns | Explanation |
|---|---|---|
| `[1,2,3]` | `4` | 1 + 3 = 4 |
| `[]` | `0` | An empty list has no nodes. |
| `[2,4,6,8]` | `8` | 2 + 6 = 8 |

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
