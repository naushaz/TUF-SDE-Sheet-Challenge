

    // public int longestConsecutive(int[] nums) {
    //     Arrays.sort(nums);
    //     int count =1;
    //     for(int i=0;i<nums.length-1;i++){
    //         if((nums[i]-nums[i+1])==1){
    //             count ++;
    //         }
    //     }
    //     return count;
    // }
    import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) continue; // skip duplicates

            if(nums[i] - nums[i-1] == 1){
                count++;
            } else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}


