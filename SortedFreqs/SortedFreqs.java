import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        TreeMap<String, Integer> strings = new TreeMap<>();
        for (String s : data) {
            if (strings.get(s) != null) {
                strings.put(s, strings.get(s) + 1);
            }
            if (strings.get(s) == null) {
                strings.put(s, 1);
            } 
        }
        ArrayList<Integer> count = new ArrayList<>();
        for (int value : strings.values()) {
            count.add(value);
        }
        int[] counts = count.stream().mapToInt(i -> i).toArray();
        return counts;
        }
}