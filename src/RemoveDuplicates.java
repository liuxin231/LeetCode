public class RemoveDuplicates {
    public RemoveDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1, change = 0;
        while (left <= right) {
            if (left > 0) {
                if (nums[left] == nums[left - 1]) {
                    change = nums[left];
                    for (int i = left + 1; i <= right; i++) {
                        nums[i - 1] = nums[i];
                    }
                    nums[right] = change;
                    right--;
                    left--;
                }
            }
            left++;
        }
        return left;
    }
}
