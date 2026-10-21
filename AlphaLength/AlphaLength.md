# AlphaLength APT

## Class

```java
public class AlphaLength {
    public ListNode create(String[] words) {
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

Write method `create` that builds a linked list whose values are the lengths of the unique strings in `words`, taken in alphabetical order.

For example, if `words = ["dog", "cat", "yak", "cow", "cat", "dog"]`, the unique strings in alphabetical order are `["cat", "cow", "dog", "yak"]`, so the method returns the linked list `[3,3,3,3]`.

Hint: to sort a `String[] list`, call `Arrays.sort(list)`, which sorts `list` in place.

## Parameters

| Name | Type | Description |
|---|---|---|
| `words` | `String[]` | The strings to process (may contain duplicates). |

## Returns

`ListNode` — the first node of a linked list containing the length of each unique string in `words`, in alphabetical order of the strings.

## Constraints

- `words` will contain between 1 and 40 strings.
- All strings consist of lowercase letters.
- Each string contains between 1 and 25 letters, inclusive.

## Examples

**1.** The strings are unique; in alphabetical order they are `"at", "bat", "expat", "spat"`.

```
words = ["bat", "at", "spat", "expat"]
returns [2,3,5,4]
```

**2.** In alphabetical order the unique strings are `"be", "bee", "can", "done", "help", "what"`.

```
words = ["help", "help", "what", "what", "can", "be", "bee", "done"]
returns [2,3,3,4,4,4]
```

**3.**

```
words = ["zero", "nothing", "infinity", "zero", "zero", "zero", "all"]
returns [3,8,7,4]
```

**4.**

```
words = ["a", "a", "a", "a", "a", "a"]
returns [1]
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
