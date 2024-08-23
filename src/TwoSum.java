import java.util.HashMap;

public class TwoSum {
    public TwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer index = (Integer) map.get(target - nums[i]);
            if (null != index) {
                return new int[]{index, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
