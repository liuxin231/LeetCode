public class RemoveElement {
    public RemoveElement() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        removeElement(nums, val);
    }
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1, change;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
            } else {
                change = nums[left];
                nums[left] = nums[right];
                nums[right] = change;
                right--;
            }
        }
        return left;
    }
}
