# MergeLists APT

## Class

```java
public class MergeLists {
    public ListNode weave(ListNode a, ListNode b) {
        // replace statement below with code you write
        return null;
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

Write method `weave` that takes two lists with the same number of nodes and weaves them together, alternating one node from list `a` and one node from list `b`, and returns the woven list.

The woven list always starts with the first node of `a`, then takes the next from `b`, and keeps alternating. The last value in the returned list is always the last value of `b`.

For example, if `a = [1,3,5,7]` and `b = [2,4,6,8]`, then `weave(a, b)` returns `[1,2,3,4,5,6,7,8]`.

You can create new nodes or weave together the existing nodes.

## Parameters

| Name | Type | Description |
|---|---|---|
| `a` | `ListNode` | The first node of the first list. |
| `b` | `ListNode` | The first node of the second list (same length as `a`). |

## Returns

`ListNode` — the first node of the woven list, alternating nodes from `a` and `b`, starting with `a`.

## Constraints

- Both lists contain the same number of nodes, between 1 and 30.

## Examples

```
a = [1]
b = [2]
returns [1,2]
```

```
a = [4,2,1]
b = [10,20,30]
returns [4,10,2,20,1,30]
```

```
a = [1,1,1,1,1,1,1]
b = [2,2,2,2,2,2,2]
returns [1,2,1,2,1,2,1,2,1,2,1,2,1,2]
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
