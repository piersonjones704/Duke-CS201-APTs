# APT: Increasing

## Class

```java
public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        // TODO: fill in code here
        return numbers;
    }
}
```

## Problem Statement

Given an array of integers `numbers`, return a strictly increasing subsequence that starts with the first element of `numbers`.

The returned array begins with the first element of `numbers`. After that, an element from `numbers` is always included if it is larger than the previous element in the resulting array. The result must be a subsequence of `numbers` (same relative order) and strictly increasing.

Note that this is a greedy rule, not the longest increasing subsequence problem.

## Parameters

| Name | Type | Description |
|---|---|---|
| `numbers` | `int[]` | The array of integers to build the subsequence from. |

## Returns

`int[]` — the strictly increasing subsequence, starting with `numbers[0]`, built by always taking the next element that is larger than the last one included.

## Constraints

- `numbers` will have at most 50 elements, with values between 0 and 999 (inclusive), possibly with repeats.

## Examples

| `numbers` | Returns | Explanation |
|---|---|---|
| `[1, 2, 3]` | `[1, 2, 3]` | Already strictly increasing, so the same values are returned. |
| `[2, 0, 1]` | `[2]` | Always starts with 2, and no later element is greater than 2. |
| `[2, 2, 5, 1, 3, 4, 6]` | `[2, 5, 6]` | After 2, the next larger value is 5, then 6. The longest increasing subsequence (`[2, 3, 4, 6]`) is not what's wanted. |

---

This work is copyright © Brandon Fain and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
