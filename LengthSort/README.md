# SimpleSort APT

## Class

```java
public class LengthSort {
    public String[] rearrange(String[] values) {
        // you write code here and replace statement below
        return null;
    }
}
```

## Problem Statement

Given an array of strings, return an array of the same strings sorted by length, with the shortest strings first and the longest last. You can create a new array or sort the array parameter `values`, but you must return a sorted array containing the same strings that are in `values`.

In the returned array, strings of the same length are sorted in alphabetical order.

## Parameters

| Name | Type | Description |
|---|---|---|
| `values` | `String[]` | The strings to sort. |

## Returns

`String[]` — the same strings, sorted by length (shortest first), with ties broken alphabetically.

## Constraints

- `values` will contain at most 50 strings.
- Each string in `values` will contain at most 50 characters.
- All characters in `values` are lowercase.

## Examples

**1.** "ant" and "dog" both have 3 characters, so they are sorted alphabetically relative to each other.

```
values = ["ant", "batter", "catapult", "dog"]
returns  ["ant", "dog", "batter", "catapult"]
```

**2.**

```
values = ["dog", "ant", "cat"]
returns  ["ant", "cat", "dog"]
```

**3.** The three-letter words come first, then the four-letter, then the six-letter words, each group in alphabetical order.

```
values = ["cat", "bat", "flavor", "yellow", "easy", "code"]
returns  ["bat", "cat", "code", "easy", "flavor", "yellow"]
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
