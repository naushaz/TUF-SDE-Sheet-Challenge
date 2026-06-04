class Solution {
    public int findDuplicate(int[] nums) {

         // get size
        int n = nums.length;
        // sort array in-place
        Arrays.sort(nums);
        // scan adjacent pairs
        for (int i = 0; i < n - 1; i++) {
            // return when a duplicate is found
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        // fallback if no duplicate found
        return -1;
    }
}