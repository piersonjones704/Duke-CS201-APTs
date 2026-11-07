# ListSum APT

## Class

```java
public class ListSum {
    public int sum(ListNode list, int thresh) {
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

Write method `sum` that returns the sum of the values in `list` that are greater than `thresh`. `list` is a linked list of `int` values.

## Parameters

| Name | Type | Description |
|---|---|---|
| `list` | `ListNode` | The first node of the linked list (may be `null`). |
| `thresh` | `int` | Only values strictly greater than this are summed. |

## Returns

`int` — the sum of the values in `list` that are greater than `thresh` (0 if there are none).

## Constraints

- `list` will contain between 0 and 50 nodes.
- `thresh` will be between -1024 and 1024, inclusive.

## Examples

**1.** The values larger than 4 are 5 and 6.

```
list   = [1,2,3,4,5,6]
thresh = 4
returns 11
```

**2.** There are no nodes in the list.

```
list   = []
thresh = 22
returns 0
```

**3.** All the values are larger than `thresh`.

```
list   = [1,2,3,4,5,6,7,8,9,10]
thresh = -22
returns 55
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
