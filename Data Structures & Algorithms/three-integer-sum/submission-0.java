class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> op=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            int l=i+1;
            int r=nums.length-1;
        
        while(l<r)
        {

            int test=nums[i]+nums[l]+nums[r];
            if(test>0)
            {
                r--;
            }
            else if(test<0)
            {
                l++;
            }
            else {
                op.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
                // Skip duplicates for the LEFT pointer
                while (l < r && nums[l] == nums[l - 1]) {
                    l++;
                }

                // Skip duplicates for the RIGHT pointer
                while (l < r && nums[r] == nums[r + 1]) {
                    r--;
                }

            }
            
            }

        }

        return op;
        
    }
}
