# APT SortByFreqs

## Class

```java
public class SortByFreqs {
    public String[] sort(String[] data) {
        // fill in code here
    }
}
```

## Problem Statement

Given an array of strings, determine how frequently each string occurs and return an array of the unique strings sorted by frequency. The first element is the most frequently occurring string and the last is the least frequently occurring. Ties are broken by listing the tied strings in lexicographic (alphabetical) order. The returned array contains one occurrence of each unique string.

For example, with:

```
{"apple", "pear", "cherry", "apple", "pear", "apple", "banana"}
```

the array returned is `{"apple", "pear", "banana", "cherry"}`: "apple" occurs 3 times, "pear" twice, and the other strings once each, so "banana" and "cherry" are listed alphabetically.

## Parameters

| Name | Type | Description |
|---|---|---|
| `data` | `String[]` | The strings to count (may contain duplicates). |

## Returns

`String[]` — each unique string once, ordered from most to least frequent, with ties in alphabetical order.

## Constraints

- `data` will contain at most 500 elements.
- Each element of `data` will contain at most 50 characters, all lowercase.

## Examples

**1.** The example given above.

```
data = {"apple", "pear", "cherry", "apple", "pear", "apple", "banana"}
returns {"apple", "pear", "banana", "cherry"}
```

**2.**

```
data = {"a", "b", "c", "d"}
returns {"a", "b", "c", "d"}
```

**3.**

```
data = {"d", "c", "b", "a"}
returns {"a", "b", "c", "d"}
```

**4.**

```
data = {"a", "a", "a"}
returns {"a"}
```

---

This work is copyright © Owen Astrachan and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
