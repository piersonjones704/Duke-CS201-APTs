# List2Long APT

## Class

```java
public class List2Long {
    public long convert(ListNode list) {
        // write code here
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

Given a linked list of single-digit numbers, return a `long` whose digits are in the same order as the digits in the linked list.

For example, the list `1 -> 3 -> 0 -> 5` should return `1305`.

Hint: building a number digit by digit can be done by multiplying the value so far by 10 and adding the next digit (e.g., `31` -> `31*10 + 2 = 312` -> `312*10 + 5 = 3125`).

## Parameters

| Name | Type | Description |
|---|---|---|
| `list` | `ListNode` | The first node of a linked list of single digits. |

## Returns

`long` — the number formed by the digits of the list, in order.

## Constraints

- `list` contains between 1 and 20 nodes.
- The first node will not contain 0; all nodes contain values between 0 and 9, inclusive.
- The values in the linked list will represent a valid `long`.

## Examples

| `list` | Returns |
|---|---|
| `[4,1,0,2,0]` | `41020` |
| `[1,2,3,4,5]` | `12345` |
| `[1,1,2,2,3,3,4,4,5,5]` | `1122334455` |
| `[5]` | `5` |

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
