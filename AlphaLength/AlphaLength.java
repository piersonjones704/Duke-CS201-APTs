import java.util.*;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> uniwords = new TreeSet<>(Arrays.asList(words));
        ListNode first = new ListNode(0);
        ListNode wordlengths = first;
        for (String word : uniwords) {
            wordlengths.next = new ListNode(word.length());
            wordlengths = wordlengths.next;
        }        
        return first.next;
    }
}