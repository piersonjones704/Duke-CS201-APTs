# ListsEqual APT

## Class

```java
public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
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

Write method `equal` that returns `1` if its two linked list parameters are equal, and `0` if they are not.

Two linked lists are equal if they have the same number of nodes and the node in the i-th position of `a1` contains the same value as the i-th node of `a2`.

## Parameters

| Name | Type | Description |
|---|---|---|
| `a1` | `ListNode` | The first node of the first linked list (may be `null`). |
| `a2` | `ListNode` | The first node of the second linked list (may be `null`). |

## Returns

`int` — `1` if the lists are equal, `0` otherwise.

## Constraints

- `a1` will contain between 0 and 20 nodes.
- `a2` will contain between 0 and 20 nodes.

## Examples

**1.** The lists contain the same values in the same order.

```
a1 = [1,2,3]
a2 = [1,2,3]
returns 1
```

**2.** The lists contain different values.

```
a1 = [5]
a2 = [6]
returns 0
```

**3.** `a2` has one more node than `a1`.

```
a1 = [6,5,3,8]
a2 = [6,5,3,8,9]
returns 0
```

**4.**

```
a1 = [5,4,3,2,1]
a2 = [5,4,3,2,1]
returns 1
```

**5.** One list is empty and the other is not.

```
a1 = []
a2 = [1,2,3,4,3,2,1]
returns 0
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
