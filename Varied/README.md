# APT: Varied

## Class

```java
public class Varied {
    public String[] variedStrings(String[] words) {
        // TODO: fill in code here
        return words;
    }
}
```

## Problem Statement

A `String` is **varied** if no character in it appears more than once. Write method `variedStrings` to return a `String[]` containing every varied string from `words`, in the same order they appear in `words`. If there are no varied strings, return an empty array.

## Parameters

| Name | Type | Description |
|---|---|---|
| `words` | `String[]` | The array of strings to check. |

## Returns

`String[]` — the varied strings from `words`, in their original order (empty array if none).

## Constraints

- `words` contains at most 50 strings.
- Each string in `words` contains at most 50 characters, all lowercase letters.

## Examples

| `words` | Returns | Explanation |
|---|---|---|
| `["motor"]` | `[]` | "motor" is not varied because 'o' appears twice. |
| `["name"]` | `["name"]` | Every character in "name" appears only once. |
| `["the","ocean","covers","more",`<br>`"than","seventy","percent","of","earth"]` | `["the","ocean","covers","more",`<br>`"than","of","earth"]` | "seventy" and "percent" are not varied; everything else is returned in order. |

---

This work is copyright © Brandon Fain and is licensed under a [Creative Commons Attribution-Share Alike 3.0 Unported License](http://creativecommons.org/licenses/by-sa/3.0/).
