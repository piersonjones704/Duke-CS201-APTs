# ListCount APT

## Class

```java
public class ListCount {
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

Write method `count` that returns the number of nodes in `list`, a linked list of `int` values.

## Parameters

| Name | Type | Description |
|---|---|---|
| `list` | `ListNode` | The first node of the linked list (may be `null`). |

## Returns

`int` — the number of nodes in the list (0 for an empty list).

## Constraints

- `list` will contain between 0 and 50 nodes.

## Examples

```
list = [1,2,3]
returns 3
```

```
list = []
returns 0
```

```
list = [5,6,8,9]
returns 4
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
