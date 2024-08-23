import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] re = new int[nums.length + 1];
        for (int a : nums) {
            if (a > 0 && a < re.length) {
                re[a] = a;
            }
        }
        for (int b = 1; b < re.length; b++) {
            if (re[b] == 0) {
                return b;
            }
        }
        return re.length;
    }
}
public class FirstMissingPositive {

    public FirstMissingPositive() {
        firstMissingPositive(new int[]{1});
    }

    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        int[] new_nums = new int[nums.length + 1];
        for (int i: nums) {
            if (i > 0 && i < new_nums.length) {
                new_nums[i] = 1;
            }
        }

        for (int i = 1; i < new_nums.length; i++) {
            if (new_nums[i] == 0) {
                return i;
            }
        }
        return new_nums.length;








//        int[] a = new int[6];
//        a[2147483647] = 0;
//        System.out.println(a);
//        return 0;
//        System.out.println(nums.length);
//        int[] re = new int[nums.length + 1];
//        System.out.println(re[1]);
//        for (int a : nums) {
//            if (a > 0 && a < re.length) {
//                re[a] = a;
//                System.out.println("re[" + a + "]: " + a);
//            }
//        }
//        for (int b = 1; b < re.length; b++) {
//            if (re[b] == 0) {
//                return b;
//            }
//        }
//        return re.length;
//        if (nums.length == 0) {
//            return 1;
//        }
//        int result = 0;
//        int max = 1;
//        for(int i = 0; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        int[] test = new int[max + 1];
//        return result;
//        System.out.println(test[1]);


//        ArrayList list = new ArrayList<>(max);
//        for(int i = 0; i <= max; i++) {
//            list.add(i, 0);
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                list.set(nums[i] - 1, 1);
//            }
//        }
//
//        for(int i = 0; i < list.size(); i++) {
//            if ((int)list.get(i) == 0) {
//                if (result == 0 || i < result) {
//                    result = i + 1;
//                }
//            }
//        }
    }
}
