public class ListSum {
    public int sum(ListNode list, int thresh) {
        if (list == null) return 0;
        int afterMe = sum(list.next,thresh);
        int me = list.info;
        if (me <= thresh) {
            me = 0;
            // return afterMe;
        }
        return me + afterMe;
    }
}