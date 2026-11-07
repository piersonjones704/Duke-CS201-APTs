# APT SortedFreqs

## Class

```java
public class SortedFreqs {
    public int[] freqs(String[] data) {
        // fill in code here
    }
}
```

## Problem Statement

Determine how frequently each unique string occurs in `data` and return those frequencies as an array. The array has one entry per unique string, ordered by the alphabetical (lexicographic) order of the strings: the first entry is how many times the alphabetically first word occurs, and the last entry is how many times the alphabetically last word occurs.

For example, with:

```
{"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"}
```

the array returned is `{3,1,2,2}`: "apple" occurs 3 times, "banana" once, and "cherry" and "pear" twice each.

## Parameters

| Name | Type | Description |
|---|---|---|
| `data` | `String[]` | The strings to count (may contain duplicates). |

## Returns

`int[]` — the number of occurrences of each unique string, in alphabetical order of the strings.

## Constraints

- `data` will contain at most 50 elements.
- Each element of `data` will contain at most 50 characters, all lowercase.

## Examples

**1.** The example given above.

```
data = {"apple", "pear", "cherry", "apple", "cherry", "pear", "apple", "banana"}
returns {3,1,2,2}
```

**2.**

```
data = {"a", "b", "c", "d"}
returns {1,1,1,1}
```

**3.**

```
data = {"a", "a", "a"}
returns {3}
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
