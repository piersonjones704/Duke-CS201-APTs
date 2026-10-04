import java.util.*;

public class Varied {
    public String[] variedStrings(String[] words) {
        ArrayList<String> variedstrings = new ArrayList<>();
        for (String word : words) {
            char letter = '0';
            int count = 0;
            int repeatednums = 0;
            Map<Character, Integer> chars = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                letter = word.charAt(i);
                if (chars.get(letter) == null) {
                    count ++;
                    chars.put(letter, count);
                }
                else {
                    repeatednums ++;
                    break;
                }
            }
            if (repeatednums < 1) {
                variedstrings.add(word);
            }
        }
        String[] stringarray = variedstrings.toArray(new String[0]);
        return stringarray;
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}