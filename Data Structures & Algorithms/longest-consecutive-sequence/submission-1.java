
public class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int incr = 1;
        int seq = 1;

        for(int j = 1; j < nums.length; j++) {

            if(nums[j] == nums[j-1] + 1) {
                incr++;
            }
            else if(nums[j] == nums[j-1]) {
                // duplicate, do nothing
            }
            else {
                incr = 1;
            }

            seq = Math.max(seq, incr);
        }

        return seq;
    }
}