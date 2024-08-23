public class FindMedianSortedArrays {
    public FindMedianSortedArrays() {
        int[] nums1 = new int[]{1, 3, 4, 6, 7};
        int[] nums2 = new int[]{};
        double _result = findMedianSortedArrays(nums1, nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] num = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                num[k++] = nums1[i++];
            } else {
                num[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            num[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            num[k++] = nums2[j++];
        }
        return (num[size / 2] + num[(size - 1) / 2]) / 2.0;
    }
}
