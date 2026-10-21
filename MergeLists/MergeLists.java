public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        if (a.next == null) {
            a.next = b;
            return a;
        }
        ListNode after = weave(a.next, b.next);
        a.next = b;
        b.next = after;
	    return a;
    }
}