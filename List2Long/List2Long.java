public class List2Long {
    public long convert(ListNode list) {
        long value = 0L;
        while(list != null) {
            value = value * 10 + (list.info);
            list = list.next;
        }
    return value; 
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}