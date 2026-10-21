public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        // int match = 1;
        int match = 0;
        if (a1 == null && a2 == null) return 1;
        if (a1 == null || a2 == null) return 0;
        if (a1.info != a2.info) return 0;
        match = equal(a1.next, a2.next);
        if (match == 1) return 1;
        else return 0;
    }
}