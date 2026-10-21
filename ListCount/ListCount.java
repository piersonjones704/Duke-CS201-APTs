public class ListCount {
    public int count(ListNode list) {
        if (list == null) return 0;
        int count = 0;
        while (list != null) {
            count++; 
            list = list.next;
        }
        return count;   
    }
}