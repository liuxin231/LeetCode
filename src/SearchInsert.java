public class SearchInsert {
    public SearchInsert() {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;
        searchInsert(nums, target);
    }
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }

        }
        return nums.length;
    }
}
