import java.util.*;
public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        ArrayList<Integer> nums = new ArrayList<>();
        int current_num = 0;
        for (int num : numbers) {
            if (num > current_num) {
                nums.add(num);
                current_num = num;
            }
        }
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}